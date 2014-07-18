namespace java com.ambiata.ivory.core.thrift

struct ThriftTombstone {}

union ThriftFactValue {
    1: string s;
    2: i32 i;
    3: i64 l;
    4: double d;
    5: bool b;
    6: ThriftTombstone t;
}

struct ThriftFact {
    1: string entity;
    2: string attribute;
    3: ThriftFactValue value;
    4: optional i32 seconds;
}

struct NamespacedThriftFact {
    1: ThriftFact fact;
    2: string nspace;
    3: i32 yyyyMMdd; // this is a packed int, with a the first 16 bits representing the year, the next 8 the month and the final 8 the day
}

struct PriorityTag {
    1: i16 priority;
    2: binary bytes;
}

struct ThriftParseError {
    1: string line;
    2: string message;
}

enum ThriftDictionaryEncoding {
    BOOLEAN = 0,
    INT = 1,
    LONG = 2,
    DOUBLE = 3,
    STRING = 4,
    STRUCT = 5
}

enum ThriftDictionaryType {
    NUMERICAL = 0,
    CONTINOUS = 1,
    CATEGORICAL = 2,
    BINARY = 3
}

union ThriftDictionaryStructMetaOpts {
    1: bool isOptional;
}

/**
 * NOTE: The current encoding of structs is far from optimal/ideal, and is to avoid an early bump in Dictionary verions.
 * When we decide to make a new version of the dictionary, something like the following would be better.
 *
 * struct IntEncoding {}
 * struct ...Encoding {}
 * struct StringEncoding {}
 * struct StructEncoding {
 *  1:  list<ThriftDictionaryStructMeta> values;
 * }
 * union ThriftDicitonaryEncoding {
 *  1: IntEncoding intEncoding;
 *  2: ...
 *  n: StructEncoding structEncoding;
 * }
 */
struct ThriftDictionaryStructMeta {
    1: string name;
    2: ThriftDictionaryEncoding encoding;
    3: ThriftDictionaryStructMetaOpts opts
}

struct ThriftDictionaryStruct {
    1: list<ThriftDictionaryStructMeta> values;
}

union ThriftDictionaryFeatureValue {
    1: ThriftDictionaryStruct structValue;
}

struct ThriftDictionaryFeatureId {
    1: string ns;
    2: string name;
}

struct ThriftDictionaryFeatureMeta {
    1: ThriftDictionaryEncoding encoding;
    2: ThriftDictionaryType type;
    3: string desc;
    4: list<string> tombstoneValue;
    5: optional ThriftDictionaryFeatureValue value;
}

struct ThriftDictionary {
    1: map<ThriftDictionaryFeatureId, ThriftDictionaryFeatureMeta> meta;
}