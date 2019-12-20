package io.opencaesar.oml.dsl.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOmlLexer extends Lexer {
    public static final int All=49;
    public static final int Vocabulary=16;
    public static final int Entity=36;
    public static final int RULE_INTEGER_STR=77;
    public static final int ColonHyphenMinusGreaterThanSign=46;
    public static final int EqualsSignGreaterThanSign=57;
    public static final int Ci=60;
    public static final int Asymmetric=11;
    public static final int RULE_ABBREV_IRI=84;
    public static final int Irreflexive=9;
    public static final int LessThanSignHyphenMinusColon=48;
    public static final int MaxLength=17;
    public static final int Aspect=33;
    public static final int Restricts=20;
    public static final int CircumflexAccentCircumflexAccent=58;
    public static final int LeftParenthesis=65;
    public static final int RULE_DECIMAL_STR=78;
    public static final int Inverse=31;
    public static final int Ampersand=64;
    public static final int To=62;
    public static final int Reflexive=19;
    public static final int Extends=29;
    public static final int RightSquareBracket=71;
    public static final int Concept=27;
    public static final int RULE_ID=83;
    public static final int RULE_BOOLEAN_STR=74;
    public static final int RightParenthesis=66;
    public static final int RULE_DIGIT=75;
    public static final int Structured=14;
    public static final int Range=39;
    public static final int ColonGreaterThanSign=55;
    public static final int Functional=13;
    public static final int Some=42;
    public static final int Min=52;
    public static final int RULE_UNSIGNED_INTEGER_STR=76;
    public static final int LessThanSignHyphenMinus=56;
    public static final int RULE_ML_COMMENT=86;
    public static final int LeftSquareBracket=70;
    public static final int Rule=41;
    public static final int Domain=35;
    public static final int RULE_DOUBLE_STR=79;
    public static final int Key=50;
    public static final int ColonLessThanSignHyphenMinus=47;
    public static final int RULE_ALPHA=85;
    public static final int Description=8;
    public static final int Uses=43;
    public static final int Max=51;
    public static final int MaxExclusive=4;
    public static final int RULE_IRI=82;
    public static final int MinExclusive=6;
    public static final int Transitive=15;
    public static final int RULE_STRING=81;
    public static final int MaxInclusive=5;
    public static final int RULE_SEPARATOR=80;
    public static final int Scalar=38;
    public static final int With=44;
    public static final int RULE_SL_COMMENT=87;
    public static final int MinInclusive=7;
    public static final int Includes=23;
    public static final int Enumerated=12;
    public static final int Comma=67;
    public static final int Relation=26;
    public static final int As=59;
    public static final int Language=24;
    public static final int Ri=61;
    public static final int Colon=68;
    public static final int RightCurlyBracket=73;
    public static final int Structure=21;
    public static final int EOF=-1;
    public static final int Property=25;
    public static final int Pattern=32;
    public static final int HyphenMinusGreaterThanSignColon=45;
    public static final int RULE_WS=88;
    public static final int Bundle=34;
    public static final int LeftCurlyBracket=72;
    public static final int MinLength=18;
    public static final int From=40;
    public static final int Annotation=10;
    public static final int CommercialAt=69;
    public static final int Ref=53;
    public static final int Exactly=28;
    public static final int Length=37;
    public static final int DollarSign=63;
    public static final int Forward=30;
    public static final int Symmetric=22;
    public static final int HyphenMinusGreaterThanSign=54;

    // delegates
    // delegators

    public InternalOmlLexer() {;} 
    public InternalOmlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalOmlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalOmlLexer.g"; }

    // $ANTLR start "MaxExclusive"
    public final void mMaxExclusive() throws RecognitionException {
        try {
            int _type = MaxExclusive;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:14:14: ( 'maxExclusive' )
            // InternalOmlLexer.g:14:16: 'maxExclusive'
            {
            match("maxExclusive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MaxExclusive"

    // $ANTLR start "MaxInclusive"
    public final void mMaxInclusive() throws RecognitionException {
        try {
            int _type = MaxInclusive;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:16:14: ( 'maxInclusive' )
            // InternalOmlLexer.g:16:16: 'maxInclusive'
            {
            match("maxInclusive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MaxInclusive"

    // $ANTLR start "MinExclusive"
    public final void mMinExclusive() throws RecognitionException {
        try {
            int _type = MinExclusive;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:18:14: ( 'minExclusive' )
            // InternalOmlLexer.g:18:16: 'minExclusive'
            {
            match("minExclusive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MinExclusive"

    // $ANTLR start "MinInclusive"
    public final void mMinInclusive() throws RecognitionException {
        try {
            int _type = MinInclusive;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:20:14: ( 'minInclusive' )
            // InternalOmlLexer.g:20:16: 'minInclusive'
            {
            match("minInclusive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MinInclusive"

    // $ANTLR start "Description"
    public final void mDescription() throws RecognitionException {
        try {
            int _type = Description;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:22:13: ( 'description' )
            // InternalOmlLexer.g:22:15: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Description"

    // $ANTLR start "Irreflexive"
    public final void mIrreflexive() throws RecognitionException {
        try {
            int _type = Irreflexive;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:24:13: ( 'irreflexive' )
            // InternalOmlLexer.g:24:15: 'irreflexive'
            {
            match("irreflexive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Irreflexive"

    // $ANTLR start "Annotation"
    public final void mAnnotation() throws RecognitionException {
        try {
            int _type = Annotation;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:26:12: ( 'annotation' )
            // InternalOmlLexer.g:26:14: 'annotation'
            {
            match("annotation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Annotation"

    // $ANTLR start "Asymmetric"
    public final void mAsymmetric() throws RecognitionException {
        try {
            int _type = Asymmetric;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:28:12: ( 'asymmetric' )
            // InternalOmlLexer.g:28:14: 'asymmetric'
            {
            match("asymmetric"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asymmetric"

    // $ANTLR start "Enumerated"
    public final void mEnumerated() throws RecognitionException {
        try {
            int _type = Enumerated;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:30:12: ( 'enumerated' )
            // InternalOmlLexer.g:30:14: 'enumerated'
            {
            match("enumerated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Enumerated"

    // $ANTLR start "Functional"
    public final void mFunctional() throws RecognitionException {
        try {
            int _type = Functional;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:32:12: ( 'functional' )
            // InternalOmlLexer.g:32:14: 'functional'
            {
            match("functional"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Functional"

    // $ANTLR start "Structured"
    public final void mStructured() throws RecognitionException {
        try {
            int _type = Structured;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:34:12: ( 'structured' )
            // InternalOmlLexer.g:34:14: 'structured'
            {
            match("structured"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Structured"

    // $ANTLR start "Transitive"
    public final void mTransitive() throws RecognitionException {
        try {
            int _type = Transitive;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:36:12: ( 'transitive' )
            // InternalOmlLexer.g:36:14: 'transitive'
            {
            match("transitive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Transitive"

    // $ANTLR start "Vocabulary"
    public final void mVocabulary() throws RecognitionException {
        try {
            int _type = Vocabulary;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:38:12: ( 'vocabulary' )
            // InternalOmlLexer.g:38:14: 'vocabulary'
            {
            match("vocabulary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Vocabulary"

    // $ANTLR start "MaxLength"
    public final void mMaxLength() throws RecognitionException {
        try {
            int _type = MaxLength;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:40:11: ( 'maxLength' )
            // InternalOmlLexer.g:40:13: 'maxLength'
            {
            match("maxLength"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MaxLength"

    // $ANTLR start "MinLength"
    public final void mMinLength() throws RecognitionException {
        try {
            int _type = MinLength;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:42:11: ( 'minLength' )
            // InternalOmlLexer.g:42:13: 'minLength'
            {
            match("minLength"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MinLength"

    // $ANTLR start "Reflexive"
    public final void mReflexive() throws RecognitionException {
        try {
            int _type = Reflexive;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:44:11: ( 'reflexive' )
            // InternalOmlLexer.g:44:13: 'reflexive'
            {
            match("reflexive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Reflexive"

    // $ANTLR start "Restricts"
    public final void mRestricts() throws RecognitionException {
        try {
            int _type = Restricts;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:46:11: ( 'restricts' )
            // InternalOmlLexer.g:46:13: 'restricts'
            {
            match("restricts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Restricts"

    // $ANTLR start "Structure"
    public final void mStructure() throws RecognitionException {
        try {
            int _type = Structure;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:48:11: ( 'structure' )
            // InternalOmlLexer.g:48:13: 'structure'
            {
            match("structure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Structure"

    // $ANTLR start "Symmetric"
    public final void mSymmetric() throws RecognitionException {
        try {
            int _type = Symmetric;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:50:11: ( 'symmetric' )
            // InternalOmlLexer.g:50:13: 'symmetric'
            {
            match("symmetric"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Symmetric"

    // $ANTLR start "Includes"
    public final void mIncludes() throws RecognitionException {
        try {
            int _type = Includes;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:52:10: ( 'includes' )
            // InternalOmlLexer.g:52:12: 'includes'
            {
            match("includes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Includes"

    // $ANTLR start "Language"
    public final void mLanguage() throws RecognitionException {
        try {
            int _type = Language;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:54:10: ( 'language' )
            // InternalOmlLexer.g:54:12: 'language'
            {
            match("language"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Language"

    // $ANTLR start "Property"
    public final void mProperty() throws RecognitionException {
        try {
            int _type = Property;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:56:10: ( 'property' )
            // InternalOmlLexer.g:56:12: 'property'
            {
            match("property"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Property"

    // $ANTLR start "Relation"
    public final void mRelation() throws RecognitionException {
        try {
            int _type = Relation;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:58:10: ( 'relation' )
            // InternalOmlLexer.g:58:12: 'relation'
            {
            match("relation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Relation"

    // $ANTLR start "Concept"
    public final void mConcept() throws RecognitionException {
        try {
            int _type = Concept;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:60:9: ( 'concept' )
            // InternalOmlLexer.g:60:11: 'concept'
            {
            match("concept"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Concept"

    // $ANTLR start "Exactly"
    public final void mExactly() throws RecognitionException {
        try {
            int _type = Exactly;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:62:9: ( 'exactly' )
            // InternalOmlLexer.g:62:11: 'exactly'
            {
            match("exactly"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Exactly"

    // $ANTLR start "Extends"
    public final void mExtends() throws RecognitionException {
        try {
            int _type = Extends;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:64:9: ( 'extends' )
            // InternalOmlLexer.g:64:11: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Extends"

    // $ANTLR start "Forward"
    public final void mForward() throws RecognitionException {
        try {
            int _type = Forward;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:66:9: ( 'forward' )
            // InternalOmlLexer.g:66:11: 'forward'
            {
            match("forward"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Forward"

    // $ANTLR start "Inverse"
    public final void mInverse() throws RecognitionException {
        try {
            int _type = Inverse;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:68:9: ( 'inverse' )
            // InternalOmlLexer.g:68:11: 'inverse'
            {
            match("inverse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Inverse"

    // $ANTLR start "Pattern"
    public final void mPattern() throws RecognitionException {
        try {
            int _type = Pattern;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:70:9: ( 'pattern' )
            // InternalOmlLexer.g:70:11: 'pattern'
            {
            match("pattern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pattern"

    // $ANTLR start "Aspect"
    public final void mAspect() throws RecognitionException {
        try {
            int _type = Aspect;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:72:8: ( 'aspect' )
            // InternalOmlLexer.g:72:10: 'aspect'
            {
            match("aspect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Aspect"

    // $ANTLR start "Bundle"
    public final void mBundle() throws RecognitionException {
        try {
            int _type = Bundle;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:74:8: ( 'bundle' )
            // InternalOmlLexer.g:74:10: 'bundle'
            {
            match("bundle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bundle"

    // $ANTLR start "Domain"
    public final void mDomain() throws RecognitionException {
        try {
            int _type = Domain;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:76:8: ( 'domain' )
            // InternalOmlLexer.g:76:10: 'domain'
            {
            match("domain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Domain"

    // $ANTLR start "Entity"
    public final void mEntity() throws RecognitionException {
        try {
            int _type = Entity;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:78:8: ( 'entity' )
            // InternalOmlLexer.g:78:10: 'entity'
            {
            match("entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Entity"

    // $ANTLR start "Length"
    public final void mLength() throws RecognitionException {
        try {
            int _type = Length;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:80:8: ( 'length' )
            // InternalOmlLexer.g:80:10: 'length'
            {
            match("length"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Length"

    // $ANTLR start "Scalar"
    public final void mScalar() throws RecognitionException {
        try {
            int _type = Scalar;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:82:8: ( 'scalar' )
            // InternalOmlLexer.g:82:10: 'scalar'
            {
            match("scalar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Scalar"

    // $ANTLR start "Range"
    public final void mRange() throws RecognitionException {
        try {
            int _type = Range;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:84:7: ( 'range' )
            // InternalOmlLexer.g:84:9: 'range'
            {
            match("range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Range"

    // $ANTLR start "From"
    public final void mFrom() throws RecognitionException {
        try {
            int _type = From;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:86:6: ( 'from' )
            // InternalOmlLexer.g:86:8: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "From"

    // $ANTLR start "Rule"
    public final void mRule() throws RecognitionException {
        try {
            int _type = Rule;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:88:6: ( 'rule' )
            // InternalOmlLexer.g:88:8: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Rule"

    // $ANTLR start "Some"
    public final void mSome() throws RecognitionException {
        try {
            int _type = Some;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:90:6: ( 'some' )
            // InternalOmlLexer.g:90:8: 'some'
            {
            match("some"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Some"

    // $ANTLR start "Uses"
    public final void mUses() throws RecognitionException {
        try {
            int _type = Uses;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:92:6: ( 'uses' )
            // InternalOmlLexer.g:92:8: 'uses'
            {
            match("uses"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Uses"

    // $ANTLR start "With"
    public final void mWith() throws RecognitionException {
        try {
            int _type = With;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:94:6: ( 'with' )
            // InternalOmlLexer.g:94:8: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "With"

    // $ANTLR start "HyphenMinusGreaterThanSignColon"
    public final void mHyphenMinusGreaterThanSignColon() throws RecognitionException {
        try {
            int _type = HyphenMinusGreaterThanSignColon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:96:33: ( '->:' )
            // InternalOmlLexer.g:96:35: '->:'
            {
            match("->:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusGreaterThanSignColon"

    // $ANTLR start "ColonHyphenMinusGreaterThanSign"
    public final void mColonHyphenMinusGreaterThanSign() throws RecognitionException {
        try {
            int _type = ColonHyphenMinusGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:98:33: ( ':->' )
            // InternalOmlLexer.g:98:35: ':->'
            {
            match(":->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ColonHyphenMinusGreaterThanSign"

    // $ANTLR start "ColonLessThanSignHyphenMinus"
    public final void mColonLessThanSignHyphenMinus() throws RecognitionException {
        try {
            int _type = ColonLessThanSignHyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:100:30: ( ':<-' )
            // InternalOmlLexer.g:100:32: ':<-'
            {
            match(":<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ColonLessThanSignHyphenMinus"

    // $ANTLR start "LessThanSignHyphenMinusColon"
    public final void mLessThanSignHyphenMinusColon() throws RecognitionException {
        try {
            int _type = LessThanSignHyphenMinusColon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:102:30: ( '<-:' )
            // InternalOmlLexer.g:102:32: '<-:'
            {
            match("<-:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignHyphenMinusColon"

    // $ANTLR start "All"
    public final void mAll() throws RecognitionException {
        try {
            int _type = All;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:104:5: ( 'all' )
            // InternalOmlLexer.g:104:7: 'all'
            {
            match("all"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "All"

    // $ANTLR start "Key"
    public final void mKey() throws RecognitionException {
        try {
            int _type = Key;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:106:5: ( 'key' )
            // InternalOmlLexer.g:106:7: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Key"

    // $ANTLR start "Max"
    public final void mMax() throws RecognitionException {
        try {
            int _type = Max;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:108:5: ( 'max' )
            // InternalOmlLexer.g:108:7: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Max"

    // $ANTLR start "Min"
    public final void mMin() throws RecognitionException {
        try {
            int _type = Min;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:110:5: ( 'min' )
            // InternalOmlLexer.g:110:7: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Min"

    // $ANTLR start "Ref"
    public final void mRef() throws RecognitionException {
        try {
            int _type = Ref;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:112:5: ( 'ref' )
            // InternalOmlLexer.g:112:7: 'ref'
            {
            match("ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ref"

    // $ANTLR start "HyphenMinusGreaterThanSign"
    public final void mHyphenMinusGreaterThanSign() throws RecognitionException {
        try {
            int _type = HyphenMinusGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:114:28: ( '->' )
            // InternalOmlLexer.g:114:30: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinusGreaterThanSign"

    // $ANTLR start "ColonGreaterThanSign"
    public final void mColonGreaterThanSign() throws RecognitionException {
        try {
            int _type = ColonGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:116:22: ( ':>' )
            // InternalOmlLexer.g:116:24: ':>'
            {
            match(":>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ColonGreaterThanSign"

    // $ANTLR start "LessThanSignHyphenMinus"
    public final void mLessThanSignHyphenMinus() throws RecognitionException {
        try {
            int _type = LessThanSignHyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:118:25: ( '<-' )
            // InternalOmlLexer.g:118:27: '<-'
            {
            match("<-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignHyphenMinus"

    // $ANTLR start "EqualsSignGreaterThanSign"
    public final void mEqualsSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = EqualsSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:120:27: ( '=>' )
            // InternalOmlLexer.g:120:29: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignGreaterThanSign"

    // $ANTLR start "CircumflexAccentCircumflexAccent"
    public final void mCircumflexAccentCircumflexAccent() throws RecognitionException {
        try {
            int _type = CircumflexAccentCircumflexAccent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:122:34: ( '^^' )
            // InternalOmlLexer.g:122:36: '^^'
            {
            match("^^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CircumflexAccentCircumflexAccent"

    // $ANTLR start "As"
    public final void mAs() throws RecognitionException {
        try {
            int _type = As;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:124:4: ( 'as' )
            // InternalOmlLexer.g:124:6: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "As"

    // $ANTLR start "Ci"
    public final void mCi() throws RecognitionException {
        try {
            int _type = Ci;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:126:4: ( 'ci' )
            // InternalOmlLexer.g:126:6: 'ci'
            {
            match("ci"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ci"

    // $ANTLR start "Ri"
    public final void mRi() throws RecognitionException {
        try {
            int _type = Ri;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:128:4: ( 'ri' )
            // InternalOmlLexer.g:128:6: 'ri'
            {
            match("ri"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ri"

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:130:4: ( 'to' )
            // InternalOmlLexer.g:130:6: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "To"

    // $ANTLR start "DollarSign"
    public final void mDollarSign() throws RecognitionException {
        try {
            int _type = DollarSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:132:12: ( '$' )
            // InternalOmlLexer.g:132:14: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DollarSign"

    // $ANTLR start "Ampersand"
    public final void mAmpersand() throws RecognitionException {
        try {
            int _type = Ampersand;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:134:11: ( '&' )
            // InternalOmlLexer.g:134:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Ampersand"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:136:17: ( '(' )
            // InternalOmlLexer.g:136:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:138:18: ( ')' )
            // InternalOmlLexer.g:138:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:140:7: ( ',' )
            // InternalOmlLexer.g:140:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:142:7: ( ':' )
            // InternalOmlLexer.g:142:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "CommercialAt"
    public final void mCommercialAt() throws RecognitionException {
        try {
            int _type = CommercialAt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:144:14: ( '@' )
            // InternalOmlLexer.g:144:16: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CommercialAt"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:146:19: ( '[' )
            // InternalOmlLexer.g:146:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:148:20: ( ']' )
            // InternalOmlLexer.g:148:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:150:18: ( '{' )
            // InternalOmlLexer.g:150:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:152:19: ( '}' )
            // InternalOmlLexer.g:152:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_BOOLEAN_STR"
    public final void mRULE_BOOLEAN_STR() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN_STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:154:18: ( ( 'false' | 'true' ) )
            // InternalOmlLexer.g:154:20: ( 'false' | 'true' )
            {
            // InternalOmlLexer.g:154:20: ( 'false' | 'true' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='f') ) {
                alt1=1;
            }
            else if ( (LA1_0=='t') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalOmlLexer.g:154:21: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 2 :
                    // InternalOmlLexer.g:154:29: 'true'
                    {
                    match("true"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN_STR"

    // $ANTLR start "RULE_UNSIGNED_INTEGER_STR"
    public final void mRULE_UNSIGNED_INTEGER_STR() throws RecognitionException {
        try {
            int _type = RULE_UNSIGNED_INTEGER_STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:156:27: ( ( RULE_DIGIT )+ )
            // InternalOmlLexer.g:156:29: ( RULE_DIGIT )+
            {
            // InternalOmlLexer.g:156:29: ( RULE_DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalOmlLexer.g:156:29: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSIGNED_INTEGER_STR"

    // $ANTLR start "RULE_INTEGER_STR"
    public final void mRULE_INTEGER_STR() throws RecognitionException {
        try {
            int _type = RULE_INTEGER_STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:158:18: ( ( '+' | '-' )? ( RULE_DIGIT )+ )
            // InternalOmlLexer.g:158:20: ( '+' | '-' )? ( RULE_DIGIT )+
            {
            // InternalOmlLexer.g:158:20: ( '+' | '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+'||LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalOmlLexer.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalOmlLexer.g:158:31: ( RULE_DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOmlLexer.g:158:31: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_STR"

    // $ANTLR start "RULE_DECIMAL_STR"
    public final void mRULE_DECIMAL_STR() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL_STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:160:18: ( ( '+' | '-' )? ( ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )* )? | '.' ( RULE_DIGIT )+ ) )
            // InternalOmlLexer.g:160:20: ( '+' | '-' )? ( ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )* )? | '.' ( RULE_DIGIT )+ )
            {
            // InternalOmlLexer.g:160:20: ( '+' | '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='+'||LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalOmlLexer.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalOmlLexer.g:160:31: ( ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )* )? | '.' ( RULE_DIGIT )+ )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                alt10=1;
            }
            else if ( (LA10_0=='.') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalOmlLexer.g:160:32: ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )* )?
                    {
                    // InternalOmlLexer.g:160:32: ( RULE_DIGIT )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalOmlLexer.g:160:32: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    // InternalOmlLexer.g:160:44: ( '.' ( RULE_DIGIT )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='.') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalOmlLexer.g:160:45: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalOmlLexer.g:160:49: ( RULE_DIGIT )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalOmlLexer.g:160:49: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalOmlLexer.g:160:63: '.' ( RULE_DIGIT )+
                    {
                    match('.'); 
                    // InternalOmlLexer.g:160:67: ( RULE_DIGIT )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalOmlLexer.g:160:67: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_STR"

    // $ANTLR start "RULE_DOUBLE_STR"
    public final void mRULE_DOUBLE_STR() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:162:17: ( ( '+' | '-' )? ( ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )* )? | '.' ( RULE_DIGIT )+ ) ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )? )
            // InternalOmlLexer.g:162:19: ( '+' | '-' )? ( ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )* )? | '.' ( RULE_DIGIT )+ ) ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )?
            {
            // InternalOmlLexer.g:162:19: ( '+' | '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='+'||LA11_0=='-') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOmlLexer.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // InternalOmlLexer.g:162:30: ( ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )* )? | '.' ( RULE_DIGIT )+ )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                alt16=1;
            }
            else if ( (LA16_0=='.') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalOmlLexer.g:162:31: ( RULE_DIGIT )+ ( '.' ( RULE_DIGIT )* )?
                    {
                    // InternalOmlLexer.g:162:31: ( RULE_DIGIT )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalOmlLexer.g:162:31: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    // InternalOmlLexer.g:162:43: ( '.' ( RULE_DIGIT )* )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='.') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalOmlLexer.g:162:44: '.' ( RULE_DIGIT )*
                            {
                            match('.'); 
                            // InternalOmlLexer.g:162:48: ( RULE_DIGIT )*
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // InternalOmlLexer.g:162:48: RULE_DIGIT
                            	    {
                            	    mRULE_DIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop13;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalOmlLexer.g:162:62: '.' ( RULE_DIGIT )+
                    {
                    match('.'); 
                    // InternalOmlLexer.g:162:66: ( RULE_DIGIT )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalOmlLexer.g:162:66: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }
                    break;

            }

            // InternalOmlLexer.g:162:79: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='E'||LA19_0=='e') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalOmlLexer.g:162:80: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalOmlLexer.g:162:90: ( '+' | '-' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='+'||LA17_0=='-') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalOmlLexer.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // InternalOmlLexer.g:162:101: ( RULE_DIGIT )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalOmlLexer.g:162:101: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_STR"

    // $ANTLR start "RULE_SEPARATOR"
    public final void mRULE_SEPARATOR() throws RecognitionException {
        try {
            int _type = RULE_SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:164:16: ( ( '#' | '/' ) )
            // InternalOmlLexer.g:164:18: ( '#' | '/' )
            {
            if ( input.LA(1)=='#'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEPARATOR"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:166:13: ( ( '\"' (~ ( ( '\"' | '\\\\' ) ) | '\\\\' . )* '\"' | '\\'' (~ ( ( '\\'' | '\\\\' ) ) | '\\\\' . )* '\\'' | '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' ) )
            // InternalOmlLexer.g:166:15: ( '\"' (~ ( ( '\"' | '\\\\' ) ) | '\\\\' . )* '\"' | '\\'' (~ ( ( '\\'' | '\\\\' ) ) | '\\\\' . )* '\\'' | '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            {
            // InternalOmlLexer.g:166:15: ( '\"' (~ ( ( '\"' | '\\\\' ) ) | '\\\\' . )* '\"' | '\\'' (~ ( ( '\\'' | '\\\\' ) ) | '\\\\' . )* '\\'' | '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' )
            int alt24=4;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\"') ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1=='\"') ) {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3=='\"') ) {
                        alt24=4;
                    }
                    else {
                        alt24=1;}
                }
                else if ( ((LA24_1>='\u0000' && LA24_1<='!')||(LA24_1>='#' && LA24_1<='\uFFFF')) ) {
                    alt24=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0=='\'') ) {
                int LA24_2 = input.LA(2);

                if ( (LA24_2=='\'') ) {
                    int LA24_5 = input.LA(3);

                    if ( (LA24_5=='\'') ) {
                        alt24=3;
                    }
                    else {
                        alt24=2;}
                }
                else if ( ((LA24_2>='\u0000' && LA24_2<='&')||(LA24_2>='(' && LA24_2<='\uFFFF')) ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalOmlLexer.g:166:16: '\"' (~ ( ( '\"' | '\\\\' ) ) | '\\\\' . )* '\"'
                    {
                    match('\"'); 
                    // InternalOmlLexer.g:166:20: (~ ( ( '\"' | '\\\\' ) ) | '\\\\' . )*
                    loop20:
                    do {
                        int alt20=3;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>='\u0000' && LA20_0<='!')||(LA20_0>='#' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFF')) ) {
                            alt20=1;
                        }
                        else if ( (LA20_0=='\\') ) {
                            alt20=2;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalOmlLexer.g:166:21: ~ ( ( '\"' | '\\\\' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOmlLexer.g:166:35: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalOmlLexer.g:166:48: '\\'' (~ ( ( '\\'' | '\\\\' ) ) | '\\\\' . )* '\\''
                    {
                    match('\''); 
                    // InternalOmlLexer.g:166:53: (~ ( ( '\\'' | '\\\\' ) ) | '\\\\' . )*
                    loop21:
                    do {
                        int alt21=3;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>='\u0000' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\uFFFF')) ) {
                            alt21=1;
                        }
                        else if ( (LA21_0=='\\') ) {
                            alt21=2;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalOmlLexer.g:166:54: ~ ( ( '\\'' | '\\\\' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOmlLexer.g:166:69: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;
                case 3 :
                    // InternalOmlLexer.g:166:83: '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\''
                    {
                    match("'''"); 

                    // InternalOmlLexer.g:166:92: ( options {greedy=false; } : . )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0=='\'') ) {
                            int LA22_1 = input.LA(2);

                            if ( (LA22_1=='\'') ) {
                                int LA22_3 = input.LA(3);

                                if ( (LA22_3=='\'') ) {
                                    alt22=2;
                                }
                                else if ( ((LA22_3>='\u0000' && LA22_3<='&')||(LA22_3>='(' && LA22_3<='\uFFFF')) ) {
                                    alt22=1;
                                }


                            }
                            else if ( ((LA22_1>='\u0000' && LA22_1<='&')||(LA22_1>='(' && LA22_1<='\uFFFF')) ) {
                                alt22=1;
                            }


                        }
                        else if ( ((LA22_0>='\u0000' && LA22_0<='&')||(LA22_0>='(' && LA22_0<='\uFFFF')) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalOmlLexer.g:166:120: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    match("'''"); 


                    }
                    break;
                case 4 :
                    // InternalOmlLexer.g:166:133: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
                    {
                    match("\"\"\""); 

                    // InternalOmlLexer.g:166:139: ( options {greedy=false; } : . )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0=='\"') ) {
                            int LA23_1 = input.LA(2);

                            if ( (LA23_1=='\"') ) {
                                int LA23_3 = input.LA(3);

                                if ( (LA23_3=='\"') ) {
                                    alt23=2;
                                }
                                else if ( ((LA23_3>='\u0000' && LA23_3<='!')||(LA23_3>='#' && LA23_3<='\uFFFF')) ) {
                                    alt23=1;
                                }


                            }
                            else if ( ((LA23_1>='\u0000' && LA23_1<='!')||(LA23_1>='#' && LA23_1<='\uFFFF')) ) {
                                alt23=1;
                            }


                        }
                        else if ( ((LA23_0>='\u0000' && LA23_0<='!')||(LA23_0>='#' && LA23_0<='\uFFFF')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalOmlLexer.g:166:167: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    match("\"\"\""); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_IRI"
    public final void mRULE_IRI() throws RecognitionException {
        try {
            int _type = RULE_IRI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:168:10: ( '<' (~ ( ( '>' | ' ' ) ) )* '>' )
            // InternalOmlLexer.g:168:12: '<' (~ ( ( '>' | ' ' ) ) )* '>'
            {
            match('<'); 
            // InternalOmlLexer.g:168:16: (~ ( ( '>' | ' ' ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\u0000' && LA25_0<='\u001F')||(LA25_0>='!' && LA25_0<='=')||(LA25_0>='?' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalOmlLexer.g:168:16: ~ ( ( '>' | ' ' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='=')||(input.LA(1)>='?' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IRI"

    // $ANTLR start "RULE_ABBREV_IRI"
    public final void mRULE_ABBREV_IRI() throws RecognitionException {
        try {
            int _type = RULE_ABBREV_IRI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:170:17: ( RULE_ID ':' RULE_ID )
            // InternalOmlLexer.g:170:19: RULE_ID ':' RULE_ID
            {
            mRULE_ID(); 
            match(':'); 
            mRULE_ID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ABBREV_IRI"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:172:9: ( ( '^' )? ( RULE_ALPHA | RULE_DIGIT | '_' ) ( RULE_ALPHA | RULE_DIGIT | '_' | '-' | '.' )* )
            // InternalOmlLexer.g:172:11: ( '^' )? ( RULE_ALPHA | RULE_DIGIT | '_' ) ( RULE_ALPHA | RULE_DIGIT | '_' | '-' | '.' )*
            {
            // InternalOmlLexer.g:172:11: ( '^' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='^') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalOmlLexer.g:172:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalOmlLexer.g:172:44: ( RULE_ALPHA | RULE_DIGIT | '_' | '-' | '.' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='-' && LA27_0<='.')||(LA27_0>='0' && LA27_0<='9')||(LA27_0>='A' && LA27_0<='Z')||LA27_0=='_'||(LA27_0>='a' && LA27_0<='z')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalOmlLexer.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:174:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalOmlLexer.g:174:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalOmlLexer.g:174:24: ( options {greedy=false; } : . )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0=='*') ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1=='/') ) {
                        alt28=2;
                    }
                    else if ( ((LA28_1>='\u0000' && LA28_1<='.')||(LA28_1>='0' && LA28_1<='\uFFFF')) ) {
                        alt28=1;
                    }


                }
                else if ( ((LA28_0>='\u0000' && LA28_0<=')')||(LA28_0>='+' && LA28_0<='\uFFFF')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalOmlLexer.g:174:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:176:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalOmlLexer.g:176:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalOmlLexer.g:176:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='\u0000' && LA29_0<='\t')||(LA29_0>='\u000B' && LA29_0<='\f')||(LA29_0>='\u000E' && LA29_0<='\uFFFF')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalOmlLexer.g:176:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalOmlLexer.g:176:40: ( ( '\\r' )? '\\n' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='\n'||LA31_0=='\r') ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalOmlLexer.g:176:41: ( '\\r' )? '\\n'
                    {
                    // InternalOmlLexer.g:176:41: ( '\\r' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0=='\r') ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalOmlLexer.g:176:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOmlLexer.g:178:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalOmlLexer.g:178:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalOmlLexer.g:178:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='\t' && LA32_0<='\n')||LA32_0=='\r'||LA32_0==' ') ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalOmlLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ALPHA"
    public final void mRULE_ALPHA() throws RecognitionException {
        try {
            // InternalOmlLexer.g:180:21: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalOmlLexer.g:180:23: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALPHA"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalOmlLexer.g:182:21: ( '0' .. '9' )
            // InternalOmlLexer.g:182:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    public void mTokens() throws RecognitionException {
        // InternalOmlLexer.g:1:8: ( MaxExclusive | MaxInclusive | MinExclusive | MinInclusive | Description | Irreflexive | Annotation | Asymmetric | Enumerated | Functional | Structured | Transitive | Vocabulary | MaxLength | MinLength | Reflexive | Restricts | Structure | Symmetric | Includes | Language | Property | Relation | Concept | Exactly | Extends | Forward | Inverse | Pattern | Aspect | Bundle | Domain | Entity | Length | Scalar | Range | From | Rule | Some | Uses | With | HyphenMinusGreaterThanSignColon | ColonHyphenMinusGreaterThanSign | ColonLessThanSignHyphenMinus | LessThanSignHyphenMinusColon | All | Key | Max | Min | Ref | HyphenMinusGreaterThanSign | ColonGreaterThanSign | LessThanSignHyphenMinus | EqualsSignGreaterThanSign | CircumflexAccentCircumflexAccent | As | Ci | Ri | To | DollarSign | Ampersand | LeftParenthesis | RightParenthesis | Comma | Colon | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_BOOLEAN_STR | RULE_UNSIGNED_INTEGER_STR | RULE_INTEGER_STR | RULE_DECIMAL_STR | RULE_DOUBLE_STR | RULE_SEPARATOR | RULE_STRING | RULE_IRI | RULE_ABBREV_IRI | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt33=83;
        alt33 = dfa33.predict(input);
        switch (alt33) {
            case 1 :
                // InternalOmlLexer.g:1:10: MaxExclusive
                {
                mMaxExclusive(); 

                }
                break;
            case 2 :
                // InternalOmlLexer.g:1:23: MaxInclusive
                {
                mMaxInclusive(); 

                }
                break;
            case 3 :
                // InternalOmlLexer.g:1:36: MinExclusive
                {
                mMinExclusive(); 

                }
                break;
            case 4 :
                // InternalOmlLexer.g:1:49: MinInclusive
                {
                mMinInclusive(); 

                }
                break;
            case 5 :
                // InternalOmlLexer.g:1:62: Description
                {
                mDescription(); 

                }
                break;
            case 6 :
                // InternalOmlLexer.g:1:74: Irreflexive
                {
                mIrreflexive(); 

                }
                break;
            case 7 :
                // InternalOmlLexer.g:1:86: Annotation
                {
                mAnnotation(); 

                }
                break;
            case 8 :
                // InternalOmlLexer.g:1:97: Asymmetric
                {
                mAsymmetric(); 

                }
                break;
            case 9 :
                // InternalOmlLexer.g:1:108: Enumerated
                {
                mEnumerated(); 

                }
                break;
            case 10 :
                // InternalOmlLexer.g:1:119: Functional
                {
                mFunctional(); 

                }
                break;
            case 11 :
                // InternalOmlLexer.g:1:130: Structured
                {
                mStructured(); 

                }
                break;
            case 12 :
                // InternalOmlLexer.g:1:141: Transitive
                {
                mTransitive(); 

                }
                break;
            case 13 :
                // InternalOmlLexer.g:1:152: Vocabulary
                {
                mVocabulary(); 

                }
                break;
            case 14 :
                // InternalOmlLexer.g:1:163: MaxLength
                {
                mMaxLength(); 

                }
                break;
            case 15 :
                // InternalOmlLexer.g:1:173: MinLength
                {
                mMinLength(); 

                }
                break;
            case 16 :
                // InternalOmlLexer.g:1:183: Reflexive
                {
                mReflexive(); 

                }
                break;
            case 17 :
                // InternalOmlLexer.g:1:193: Restricts
                {
                mRestricts(); 

                }
                break;
            case 18 :
                // InternalOmlLexer.g:1:203: Structure
                {
                mStructure(); 

                }
                break;
            case 19 :
                // InternalOmlLexer.g:1:213: Symmetric
                {
                mSymmetric(); 

                }
                break;
            case 20 :
                // InternalOmlLexer.g:1:223: Includes
                {
                mIncludes(); 

                }
                break;
            case 21 :
                // InternalOmlLexer.g:1:232: Language
                {
                mLanguage(); 

                }
                break;
            case 22 :
                // InternalOmlLexer.g:1:241: Property
                {
                mProperty(); 

                }
                break;
            case 23 :
                // InternalOmlLexer.g:1:250: Relation
                {
                mRelation(); 

                }
                break;
            case 24 :
                // InternalOmlLexer.g:1:259: Concept
                {
                mConcept(); 

                }
                break;
            case 25 :
                // InternalOmlLexer.g:1:267: Exactly
                {
                mExactly(); 

                }
                break;
            case 26 :
                // InternalOmlLexer.g:1:275: Extends
                {
                mExtends(); 

                }
                break;
            case 27 :
                // InternalOmlLexer.g:1:283: Forward
                {
                mForward(); 

                }
                break;
            case 28 :
                // InternalOmlLexer.g:1:291: Inverse
                {
                mInverse(); 

                }
                break;
            case 29 :
                // InternalOmlLexer.g:1:299: Pattern
                {
                mPattern(); 

                }
                break;
            case 30 :
                // InternalOmlLexer.g:1:307: Aspect
                {
                mAspect(); 

                }
                break;
            case 31 :
                // InternalOmlLexer.g:1:314: Bundle
                {
                mBundle(); 

                }
                break;
            case 32 :
                // InternalOmlLexer.g:1:321: Domain
                {
                mDomain(); 

                }
                break;
            case 33 :
                // InternalOmlLexer.g:1:328: Entity
                {
                mEntity(); 

                }
                break;
            case 34 :
                // InternalOmlLexer.g:1:335: Length
                {
                mLength(); 

                }
                break;
            case 35 :
                // InternalOmlLexer.g:1:342: Scalar
                {
                mScalar(); 

                }
                break;
            case 36 :
                // InternalOmlLexer.g:1:349: Range
                {
                mRange(); 

                }
                break;
            case 37 :
                // InternalOmlLexer.g:1:355: From
                {
                mFrom(); 

                }
                break;
            case 38 :
                // InternalOmlLexer.g:1:360: Rule
                {
                mRule(); 

                }
                break;
            case 39 :
                // InternalOmlLexer.g:1:365: Some
                {
                mSome(); 

                }
                break;
            case 40 :
                // InternalOmlLexer.g:1:370: Uses
                {
                mUses(); 

                }
                break;
            case 41 :
                // InternalOmlLexer.g:1:375: With
                {
                mWith(); 

                }
                break;
            case 42 :
                // InternalOmlLexer.g:1:380: HyphenMinusGreaterThanSignColon
                {
                mHyphenMinusGreaterThanSignColon(); 

                }
                break;
            case 43 :
                // InternalOmlLexer.g:1:412: ColonHyphenMinusGreaterThanSign
                {
                mColonHyphenMinusGreaterThanSign(); 

                }
                break;
            case 44 :
                // InternalOmlLexer.g:1:444: ColonLessThanSignHyphenMinus
                {
                mColonLessThanSignHyphenMinus(); 

                }
                break;
            case 45 :
                // InternalOmlLexer.g:1:473: LessThanSignHyphenMinusColon
                {
                mLessThanSignHyphenMinusColon(); 

                }
                break;
            case 46 :
                // InternalOmlLexer.g:1:502: All
                {
                mAll(); 

                }
                break;
            case 47 :
                // InternalOmlLexer.g:1:506: Key
                {
                mKey(); 

                }
                break;
            case 48 :
                // InternalOmlLexer.g:1:510: Max
                {
                mMax(); 

                }
                break;
            case 49 :
                // InternalOmlLexer.g:1:514: Min
                {
                mMin(); 

                }
                break;
            case 50 :
                // InternalOmlLexer.g:1:518: Ref
                {
                mRef(); 

                }
                break;
            case 51 :
                // InternalOmlLexer.g:1:522: HyphenMinusGreaterThanSign
                {
                mHyphenMinusGreaterThanSign(); 

                }
                break;
            case 52 :
                // InternalOmlLexer.g:1:549: ColonGreaterThanSign
                {
                mColonGreaterThanSign(); 

                }
                break;
            case 53 :
                // InternalOmlLexer.g:1:570: LessThanSignHyphenMinus
                {
                mLessThanSignHyphenMinus(); 

                }
                break;
            case 54 :
                // InternalOmlLexer.g:1:594: EqualsSignGreaterThanSign
                {
                mEqualsSignGreaterThanSign(); 

                }
                break;
            case 55 :
                // InternalOmlLexer.g:1:620: CircumflexAccentCircumflexAccent
                {
                mCircumflexAccentCircumflexAccent(); 

                }
                break;
            case 56 :
                // InternalOmlLexer.g:1:653: As
                {
                mAs(); 

                }
                break;
            case 57 :
                // InternalOmlLexer.g:1:656: Ci
                {
                mCi(); 

                }
                break;
            case 58 :
                // InternalOmlLexer.g:1:659: Ri
                {
                mRi(); 

                }
                break;
            case 59 :
                // InternalOmlLexer.g:1:662: To
                {
                mTo(); 

                }
                break;
            case 60 :
                // InternalOmlLexer.g:1:665: DollarSign
                {
                mDollarSign(); 

                }
                break;
            case 61 :
                // InternalOmlLexer.g:1:676: Ampersand
                {
                mAmpersand(); 

                }
                break;
            case 62 :
                // InternalOmlLexer.g:1:686: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 63 :
                // InternalOmlLexer.g:1:702: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 64 :
                // InternalOmlLexer.g:1:719: Comma
                {
                mComma(); 

                }
                break;
            case 65 :
                // InternalOmlLexer.g:1:725: Colon
                {
                mColon(); 

                }
                break;
            case 66 :
                // InternalOmlLexer.g:1:731: CommercialAt
                {
                mCommercialAt(); 

                }
                break;
            case 67 :
                // InternalOmlLexer.g:1:744: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 68 :
                // InternalOmlLexer.g:1:762: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 69 :
                // InternalOmlLexer.g:1:781: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 70 :
                // InternalOmlLexer.g:1:798: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 71 :
                // InternalOmlLexer.g:1:816: RULE_BOOLEAN_STR
                {
                mRULE_BOOLEAN_STR(); 

                }
                break;
            case 72 :
                // InternalOmlLexer.g:1:833: RULE_UNSIGNED_INTEGER_STR
                {
                mRULE_UNSIGNED_INTEGER_STR(); 

                }
                break;
            case 73 :
                // InternalOmlLexer.g:1:859: RULE_INTEGER_STR
                {
                mRULE_INTEGER_STR(); 

                }
                break;
            case 74 :
                // InternalOmlLexer.g:1:876: RULE_DECIMAL_STR
                {
                mRULE_DECIMAL_STR(); 

                }
                break;
            case 75 :
                // InternalOmlLexer.g:1:893: RULE_DOUBLE_STR
                {
                mRULE_DOUBLE_STR(); 

                }
                break;
            case 76 :
                // InternalOmlLexer.g:1:909: RULE_SEPARATOR
                {
                mRULE_SEPARATOR(); 

                }
                break;
            case 77 :
                // InternalOmlLexer.g:1:924: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 78 :
                // InternalOmlLexer.g:1:936: RULE_IRI
                {
                mRULE_IRI(); 

                }
                break;
            case 79 :
                // InternalOmlLexer.g:1:945: RULE_ABBREV_IRI
                {
                mRULE_ABBREV_IRI(); 

                }
                break;
            case 80 :
                // InternalOmlLexer.g:1:961: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 81 :
                // InternalOmlLexer.g:1:969: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 82 :
                // InternalOmlLexer.g:1:985: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 83 :
                // InternalOmlLexer.g:1:1001: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA33_eotS =
        "\1\uffff\20\54\1\uffff\1\124\1\uffff\1\54\14\uffff\1\132\2\uffff\1\47\1\uffff\1\54\2\uffff\3\54\2\uffff\5\54\1\152\14\54\1\172\4\54\1\u0081\5\54\1\u0087\3\54\1\u008c\1\u008d\4\uffff\1\u0091\1\uffff\1\54\1\uffff\1\u0094\1\uffff\1\132\1\54\1\u0094\2\uffff\1\u009a\1\u009e\10\54\1\uffff\1\u00a7\16\54\1\uffff\1\54\1\u00b8\4\54\1\uffff\5\54\1\uffff\3\54\3\uffff\1\u0094\1\uffff\1\u00c6\1\uffff\1\u00c7\1\u0094\1\uffff\1\54\1\u008f\3\54\1\uffff\3\54\1\uffff\10\54\1\uffff\6\54\1\u00dc\4\54\1\u00e1\1\54\1\u00e3\2\54\1\uffff\3\54\1\u00e9\6\54\1\u00f0\1\u00f1\1\u0094\2\uffff\24\54\1\uffff\1\u00e3\3\54\1\uffff\1\54\1\uffff\4\54\1\u010e\1\uffff\6\54\2\uffff\7\54\1\u011c\5\54\1\u0122\1\54\1\u0124\6\54\1\u012b\5\54\1\uffff\1\54\1\u0132\3\54\1\u0136\7\54\1\uffff\2\54\1\u0140\2\54\1\uffff\1\54\1\uffff\1\u0144\1\u0145\1\54\1\u0147\2\54\1\uffff\6\54\1\uffff\1\54\1\u0151\1\u0152\1\uffff\10\54\1\u015b\1\uffff\3\54\2\uffff\1\54\1\uffff\6\54\1\u0166\1\u0167\1\u0168\2\uffff\2\54\1\u016b\2\54\1\u016e\2\54\1\uffff\4\54\1\u0176\1\u0177\2\54\1\u017a\1\u017b\3\uffff\2\54\1\uffff\2\54\1\uffff\2\54\1\u0182\1\u0183\1\u0184\1\u0185\1\u0186\2\uffff\1\u0187\1\u0188\2\uffff\4\54\1\u018d\1\u018e\7\uffff\1\u018f\1\u0190\1\u0191\1\u0192\6\uffff";
    static final String DFA33_eofS =
        "\u0193\uffff";
    static final String DFA33_minS =
        "\1\11\20\55\1\56\1\55\1\0\1\55\1\uffff\1\60\12\uffff\1\55\1\56\1\60\1\52\1\uffff\1\55\2\uffff\3\55\2\uffff\41\55\1\72\1\56\4\uffff\1\0\1\uffff\1\55\1\uffff\1\55\1\uffff\1\55\1\53\1\60\2\uffff\12\55\1\uffff\17\55\1\uffff\6\55\1\uffff\5\55\1\uffff\3\55\3\uffff\1\60\1\uffff\1\0\1\uffff\2\55\1\uffff\5\55\1\uffff\3\55\1\uffff\10\55\1\uffff\20\55\1\uffff\14\55\1\60\2\uffff\24\55\1\uffff\4\55\1\uffff\1\55\1\uffff\5\55\1\uffff\6\55\2\uffff\34\55\1\uffff\15\55\1\uffff\5\55\1\uffff\1\55\1\uffff\6\55\1\uffff\6\55\1\uffff\3\55\1\uffff\11\55\1\uffff\3\55\2\uffff\1\55\1\uffff\11\55\2\uffff\10\55\1\uffff\12\55\3\uffff\2\55\1\uffff\2\55\1\uffff\7\55\2\uffff\2\55\2\uffff\6\55\7\uffff\4\55\6\uffff";
    static final String DFA33_maxS =
        "\1\175\20\172\2\76\1\uffff\1\172\1\uffff\1\172\12\uffff\1\172\2\71\1\57\1\uffff\1\172\2\uffff\3\172\2\uffff\41\172\1\72\1\145\4\uffff\1\uffff\1\uffff\1\172\1\uffff\1\172\1\uffff\2\172\1\145\2\uffff\12\172\1\uffff\17\172\1\uffff\6\172\1\uffff\5\172\1\uffff\3\172\3\uffff\1\145\1\uffff\1\uffff\1\uffff\2\172\1\uffff\5\172\1\uffff\3\172\1\uffff\10\172\1\uffff\20\172\1\uffff\14\172\1\145\2\uffff\24\172\1\uffff\4\172\1\uffff\1\172\1\uffff\5\172\1\uffff\6\172\2\uffff\34\172\1\uffff\15\172\1\uffff\5\172\1\uffff\1\172\1\uffff\6\172\1\uffff\6\172\1\uffff\3\172\1\uffff\11\172\1\uffff\3\172\2\uffff\1\172\1\uffff\11\172\2\uffff\10\172\1\uffff\12\172\3\uffff\2\172\1\uffff\2\172\1\uffff\7\172\2\uffff\2\172\2\uffff\6\172\7\uffff\4\172\6\uffff";
    static final String DFA33_acceptS =
        "\25\uffff\1\66\1\uffff\1\74\1\75\1\76\1\77\1\100\1\102\1\103\1\104\1\105\1\106\4\uffff\1\115\1\uffff\1\114\1\123\3\uffff\1\120\1\117\43\uffff\1\53\1\54\1\64\1\101\1\uffff\1\116\1\uffff\1\67\1\uffff\1\110\3\uffff\1\121\1\122\12\uffff\1\70\17\uffff\1\73\6\uffff\1\72\5\uffff\1\71\3\uffff\1\52\1\63\1\111\1\uffff\1\113\1\uffff\1\65\2\uffff\1\112\5\uffff\1\60\3\uffff\1\61\10\uffff\1\56\20\uffff\1\62\15\uffff\1\55\1\57\24\uffff\1\45\4\uffff\1\47\1\uffff\1\107\5\uffff\1\46\6\uffff\1\50\1\51\34\uffff\1\44\15\uffff\1\40\5\uffff\1\36\1\uffff\1\41\6\uffff\1\43\6\uffff\1\42\3\uffff\1\37\11\uffff\1\34\3\uffff\1\31\1\32\1\uffff\1\33\11\uffff\1\35\1\30\10\uffff\1\24\12\uffff\1\27\1\25\1\26\2\uffff\1\16\2\uffff\1\17\7\uffff\1\22\1\23\2\uffff\1\20\1\21\6\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\4\uffff\1\5\1\6\1\1\1\2\1\3\1\4";
    static final String DFA33_specialS =
        "\23\uffff\1\2\101\uffff\1\1\72\uffff\1\0\u0102\uffff}>";
    static final String[] DFA33_transitionS = {
            "\2\50\2\uffff\1\50\22\uffff\1\50\1\uffff\1\45\1\47\1\27\1\uffff\1\30\1\45\1\31\1\32\1\uffff\1\42\1\33\1\21\1\43\1\44\12\41\1\22\1\uffff\1\23\1\25\2\uffff\1\34\32\46\1\35\1\uffff\1\36\1\26\1\46\1\uffff\1\4\1\16\1\15\1\2\1\5\1\6\2\46\1\3\1\46\1\24\1\13\1\1\2\46\1\14\1\46\1\12\1\7\1\10\1\17\1\11\1\20\3\46\1\37\1\uffff\1\40",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\1\51\7\53\1\52\21\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\56\11\53\1\57\13\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\61\3\53\1\60\10\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\64\1\53\1\62\4\53\1\63\7\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\65\11\53\1\66\2\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\1\72\15\53\1\70\2\53\1\71\2\53\1\67\5\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\75\13\53\1\76\4\53\1\73\4\53\1\74\1\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\100\2\53\1\77\10\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\101\13\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\1\103\3\53\1\102\3\53\1\105\13\53\1\104\5\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\1\106\3\53\1\107\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\1\111\20\53\1\110\10\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\113\5\53\1\112\13\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\114\5\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\115\7\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\116\21\53",
            "\1\43\1\uffff\12\120\4\uffff\1\117",
            "\1\121\16\uffff\1\122\1\uffff\1\123",
            "\40\126\1\uffff\14\126\1\125\uffd2\126",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\127\25\53",
            "",
            "\12\46\7\uffff\32\46\3\uffff\1\130\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\53\1\131\1\uffff\12\133\1\55\6\uffff\4\53\1\134\25\53\4\uffff\1\53\1\uffff\4\53\1\134\25\53",
            "\1\43\1\uffff\12\120",
            "\12\135",
            "\1\136\4\uffff\1\137",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\27\53\1\140\2\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\141\14\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\142\7\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\14\53\1\143\15\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\144\10\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\145\22\53\1\146\4\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\147\14\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\17\53\1\151\10\53\1\150\1\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\153\16\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\155\1\154\5\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\1\156\22\53\1\157\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\160\14\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\161\10\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\162\13\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\163\16\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\164\10\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\14\53\1\165\15\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\1\166\31\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\14\53\1\167\15\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\1\170\23\53\1\171\5\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\173\27\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\5\53\1\174\5\53\1\176\6\53\1\175\7\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\177\14\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u0080\16\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u0082\14\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u0083\14\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\u0084\13\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u0085\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u0086\14\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u0088\14\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u0089\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u008a\6\53",
            "\1\u008b",
            "\1\u008e\1\uffff\12\120\13\uffff\1\u008f\37\uffff\1\u008f",
            "",
            "",
            "",
            "",
            "\40\126\1\uffff\31\126\1\u0090\uffc5\126",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\30\53\1\u0092\1\53",
            "",
            "\2\53\1\uffff\12\u0093\1\55\6\uffff\4\53\1\134\25\53\4\uffff\1\53\1\uffff\4\53\1\134\25\53",
            "",
            "\1\53\1\131\1\uffff\12\133\1\55\6\uffff\4\53\1\134\25\53\4\uffff\1\53\1\uffff\4\53\1\134\25\53",
            "\1\u008f\1\uffff\1\u0095\1\53\1\uffff\12\u0096\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\135\13\uffff\1\u008f\37\uffff\1\u008f",
            "",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\4\53\1\u0097\3\53\1\u0098\2\53\1\u0099\16\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\4\53\1\u009b\3\53\1\u009c\2\53\1\u009d\16\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\u009f\27\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\1\u00a0\31\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00a1\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u00a2\16\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00a3\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\u00a4\13\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\14\53\1\u00a5\15\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00a6\25\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\14\53\1\u00a8\15\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u00a9\21\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\u00aa\27\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00ab\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\u00ac\27\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\26\53\1\u00ad\3\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\14\53\1\u00ae\15\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u00af\7\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\u00b0\5\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\14\53\1\u00b1\15\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u00b2\16\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00b3\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u00b4\14\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00b5\25\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\1\u00b6\31\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u00b7\16\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u00b9\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\1\u00ba\31\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\6\53\1\u00bb\23\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00bc\25\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\6\53\1\u00bd\23\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\6\53\1\u00be\23\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\17\53\1\u00bf\12\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u00c0\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\u00c1\27\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\3\53\1\u00c2\26\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u00c3\7\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\7\53\1\u00c4\22\53",
            "",
            "",
            "",
            "\12\u00c5\13\uffff\1\u008f\37\uffff\1\u008f",
            "",
            "\40\126\1\uffff\uffdf\126",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\u0093\1\55\6\uffff\4\53\1\134\25\53\4\uffff\1\53\1\uffff\4\53\1\134\25\53",
            "",
            "\2\53\1\uffff\12\u0096\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\u0096\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\27\53\1\u00c8\2\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u00c9\14\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00ca\25\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\27\53\1\u00cb\2\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u00cc\14\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00cd\25\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u00ce\10\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u00cf\21\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\5\53\1\u00d0\24\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\u00d1\5\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u00d2\10\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u00d3\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\14\53\1\u00d4\15\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\u00d5\27\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00d6\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u00d7\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u00d8\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u00d9\14\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u00da\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\1\u00db\31\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00dd\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\u00de\27\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00df\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\1\u00e0\31\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u00e2\7\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\1\53\1\u00e4\30\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00e5\25\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u00e6\10\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u00e7\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00e8\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\u00ea\5\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u00eb\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00ec\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00ed\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00ee\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u00ef\16\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\12\u00c5\13\uffff\1\u008f\37\uffff\1\u008f",
            "",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\u00f2\27\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\u00f3\27\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u00f4\14\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\u00f5\27\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\u00f6\27\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u00f7\14\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u00f8\21\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u00f9\14\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u00fa\16\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\3\53\1\u00fb\26\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u00fc\7\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\1\u00fd\31\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u00fe\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u00ff\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u0100\10\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\30\53\1\u0101\1\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u0102\16\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\3\53\1\u0103\26\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u0104\21\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u0105\10\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u0106\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u0107\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u0108\10\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u0109\21\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\u010a\5\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\27\53\1\u010b\2\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u010c\21\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u010d\21\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\1\u010f\31\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\7\53\1\u0110\22\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u0111\10\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u0112\10\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\17\53\1\u0113\12\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u0114\25\53",
            "",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u0115\16\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u0116\16\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\6\53\1\u0117\23\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u0118\16\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u0119\16\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\6\53\1\u011a\23\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\17\53\1\u011b\12\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u011d\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u011e\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u011f\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u0120\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u0121\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\1\u0123\31\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\30\53\1\u0125\1\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u0126\7\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\u0127\13\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\3\53\1\u0128\26\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\u0129\5\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u012a\10\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u012c\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u012d\16\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u012e\21\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\u012f\27\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\u0130\13\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\6\53\1\u0131\23\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u0133\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u0134\14\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u0135\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\u0137\5\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\u0138\5\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u0139\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\u013a\5\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\24\53\1\u013b\5\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u013c\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u013d\6\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\27\53\1\u013e\2\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u013f\7\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u0141\21\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u0142\10\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u0143\6\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u0146\14\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u0148\10\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u0149\21\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u014a\21\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\1\u014b\31\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\25\53\1\u014c\4\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\23\53\1\u014d\6\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u014e\14\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u014f\25\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\30\53\1\u0150\1\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u0153\7\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u0154\7\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\7\53\1\u0155\22\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u0156\7\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u0157\7\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\7\53\1\u0158\22\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u0159\21\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u015a\21\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\u015c\13\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u015d\21\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u015e\25\53",
            "",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\1\u015f\31\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u0160\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\u0161\27\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\25\53\1\u0162\4\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\21\53\1\u0163\10\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u0164\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\22\53\1\u0165\7\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u0169\21\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u016a\21\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u016c\21\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\10\53\1\u016d\21\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\16\53\1\u016f\13\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\25\53\1\u0170\4\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u0171\14\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\2\53\1\u0172\27\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\3\53\1\u0173\26\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\13\53\1\u0174\16\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\3\53\1\u0175\26\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u0178\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\30\53\1\u0179\1\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\25\53\1\u017c\4\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\25\53\1\u017d\4\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\25\53\1\u017e\4\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\25\53\1\u017f\4\53",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\15\53\1\u0180\14\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u0181\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u0189\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u018a\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u018b\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\4\53\1\u018c\25\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "\2\53\1\uffff\12\53\1\55\6\uffff\32\53\4\uffff\1\53\1\uffff\32\53",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( MaxExclusive | MaxInclusive | MinExclusive | MinInclusive | Description | Irreflexive | Annotation | Asymmetric | Enumerated | Functional | Structured | Transitive | Vocabulary | MaxLength | MinLength | Reflexive | Restricts | Structure | Symmetric | Includes | Language | Property | Relation | Concept | Exactly | Extends | Forward | Inverse | Pattern | Aspect | Bundle | Domain | Entity | Length | Scalar | Range | From | Rule | Some | Uses | With | HyphenMinusGreaterThanSignColon | ColonHyphenMinusGreaterThanSign | ColonLessThanSignHyphenMinus | LessThanSignHyphenMinusColon | All | Key | Max | Min | Ref | HyphenMinusGreaterThanSign | ColonGreaterThanSign | LessThanSignHyphenMinus | EqualsSignGreaterThanSign | CircumflexAccentCircumflexAccent | As | Ci | Ri | To | DollarSign | Ampersand | LeftParenthesis | RightParenthesis | Comma | Colon | CommercialAt | LeftSquareBracket | RightSquareBracket | LeftCurlyBracket | RightCurlyBracket | RULE_BOOLEAN_STR | RULE_UNSIGNED_INTEGER_STR | RULE_INTEGER_STR | RULE_DECIMAL_STR | RULE_DOUBLE_STR | RULE_SEPARATOR | RULE_STRING | RULE_IRI | RULE_ABBREV_IRI | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA33_144 = input.LA(1);

                        s = -1;
                        if ( ((LA33_144>='\u0000' && LA33_144<='\u001F')||(LA33_144>='!' && LA33_144<='\uFFFF')) ) {s = 86;}

                        else s = 198;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA33_85 = input.LA(1);

                        s = -1;
                        if ( (LA33_85==':') ) {s = 144;}

                        else if ( ((LA33_85>='\u0000' && LA33_85<='\u001F')||(LA33_85>='!' && LA33_85<='9')||(LA33_85>=';' && LA33_85<='\uFFFF')) ) {s = 86;}

                        else s = 145;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA33_19 = input.LA(1);

                        s = -1;
                        if ( (LA33_19=='-') ) {s = 85;}

                        else if ( ((LA33_19>='\u0000' && LA33_19<='\u001F')||(LA33_19>='!' && LA33_19<=',')||(LA33_19>='.' && LA33_19<='\uFFFF')) ) {s = 86;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 33, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}