// This is a generated file. Not intended for manual editing.
package com.github.joshholl.intellij.csharp.lang.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.joshholl.intellij.csharp.lang.psi.impl.*;

public interface CSharpTokenTypes {

  IElementType ACCESSOR_BODY = new CSharpElementType("ACCESSOR_BODY");
  IElementType ACCESSOR_DECLARATIONS = new CSharpElementType("ACCESSOR_DECLARATIONS");
  IElementType ACCESSOR_MODIFIER = new CSharpElementType("ACCESSOR_MODIFIER");
  IElementType ADD_ACCESSOR_DECLARATION = new CSharpElementType("ADD_ACCESSOR_DECLARATION");
  IElementType ANONYMOUS_FUNCTION_BODY = new CSharpElementType("ANONYMOUS_FUNCTION_BODY");
  IElementType ANONYMOUS_FUNCTION_PARAMETER_MODIFIER = new CSharpElementType("ANONYMOUS_FUNCTION_PARAMETER_MODIFIER");
  IElementType ANONYMOUS_FUNCTION_SIGNATURE = new CSharpElementType("ANONYMOUS_FUNCTION_SIGNATURE");
  IElementType ANONYMOUS_METHOD_EXPRESSION = new CSharpElementType("ANONYMOUS_METHOD_EXPRESSION");
  IElementType ANONYMOUS_OBJECT_CREATION_EXPRESSION = new CSharpElementType("ANONYMOUS_OBJECT_CREATION_EXPRESSION");
  IElementType ANONYMOUS_OBJECT_INITIALIZER = new CSharpElementType("ANONYMOUS_OBJECT_INITIALIZER");
  IElementType ARGUMENT = new CSharpElementType("ARGUMENT");
  IElementType ARGUMENT_LIST = new CSharpElementType("ARGUMENT_LIST");
  IElementType ARGUMENT_NAME = new CSharpElementType("ARGUMENT_NAME");
  IElementType ARGUMENT_VALUE = new CSharpElementType("ARGUMENT_VALUE");
  IElementType ARRAY_CREATION_EXPRESSION = new CSharpElementType("ARRAY_CREATION_EXPRESSION");
  IElementType ARRAY_INITIALIZER = new CSharpElementType("ARRAY_INITIALIZER");
  IElementType ARRAY_TYPE = new CSharpElementType("ARRAY_TYPE");
  IElementType ASSIGNMENT = new CSharpElementType("ASSIGNMENT");
  IElementType ASSIGNMENT_OPERATOR = new CSharpElementType("ASSIGNMENT_OPERATOR");
  IElementType ATTRIBUTE = new CSharpElementType("ATTRIBUTE");
  IElementType ATTRIBUTES = new CSharpElementType("ATTRIBUTES");
  IElementType ATTRIBUTE_ARGUMENTS = new CSharpElementType("ATTRIBUTE_ARGUMENTS");
  IElementType ATTRIBUTE_ARGUMENT_EXPRESSION = new CSharpElementType("ATTRIBUTE_ARGUMENT_EXPRESSION");
  IElementType ATTRIBUTE_LIST = new CSharpElementType("ATTRIBUTE_LIST");
  IElementType ATTRIBUTE_NAME = new CSharpElementType("ATTRIBUTE_NAME");
  IElementType ATTRIBUTE_SECTION = new CSharpElementType("ATTRIBUTE_SECTION");
  IElementType ATTRIBUTE_SECTIONS = new CSharpElementType("ATTRIBUTE_SECTIONS");
  IElementType ATTRIBUTE_TARGET = new CSharpElementType("ATTRIBUTE_TARGET");
  IElementType ATTRIBUTE_TARGET_SPECIFIER = new CSharpElementType("ATTRIBUTE_TARGET_SPECIFIER");
  IElementType BASE_ACCESS = new CSharpElementType("BASE_ACCESS");
  IElementType BINARY_OPERATOR_DECLARATOR = new CSharpElementType("BINARY_OPERATOR_DECLARATOR");
  IElementType BLOCK = new CSharpElementType("BLOCK");
  IElementType BOOLEAN_EXPRESSION = new CSharpElementType("BOOLEAN_EXPRESSION");
  IElementType BREAK_STATEMENT = new CSharpElementType("BREAK_STATEMENT");
  IElementType CAST_EXPRESSION = new CSharpElementType("CAST_EXPRESSION");
  IElementType CATCH_CLAUSES = new CSharpElementType("CATCH_CLAUSES");
  IElementType CHECKED_EXPRESSION = new CSharpElementType("CHECKED_EXPRESSION");
  IElementType CHECKED_STATEMENT = new CSharpElementType("CHECKED_STATEMENT");
  IElementType CLASS_BASE = new CSharpElementType("CLASS_BASE");
  IElementType CLASS_BODY = new CSharpElementType("CLASS_BODY");
  IElementType CLASS_DECLARATION = new CSharpElementType("CLASS_DECLARATION");
  IElementType CLASS_MEMBER_DECLARATION = new CSharpElementType("CLASS_MEMBER_DECLARATION");
  IElementType CLASS_MEMBER_DECLARATIONS = new CSharpElementType("CLASS_MEMBER_DECLARATIONS");
  IElementType CLASS_MODIFIER = new CSharpElementType("CLASS_MODIFIER");
  IElementType CLASS_MODIFIERS = new CSharpElementType("CLASS_MODIFIERS");
  IElementType CLASS_TYPE = new CSharpElementType("CLASS_TYPE");
  IElementType COLLECTION_INITIALIZER = new CSharpElementType("COLLECTION_INITIALIZER");
  IElementType COMPARATIVE_EXPRESSION = new CSharpElementType("COMPARATIVE_EXPRESSION");
  IElementType COMPILATION_UNIT = new CSharpElementType("COMPILATION_UNIT");
  IElementType CONDITIONAL_EXPRESSION = new CSharpElementType("CONDITIONAL_EXPRESSION");
  IElementType CONSTANT_DECLARATION = new CSharpElementType("CONSTANT_DECLARATION");
  IElementType CONSTANT_DECLARATOR = new CSharpElementType("CONSTANT_DECLARATOR");
  IElementType CONSTANT_DECLARATORS = new CSharpElementType("CONSTANT_DECLARATORS");
  IElementType CONSTANT_EXPRESSION = new CSharpElementType("CONSTANT_EXPRESSION");
  IElementType CONSTANT_MODIFIER = new CSharpElementType("CONSTANT_MODIFIER");
  IElementType CONSTANT_MODIFIERS = new CSharpElementType("CONSTANT_MODIFIERS");
  IElementType CONSTRUCTOR_BODY = new CSharpElementType("CONSTRUCTOR_BODY");
  IElementType CONSTRUCTOR_CONSTRAINT = new CSharpElementType("CONSTRUCTOR_CONSTRAINT");
  IElementType CONSTRUCTOR_DECLARATION = new CSharpElementType("CONSTRUCTOR_DECLARATION");
  IElementType CONSTRUCTOR_DECLARATOR = new CSharpElementType("CONSTRUCTOR_DECLARATOR");
  IElementType CONSTRUCTOR_INITIALIZER = new CSharpElementType("CONSTRUCTOR_INITIALIZER");
  IElementType CONSTRUCTOR_MODIFIER = new CSharpElementType("CONSTRUCTOR_MODIFIER");
  IElementType CONSTRUCTOR_MODIFIERS = new CSharpElementType("CONSTRUCTOR_MODIFIERS");
  IElementType CONTINUE_STATEMENT = new CSharpElementType("CONTINUE_STATEMENT");
  IElementType CONVERSION_OPERATOR_DECLARATOR = new CSharpElementType("CONVERSION_OPERATOR_DECLARATOR");
  IElementType DECLARATION_STATEMENT = new CSharpElementType("DECLARATION_STATEMENT");
  IElementType DEFAULT_ARGUMENT = new CSharpElementType("DEFAULT_ARGUMENT");
  IElementType DEFAULT_VALUE_EXPRESSION = new CSharpElementType("DEFAULT_VALUE_EXPRESSION");
  IElementType DELEGATE_CREATION_EXPRESSION = new CSharpElementType("DELEGATE_CREATION_EXPRESSION");
  IElementType DELEGATE_DECLARATION = new CSharpElementType("DELEGATE_DECLARATION");
  IElementType DELEGATE_MODIFIER = new CSharpElementType("DELEGATE_MODIFIER");
  IElementType DELEGATE_MODIFIERS = new CSharpElementType("DELEGATE_MODIFIERS");
  IElementType DELEGATE_TYPE = new CSharpElementType("DELEGATE_TYPE");
  IElementType DESTRUCTOR_BODY = new CSharpElementType("DESTRUCTOR_BODY");
  IElementType DESTRUCTOR_DECLARATION = new CSharpElementType("DESTRUCTOR_DECLARATION");
  IElementType DIM_SEPARATORS = new CSharpElementType("DIM_SEPARATORS");
  IElementType DO_STATEMENT = new CSharpElementType("DO_STATEMENT");
  IElementType ELEMENT_INITIALIZER = new CSharpElementType("ELEMENT_INITIALIZER");
  IElementType ELEMENT_INITIALIZER_LIST = new CSharpElementType("ELEMENT_INITIALIZER_LIST");
  IElementType EMBEDDED_STATEMENT = new CSharpElementType("EMBEDDED_STATEMENT");
  IElementType EMPTY_STATEMENT = new CSharpElementType("EMPTY_STATEMENT");
  IElementType ENUM_BASE = new CSharpElementType("ENUM_BASE");
  IElementType ENUM_BODY = new CSharpElementType("ENUM_BODY");
  IElementType ENUM_DECLARATION = new CSharpElementType("ENUM_DECLARATION");
  IElementType ENUM_MEMBER_DECLARATION = new CSharpElementType("ENUM_MEMBER_DECLARATION");
  IElementType ENUM_MEMBER_DECLARATIONS = new CSharpElementType("ENUM_MEMBER_DECLARATIONS");
  IElementType ENUM_MODIFIER = new CSharpElementType("ENUM_MODIFIER");
  IElementType ENUM_MODIFIERS = new CSharpElementType("ENUM_MODIFIERS");
  IElementType ENUM_TYPE = new CSharpElementType("ENUM_TYPE");
  IElementType EVENT_ACCESSOR_DECLARATIONS = new CSharpElementType("EVENT_ACCESSOR_DECLARATIONS");
  IElementType EVENT_DECLARATION = new CSharpElementType("EVENT_DECLARATION");
  IElementType EVENT_MODIFIER = new CSharpElementType("EVENT_MODIFIER");
  IElementType EVENT_MODIFIERS = new CSharpElementType("EVENT_MODIFIERS");
  IElementType EXPLICIT_ANONYMOUS_FUNCTION_PARAMETER = new CSharpElementType("EXPLICIT_ANONYMOUS_FUNCTION_PARAMETER");
  IElementType EXPLICIT_ANONYMOUS_FUNCTION_PARAMETER_LIST = new CSharpElementType("EXPLICIT_ANONYMOUS_FUNCTION_PARAMETER_LIST");
  IElementType EXPLICIT_ANONYMOUS_FUNCTION_SIGNATURE = new CSharpElementType("EXPLICIT_ANONYMOUS_FUNCTION_SIGNATURE");
  IElementType EXPRESSION = new CSharpElementType("EXPRESSION");
  IElementType EXPRESSION_LIST = new CSharpElementType("EXPRESSION_LIST");
  IElementType EXPRESSION_STATEMENT = new CSharpElementType("EXPRESSION_STATEMENT");
  IElementType EXTERN_ALIAS_DIRECTIVE = new CSharpElementType("EXTERN_ALIAS_DIRECTIVE");
  IElementType EXTERN_ALIAS_DIRECTIVES = new CSharpElementType("EXTERN_ALIAS_DIRECTIVES");
  IElementType FIELD_DECLARATION = new CSharpElementType("FIELD_DECLARATION");
  IElementType FIELD_MODIFIER = new CSharpElementType("FIELD_MODIFIER");
  IElementType FIELD_MODIFIERS = new CSharpElementType("FIELD_MODIFIERS");
  IElementType FINALLY_CLAUSE = new CSharpElementType("FINALLY_CLAUSE");
  IElementType FIXED_PARAMETER = new CSharpElementType("FIXED_PARAMETER");
  IElementType FIXED_PARAMETERS = new CSharpElementType("FIXED_PARAMETERS");
  IElementType FLOATING_POINT_TYPE = new CSharpElementType("FLOATING_POINT_TYPE");
  IElementType FOREACH_STATEMENT = new CSharpElementType("FOREACH_STATEMENT");
  IElementType FORMAL_PARAMETER_LIST = new CSharpElementType("FORMAL_PARAMETER_LIST");
  IElementType FOR_CONDITION = new CSharpElementType("FOR_CONDITION");
  IElementType FOR_INITIALIZER = new CSharpElementType("FOR_INITIALIZER");
  IElementType FOR_ITERATOR = new CSharpElementType("FOR_ITERATOR");
  IElementType FOR_STATEMENT = new CSharpElementType("FOR_STATEMENT");
  IElementType FROM_CLAUSE = new CSharpElementType("FROM_CLAUSE");
  IElementType GENERAL_CATCH_CLAUSE = new CSharpElementType("GENERAL_CATCH_CLAUSE");
  IElementType GENERIC_DIMENSION_SPECIFIER = new CSharpElementType("GENERIC_DIMENSION_SPECIFIER");
  IElementType GET_ACCESSOR_DECLARATION = new CSharpElementType("GET_ACCESSOR_DECLARATION");
  IElementType GLOBAL_ATTRIBUTES = new CSharpElementType("GLOBAL_ATTRIBUTES");
  IElementType GLOBAL_ATTRIBUTE_SECTION = new CSharpElementType("GLOBAL_ATTRIBUTE_SECTION");
  IElementType GLOBAL_ATTRIBUTE_SECTIONS = new CSharpElementType("GLOBAL_ATTRIBUTE_SECTIONS");
  IElementType GLOBAL_ATTRIBUTE_TARGET = new CSharpElementType("GLOBAL_ATTRIBUTE_TARGET");
  IElementType GLOBAL_ATTRIBUTE_TARGET_SPECIFIER = new CSharpElementType("GLOBAL_ATTRIBUTE_TARGET_SPECIFIER");
  IElementType GOTO_STATEMENT = new CSharpElementType("GOTO_STATEMENT");
  IElementType GROUP_CLAUSE = new CSharpElementType("GROUP_CLAUSE");
  IElementType IF_STATEMENT = new CSharpElementType("IF_STATEMENT");
  IElementType IMPLICIT_ANONYMOUS_FUNCTION_PARAMETER = new CSharpElementType("IMPLICIT_ANONYMOUS_FUNCTION_PARAMETER");
  IElementType IMPLICIT_ANONYMOUS_FUNCTION_PARAMETER_LIST = new CSharpElementType("IMPLICIT_ANONYMOUS_FUNCTION_PARAMETER_LIST");
  IElementType IMPLICIT_ANONYMOUS_FUNCTION_SIGNATURE = new CSharpElementType("IMPLICIT_ANONYMOUS_FUNCTION_SIGNATURE");
  IElementType INDEXER_DECLARATION = new CSharpElementType("INDEXER_DECLARATION");
  IElementType INDEXER_DECLARATOR = new CSharpElementType("INDEXER_DECLARATOR");
  IElementType INDEXER_MODIFIER = new CSharpElementType("INDEXER_MODIFIER");
  IElementType INDEXER_MODIFIERS = new CSharpElementType("INDEXER_MODIFIERS");
  IElementType INITIALIZER_VALUE = new CSharpElementType("INITIALIZER_VALUE");
  IElementType INTEGRAL_TYPE = new CSharpElementType("INTEGRAL_TYPE");
  IElementType INTERFACE_ACCESSORS = new CSharpElementType("INTERFACE_ACCESSORS");
  IElementType INTERFACE_BASE = new CSharpElementType("INTERFACE_BASE");
  IElementType INTERFACE_BODY = new CSharpElementType("INTERFACE_BODY");
  IElementType INTERFACE_DECLARATION = new CSharpElementType("INTERFACE_DECLARATION");
  IElementType INTERFACE_EVENT_DECLARATION = new CSharpElementType("INTERFACE_EVENT_DECLARATION");
  IElementType INTERFACE_INDEXER_DECLARATION = new CSharpElementType("INTERFACE_INDEXER_DECLARATION");
  IElementType INTERFACE_MEMBER_DECLARATION = new CSharpElementType("INTERFACE_MEMBER_DECLARATION");
  IElementType INTERFACE_MEMBER_DECLARATIONS = new CSharpElementType("INTERFACE_MEMBER_DECLARATIONS");
  IElementType INTERFACE_METHOD_DECLARATION = new CSharpElementType("INTERFACE_METHOD_DECLARATION");
  IElementType INTERFACE_MODIFIER = new CSharpElementType("INTERFACE_MODIFIER");
  IElementType INTERFACE_MODIFIERS = new CSharpElementType("INTERFACE_MODIFIERS");
  IElementType INTERFACE_PROPERTY_DECLARATION = new CSharpElementType("INTERFACE_PROPERTY_DECLARATION");
  IElementType INTERFACE_TYPE = new CSharpElementType("INTERFACE_TYPE");
  IElementType INTERFACE_TYPE_LIST = new CSharpElementType("INTERFACE_TYPE_LIST");
  IElementType INVOCATION_EXPRESSION = new CSharpElementType("INVOCATION_EXPRESSION");
  IElementType ITERATION_STATEMENT = new CSharpElementType("ITERATION_STATEMENT");
  IElementType JOIN_CLAUSE = new CSharpElementType("JOIN_CLAUSE");
  IElementType JOIN_INTO_CLAUSE = new CSharpElementType("JOIN_INTO_CLAUSE");
  IElementType JUMP_STATEMENT = new CSharpElementType("JUMP_STATEMENT");
  IElementType LABELED_STATEMENT = new CSharpElementType("LABELED_STATEMENT");
  IElementType LAMBDA_EXPRESSION = new CSharpElementType("LAMBDA_EXPRESSION");
  IElementType LET_CLAUSE = new CSharpElementType("LET_CLAUSE");
  IElementType LOCAL_CONSTANT_DECLARATION = new CSharpElementType("LOCAL_CONSTANT_DECLARATION");
  IElementType LOCAL_VARIABLE_DECLARATION = new CSharpElementType("LOCAL_VARIABLE_DECLARATION");
  IElementType LOCAL_VARIABLE_DECLARATOR = new CSharpElementType("LOCAL_VARIABLE_DECLARATOR");
  IElementType LOCAL_VARIABLE_DECLARATORS = new CSharpElementType("LOCAL_VARIABLE_DECLARATORS");
  IElementType LOCAL_VARIABLE_INITIALIZER = new CSharpElementType("LOCAL_VARIABLE_INITIALIZER");
  IElementType LOCAL_VARIABLE_TYPE = new CSharpElementType("LOCAL_VARIABLE_TYPE");
  IElementType LOCK_STATEMENT = new CSharpElementType("LOCK_STATEMENT");
  IElementType MEMBER_ACCESS = new CSharpElementType("MEMBER_ACCESS");
  IElementType MEMBER_DECLARATOR = new CSharpElementType("MEMBER_DECLARATOR");
  IElementType MEMBER_DECLARATOR_LIST = new CSharpElementType("MEMBER_DECLARATOR_LIST");
  IElementType MEMBER_INITIALIZER = new CSharpElementType("MEMBER_INITIALIZER");
  IElementType MEMBER_INITIALIZER_LIST = new CSharpElementType("MEMBER_INITIALIZER_LIST");
  IElementType MEMBER_NAME = new CSharpElementType("MEMBER_NAME");
  IElementType METHOD_BODY = new CSharpElementType("METHOD_BODY");
  IElementType METHOD_DECLARATION = new CSharpElementType("METHOD_DECLARATION");
  IElementType METHOD_HEADER = new CSharpElementType("METHOD_HEADER");
  IElementType METHOD_MODIFIER = new CSharpElementType("METHOD_MODIFIER");
  IElementType METHOD_MODIFIERS = new CSharpElementType("METHOD_MODIFIERS");
  IElementType NAMED_ARGUMENT = new CSharpElementType("NAMED_ARGUMENT");
  IElementType NAMED_ARGUMENT_LIST = new CSharpElementType("NAMED_ARGUMENT_LIST");
  IElementType NAMESPACE_BODY = new CSharpElementType("NAMESPACE_BODY");
  IElementType NAMESPACE_DECLARATION = new CSharpElementType("NAMESPACE_DECLARATION");
  IElementType NAMESPACE_MEMBER_DECLARATION = new CSharpElementType("NAMESPACE_MEMBER_DECLARATION");
  IElementType NAMESPACE_MEMBER_DECLARATIONS = new CSharpElementType("NAMESPACE_MEMBER_DECLARATIONS");
  IElementType NAMESPACE_OR_TYPE_NAME = new CSharpElementType("NAMESPACE_OR_TYPE_NAME");
  IElementType NON_ARRAY_TYPE = new CSharpElementType("NON_ARRAY_TYPE");
  IElementType NON_ASSIGNMENT_EXPRESSION = new CSharpElementType("NON_ASSIGNMENT_EXPRESSION");
  IElementType NUMERIC_TYPE = new CSharpElementType("NUMERIC_TYPE");
  IElementType OBJECT_CREATION_EXPRESSION = new CSharpElementType("OBJECT_CREATION_EXPRESSION");
  IElementType OBJECT_INITIALIZER = new CSharpElementType("OBJECT_INITIALIZER");
  IElementType OBJECT_OR_COLLECTION_INITIALIZER = new CSharpElementType("OBJECT_OR_COLLECTION_INITIALIZER");
  IElementType OPERATOR_BODY = new CSharpElementType("OPERATOR_BODY");
  IElementType OPERATOR_DECLARATION = new CSharpElementType("OPERATOR_DECLARATION");
  IElementType OPERATOR_DECLARATOR = new CSharpElementType("OPERATOR_DECLARATOR");
  IElementType OPERATOR_MODIFIER = new CSharpElementType("OPERATOR_MODIFIER");
  IElementType OPERATOR_MODIFIERS = new CSharpElementType("OPERATOR_MODIFIERS");
  IElementType ORDERBY_CLAUSE = new CSharpElementType("ORDERBY_CLAUSE");
  IElementType ORDERING = new CSharpElementType("ORDERING");
  IElementType ORDERINGS = new CSharpElementType("ORDERINGS");
  IElementType ORDERING_DIRECTION = new CSharpElementType("ORDERING_DIRECTION");
  IElementType OVERLOADABLE_BINARY_OPERATOR = new CSharpElementType("OVERLOADABLE_BINARY_OPERATOR");
  IElementType OVERLOADABLE_UNARY_OPERATOR = new CSharpElementType("OVERLOADABLE_UNARY_OPERATOR");
  IElementType PARAMETER_ARRAY = new CSharpElementType("PARAMETER_ARRAY");
  IElementType PARAMETER_MODIFIER = new CSharpElementType("PARAMETER_MODIFIER");
  IElementType PARENTHESIZED_EXPRESSION = new CSharpElementType("PARENTHESIZED_EXPRESSION");
  IElementType POSITIONAL_ARGUMENT = new CSharpElementType("POSITIONAL_ARGUMENT");
  IElementType POSITIONAL_ARGUMENT_LIST = new CSharpElementType("POSITIONAL_ARGUMENT_LIST");
  IElementType POST_DECREMENT_EXPRESSION = new CSharpElementType("POST_DECREMENT_EXPRESSION");
  IElementType POST_INCREMENT_EXPRESSION = new CSharpElementType("POST_INCREMENT_EXPRESSION");
  IElementType PREDEFINED_TYPE = new CSharpElementType("PREDEFINED_TYPE");
  IElementType PRE_DECREMENT_EXPRESSION = new CSharpElementType("PRE_DECREMENT_EXPRESSION");
  IElementType PRE_INCREMENT_EXPRESSION = new CSharpElementType("PRE_INCREMENT_EXPRESSION");
  IElementType PRIMARY_CONSTRAINT = new CSharpElementType("PRIMARY_CONSTRAINT");
  IElementType PRIMARY_EXPRESSION = new CSharpElementType("PRIMARY_EXPRESSION");
  IElementType PROPERTY_DECLARATION = new CSharpElementType("PROPERTY_DECLARATION");
  IElementType PROPERTY_MODIFIER = new CSharpElementType("PROPERTY_MODIFIER");
  IElementType PROPERTY_MODIFIERS = new CSharpElementType("PROPERTY_MODIFIERS");
  IElementType QUALIFIED_ALIAS_MEMBER = new CSharpElementType("QUALIFIED_ALIAS_MEMBER");
  IElementType QUALIFIED_IDENTIFIER = new CSharpElementType("QUALIFIED_IDENTIFIER");
  IElementType QUERY_BODY = new CSharpElementType("QUERY_BODY");
  IElementType QUERY_BODY_CLAUSE = new CSharpElementType("QUERY_BODY_CLAUSE");
  IElementType QUERY_BODY_CLAUSES = new CSharpElementType("QUERY_BODY_CLAUSES");
  IElementType QUERY_CONTINUATION = new CSharpElementType("QUERY_CONTINUATION");
  IElementType QUERY_EXPRESSION = new CSharpElementType("QUERY_EXPRESSION");
  IElementType RANK_SPECIFIER = new CSharpElementType("RANK_SPECIFIER");
  IElementType RANK_SPECIFIERS = new CSharpElementType("RANK_SPECIFIERS");
  IElementType REMOVE_ACCESSOR_DECLARATION = new CSharpElementType("REMOVE_ACCESSOR_DECLARATION");
  IElementType RESOURCE_ACQUISITION = new CSharpElementType("RESOURCE_ACQUISITION");
  IElementType RETURN_STATEMENT = new CSharpElementType("RETURN_STATEMENT");
  IElementType RETURN_TYPE = new CSharpElementType("RETURN_TYPE");
  IElementType RIGHT_SHIFT = new CSharpElementType("RIGHT_SHIFT");
  IElementType RIGHT_SHIFT_ASSIGNMENT = new CSharpElementType("RIGHT_SHIFT_ASSIGNMENT");
  IElementType SECONDARY_CONSTRAINTS = new CSharpElementType("SECONDARY_CONSTRAINTS");
  IElementType SELECTION_STATEMENT = new CSharpElementType("SELECTION_STATEMENT");
  IElementType SELECT_CLAUSE = new CSharpElementType("SELECT_CLAUSE");
  IElementType SELECT_OR_GROUP_CLAUSE = new CSharpElementType("SELECT_OR_GROUP_CLAUSE");
  IElementType SET_ACCESSOR_DECLARATION = new CSharpElementType("SET_ACCESSOR_DECLARATION");
  IElementType SIMPLE_NAME = new CSharpElementType("SIMPLE_NAME");
  IElementType SIMPLE_TYPE = new CSharpElementType("SIMPLE_TYPE");
  IElementType SPECIFIC_CATCH_CLAUSE = new CSharpElementType("SPECIFIC_CATCH_CLAUSE");
  IElementType SPECIFIC_CATCH_CLAUSES = new CSharpElementType("SPECIFIC_CATCH_CLAUSES");
  IElementType STATEMENT = new CSharpElementType("STATEMENT");
  IElementType STATEMENT_EXPRESSION = new CSharpElementType("STATEMENT_EXPRESSION");
  IElementType STATEMENT_EXPRESSION_LIST = new CSharpElementType("STATEMENT_EXPRESSION_LIST");
  IElementType STATEMENT_LIST = new CSharpElementType("STATEMENT_LIST");
  IElementType STATIC_CONSTRUCTOR_BODY = new CSharpElementType("STATIC_CONSTRUCTOR_BODY");
  IElementType STATIC_CONSTRUCTOR_DECLARATION = new CSharpElementType("STATIC_CONSTRUCTOR_DECLARATION");
  IElementType STATIC_CONSTRUCTOR_MODIFIERS = new CSharpElementType("STATIC_CONSTRUCTOR_MODIFIERS");
  IElementType STRUCT_BODY = new CSharpElementType("STRUCT_BODY");
  IElementType STRUCT_DECLARATION = new CSharpElementType("STRUCT_DECLARATION");
  IElementType STRUCT_INTERFACES = new CSharpElementType("STRUCT_INTERFACES");
  IElementType STRUCT_MEMBER_DECLARATION = new CSharpElementType("STRUCT_MEMBER_DECLARATION");
  IElementType STRUCT_MEMBER_DECLARATIONS = new CSharpElementType("STRUCT_MEMBER_DECLARATIONS");
  IElementType STRUCT_MODIFIER = new CSharpElementType("STRUCT_MODIFIER");
  IElementType STRUCT_MODIFIERS = new CSharpElementType("STRUCT_MODIFIERS");
  IElementType SWITCH_BLOCK = new CSharpElementType("SWITCH_BLOCK");
  IElementType SWITCH_LABEL = new CSharpElementType("SWITCH_LABEL");
  IElementType SWITCH_LABELS = new CSharpElementType("SWITCH_LABELS");
  IElementType SWITCH_SECTION = new CSharpElementType("SWITCH_SECTION");
  IElementType SWITCH_SECTIONS = new CSharpElementType("SWITCH_SECTIONS");
  IElementType SWITCH_STATEMENT = new CSharpElementType("SWITCH_STATEMENT");
  IElementType THIS_ACCESS = new CSharpElementType("THIS_ACCESS");
  IElementType THROW_STATEMENT = new CSharpElementType("THROW_STATEMENT");
  IElementType TRY_STATEMENT = new CSharpElementType("TRY_STATEMENT");
  IElementType TYPE = new CSharpElementType("TYPE");
  IElementType TYPEOF_EXPRESSION = new CSharpElementType("TYPEOF_EXPRESSION");
  IElementType TYPE_ARGUMENT = new CSharpElementType("TYPE_ARGUMENT");
  IElementType TYPE_ARGUMENTS = new CSharpElementType("TYPE_ARGUMENTS");
  IElementType TYPE_ARGUMENT_LIST = new CSharpElementType("TYPE_ARGUMENT_LIST");
  IElementType TYPE_DECLARATION = new CSharpElementType("TYPE_DECLARATION");
  IElementType TYPE_NAME = new CSharpElementType("TYPE_NAME");
  IElementType TYPE_PARAMETER = new CSharpElementType("TYPE_PARAMETER");
  IElementType TYPE_PARAMETERS = new CSharpElementType("TYPE_PARAMETERS");
  IElementType TYPE_PARAMETER_CONSTRAINTS = new CSharpElementType("TYPE_PARAMETER_CONSTRAINTS");
  IElementType TYPE_PARAMETER_CONSTRAINTS_CLAUSE = new CSharpElementType("TYPE_PARAMETER_CONSTRAINTS_CLAUSE");
  IElementType TYPE_PARAMETER_CONSTRAINTS_CLAUSES = new CSharpElementType("TYPE_PARAMETER_CONSTRAINTS_CLAUSES");
  IElementType TYPE_PARAMETER_LIST = new CSharpElementType("TYPE_PARAMETER_LIST");
  IElementType UNARY_EXPRESSION = new CSharpElementType("UNARY_EXPRESSION");
  IElementType UNARY_OPERATOR_DECLARATOR = new CSharpElementType("UNARY_OPERATOR_DECLARATOR");
  IElementType UNCHECKED_EXPRESSION = new CSharpElementType("UNCHECKED_EXPRESSION");
  IElementType UNCHECKED_STATEMENT = new CSharpElementType("UNCHECKED_STATEMENT");
  IElementType USING_ALIAS_DIRECTIVE = new CSharpElementType("USING_ALIAS_DIRECTIVE");
  IElementType USING_DIRECTIVE = new CSharpElementType("USING_DIRECTIVE");
  IElementType USING_DIRECTIVES = new CSharpElementType("USING_DIRECTIVES");
  IElementType USING_NAMESPACE_DIRECTIVE = new CSharpElementType("USING_NAMESPACE_DIRECTIVE");
  IElementType USING_STATEMENT = new CSharpElementType("USING_STATEMENT");
  IElementType VARIABLE_DECLARATOR = new CSharpElementType("VARIABLE_DECLARATOR");
  IElementType VARIABLE_DECLARATORS = new CSharpElementType("VARIABLE_DECLARATORS");
  IElementType VARIABLE_INITIALIZER = new CSharpElementType("VARIABLE_INITIALIZER");
  IElementType VARIABLE_INITIALIZER_LIST = new CSharpElementType("VARIABLE_INITIALIZER_LIST");
  IElementType VARIABLE_REFERENCE = new CSharpElementType("VARIABLE_REFERENCE");
  IElementType VARIANCE_ANNOTATION = new CSharpElementType("VARIANCE_ANNOTATION");
  IElementType VARIANT_TYPE_PARAMETER = new CSharpElementType("VARIANT_TYPE_PARAMETER");
  IElementType VARIANT_TYPE_PARAMETERS = new CSharpElementType("VARIANT_TYPE_PARAMETERS");
  IElementType VARIANT_TYPE_PARAMETER_LIST = new CSharpElementType("VARIANT_TYPE_PARAMETER_LIST");
  IElementType WHERE_CLAUSE = new CSharpElementType("WHERE_CLAUSE");
  IElementType WHILE_STATEMENT = new CSharpElementType("WHILE_STATEMENT");
  IElementType YIELD_STATEMENT = new CSharpElementType("YIELD_STATEMENT");

  IElementType IDENTIFIER = new CSharpElementType("identifier");
  IElementType LITERAL = new CSharpElementType("literal");
  IElementType ORDERBY = new CSharpElementType("orderby");
  IElementType PARTIAL = new CSharpElementType("partial");
  IElementType THIS = new CSharpElementType("this");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ACCESSOR_BODY) {
        return new CSharpAccessorBodyImpl(node);
      }
      else if (type == ACCESSOR_DECLARATIONS) {
        return new CSharpAccessorDeclarationsImpl(node);
      }
      else if (type == ACCESSOR_MODIFIER) {
        return new CSharpAccessorModifierImpl(node);
      }
      else if (type == ADD_ACCESSOR_DECLARATION) {
        return new CSharpAddAccessorDeclarationImpl(node);
      }
      else if (type == ANONYMOUS_FUNCTION_BODY) {
        return new CSharpAnonymousFunctionBodyImpl(node);
      }
      else if (type == ANONYMOUS_FUNCTION_PARAMETER_MODIFIER) {
        return new CSharpAnonymousFunctionParameterModifierImpl(node);
      }
      else if (type == ANONYMOUS_FUNCTION_SIGNATURE) {
        return new CSharpAnonymousFunctionSignatureImpl(node);
      }
      else if (type == ANONYMOUS_METHOD_EXPRESSION) {
        return new CSharpAnonymousMethodExpressionImpl(node);
      }
      else if (type == ANONYMOUS_OBJECT_CREATION_EXPRESSION) {
        return new CSharpAnonymousObjectCreationExpressionImpl(node);
      }
      else if (type == ANONYMOUS_OBJECT_INITIALIZER) {
        return new CSharpAnonymousObjectInitializerImpl(node);
      }
      else if (type == ARGUMENT) {
        return new CSharpArgumentImpl(node);
      }
      else if (type == ARGUMENT_LIST) {
        return new CSharpArgumentListImpl(node);
      }
      else if (type == ARGUMENT_NAME) {
        return new CSharpArgumentNameImpl(node);
      }
      else if (type == ARGUMENT_VALUE) {
        return new CSharpArgumentValueImpl(node);
      }
      else if (type == ARRAY_CREATION_EXPRESSION) {
        return new CSharpArrayCreationExpressionImpl(node);
      }
      else if (type == ARRAY_INITIALIZER) {
        return new CSharpArrayInitializerImpl(node);
      }
      else if (type == ARRAY_TYPE) {
        return new CSharpArrayTypeImpl(node);
      }
      else if (type == ASSIGNMENT) {
        return new CSharpAssignmentImpl(node);
      }
      else if (type == ASSIGNMENT_OPERATOR) {
        return new CSharpAssignmentOperatorImpl(node);
      }
      else if (type == ATTRIBUTE) {
        return new CSharpAttributeImpl(node);
      }
      else if (type == ATTRIBUTES) {
        return new CSharpAttributesImpl(node);
      }
      else if (type == ATTRIBUTE_ARGUMENTS) {
        return new CSharpAttributeArgumentsImpl(node);
      }
      else if (type == ATTRIBUTE_ARGUMENT_EXPRESSION) {
        return new CSharpAttributeArgumentExpressionImpl(node);
      }
      else if (type == ATTRIBUTE_LIST) {
        return new CSharpAttributeListImpl(node);
      }
      else if (type == ATTRIBUTE_NAME) {
        return new CSharpAttributeNameImpl(node);
      }
      else if (type == ATTRIBUTE_SECTION) {
        return new CSharpAttributeSectionImpl(node);
      }
      else if (type == ATTRIBUTE_SECTIONS) {
        return new CSharpAttributeSectionsImpl(node);
      }
      else if (type == ATTRIBUTE_TARGET) {
        return new CSharpAttributeTargetImpl(node);
      }
      else if (type == ATTRIBUTE_TARGET_SPECIFIER) {
        return new CSharpAttributeTargetSpecifierImpl(node);
      }
      else if (type == BASE_ACCESS) {
        return new CSharpBaseAccessImpl(node);
      }
      else if (type == BINARY_OPERATOR_DECLARATOR) {
        return new CSharpBinaryOperatorDeclaratorImpl(node);
      }
      else if (type == BLOCK) {
        return new CSharpBlockImpl(node);
      }
      else if (type == BOOLEAN_EXPRESSION) {
        return new CSharpBooleanExpressionImpl(node);
      }
      else if (type == BREAK_STATEMENT) {
        return new CSharpBreakStatementImpl(node);
      }
      else if (type == CAST_EXPRESSION) {
        return new CSharpCastExpressionImpl(node);
      }
      else if (type == CATCH_CLAUSES) {
        return new CSharpCatchClausesImpl(node);
      }
      else if (type == CHECKED_EXPRESSION) {
        return new CSharpCheckedExpressionImpl(node);
      }
      else if (type == CHECKED_STATEMENT) {
        return new CSharpCheckedStatementImpl(node);
      }
      else if (type == CLASS_BASE) {
        return new CSharpClassBaseImpl(node);
      }
      else if (type == CLASS_BODY) {
        return new CSharpClassBodyImpl(node);
      }
      else if (type == CLASS_DECLARATION) {
        return new CSharpClassDeclarationImpl(node);
      }
      else if (type == CLASS_MEMBER_DECLARATION) {
        return new CSharpClassMemberDeclarationImpl(node);
      }
      else if (type == CLASS_MEMBER_DECLARATIONS) {
        return new CSharpClassMemberDeclarationsImpl(node);
      }
      else if (type == CLASS_MODIFIER) {
        return new CSharpClassModifierImpl(node);
      }
      else if (type == CLASS_MODIFIERS) {
        return new CSharpClassModifiersImpl(node);
      }
      else if (type == CLASS_TYPE) {
        return new CSharpClassTypeImpl(node);
      }
      else if (type == COLLECTION_INITIALIZER) {
        return new CSharpCollectionInitializerImpl(node);
      }
      else if (type == COMPARATIVE_EXPRESSION) {
        return new CSharpComparativeExpressionImpl(node);
      }
      else if (type == COMPILATION_UNIT) {
        return new CSharpCompilationUnitImpl(node);
      }
      else if (type == CONDITIONAL_EXPRESSION) {
        return new CSharpConditionalExpressionImpl(node);
      }
      else if (type == CONSTANT_DECLARATION) {
        return new CSharpConstantDeclarationImpl(node);
      }
      else if (type == CONSTANT_DECLARATOR) {
        return new CSharpConstantDeclaratorImpl(node);
      }
      else if (type == CONSTANT_DECLARATORS) {
        return new CSharpConstantDeclaratorsImpl(node);
      }
      else if (type == CONSTANT_EXPRESSION) {
        return new CSharpConstantExpressionImpl(node);
      }
      else if (type == CONSTANT_MODIFIER) {
        return new CSharpConstantModifierImpl(node);
      }
      else if (type == CONSTANT_MODIFIERS) {
        return new CSharpConstantModifiersImpl(node);
      }
      else if (type == CONSTRUCTOR_BODY) {
        return new CSharpConstructorBodyImpl(node);
      }
      else if (type == CONSTRUCTOR_CONSTRAINT) {
        return new CSharpConstructorConstraintImpl(node);
      }
      else if (type == CONSTRUCTOR_DECLARATION) {
        return new CSharpConstructorDeclarationImpl(node);
      }
      else if (type == CONSTRUCTOR_DECLARATOR) {
        return new CSharpConstructorDeclaratorImpl(node);
      }
      else if (type == CONSTRUCTOR_INITIALIZER) {
        return new CSharpConstructorInitializerImpl(node);
      }
      else if (type == CONSTRUCTOR_MODIFIER) {
        return new CSharpConstructorModifierImpl(node);
      }
      else if (type == CONSTRUCTOR_MODIFIERS) {
        return new CSharpConstructorModifiersImpl(node);
      }
      else if (type == CONTINUE_STATEMENT) {
        return new CSharpContinueStatementImpl(node);
      }
      else if (type == CONVERSION_OPERATOR_DECLARATOR) {
        return new CSharpConversionOperatorDeclaratorImpl(node);
      }
      else if (type == DECLARATION_STATEMENT) {
        return new CSharpDeclarationStatementImpl(node);
      }
      else if (type == DEFAULT_ARGUMENT) {
        return new CSharpDefaultArgumentImpl(node);
      }
      else if (type == DEFAULT_VALUE_EXPRESSION) {
        return new CSharpDefaultValueExpressionImpl(node);
      }
      else if (type == DELEGATE_CREATION_EXPRESSION) {
        return new CSharpDelegateCreationExpressionImpl(node);
      }
      else if (type == DELEGATE_DECLARATION) {
        return new CSharpDelegateDeclarationImpl(node);
      }
      else if (type == DELEGATE_MODIFIER) {
        return new CSharpDelegateModifierImpl(node);
      }
      else if (type == DELEGATE_MODIFIERS) {
        return new CSharpDelegateModifiersImpl(node);
      }
      else if (type == DELEGATE_TYPE) {
        return new CSharpDelegateTypeImpl(node);
      }
      else if (type == DESTRUCTOR_BODY) {
        return new CSharpDestructorBodyImpl(node);
      }
      else if (type == DESTRUCTOR_DECLARATION) {
        return new CSharpDestructorDeclarationImpl(node);
      }
      else if (type == DIM_SEPARATORS) {
        return new CSharpDimSeparatorsImpl(node);
      }
      else if (type == DO_STATEMENT) {
        return new CSharpDoStatementImpl(node);
      }
      else if (type == ELEMENT_INITIALIZER) {
        return new CSharpElementInitializerImpl(node);
      }
      else if (type == ELEMENT_INITIALIZER_LIST) {
        return new CSharpElementInitializerListImpl(node);
      }
      else if (type == EMBEDDED_STATEMENT) {
        return new CSharpEmbeddedStatementImpl(node);
      }
      else if (type == EMPTY_STATEMENT) {
        return new CSharpEmptyStatementImpl(node);
      }
      else if (type == ENUM_BASE) {
        return new CSharpEnumBaseImpl(node);
      }
      else if (type == ENUM_BODY) {
        return new CSharpEnumBodyImpl(node);
      }
      else if (type == ENUM_DECLARATION) {
        return new CSharpEnumDeclarationImpl(node);
      }
      else if (type == ENUM_MEMBER_DECLARATION) {
        return new CSharpEnumMemberDeclarationImpl(node);
      }
      else if (type == ENUM_MEMBER_DECLARATIONS) {
        return new CSharpEnumMemberDeclarationsImpl(node);
      }
      else if (type == ENUM_MODIFIER) {
        return new CSharpEnumModifierImpl(node);
      }
      else if (type == ENUM_MODIFIERS) {
        return new CSharpEnumModifiersImpl(node);
      }
      else if (type == ENUM_TYPE) {
        return new CSharpEnumTypeImpl(node);
      }
      else if (type == EVENT_ACCESSOR_DECLARATIONS) {
        return new CSharpEventAccessorDeclarationsImpl(node);
      }
      else if (type == EVENT_DECLARATION) {
        return new CSharpEventDeclarationImpl(node);
      }
      else if (type == EVENT_MODIFIER) {
        return new CSharpEventModifierImpl(node);
      }
      else if (type == EVENT_MODIFIERS) {
        return new CSharpEventModifiersImpl(node);
      }
      else if (type == EXPLICIT_ANONYMOUS_FUNCTION_PARAMETER) {
        return new CSharpExplicitAnonymousFunctionParameterImpl(node);
      }
      else if (type == EXPLICIT_ANONYMOUS_FUNCTION_PARAMETER_LIST) {
        return new CSharpExplicitAnonymousFunctionParameterListImpl(node);
      }
      else if (type == EXPLICIT_ANONYMOUS_FUNCTION_SIGNATURE) {
        return new CSharpExplicitAnonymousFunctionSignatureImpl(node);
      }
      else if (type == EXPRESSION) {
        return new CSharpExpressionImpl(node);
      }
      else if (type == EXPRESSION_LIST) {
        return new CSharpExpressionListImpl(node);
      }
      else if (type == EXPRESSION_STATEMENT) {
        return new CSharpExpressionStatementImpl(node);
      }
      else if (type == EXTERN_ALIAS_DIRECTIVE) {
        return new CSharpExternAliasDirectiveImpl(node);
      }
      else if (type == EXTERN_ALIAS_DIRECTIVES) {
        return new CSharpExternAliasDirectivesImpl(node);
      }
      else if (type == FIELD_DECLARATION) {
        return new CSharpFieldDeclarationImpl(node);
      }
      else if (type == FIELD_MODIFIER) {
        return new CSharpFieldModifierImpl(node);
      }
      else if (type == FIELD_MODIFIERS) {
        return new CSharpFieldModifiersImpl(node);
      }
      else if (type == FINALLY_CLAUSE) {
        return new CSharpFinallyClauseImpl(node);
      }
      else if (type == FIXED_PARAMETER) {
        return new CSharpFixedParameterImpl(node);
      }
      else if (type == FIXED_PARAMETERS) {
        return new CSharpFixedParametersImpl(node);
      }
      else if (type == FLOATING_POINT_TYPE) {
        return new CSharpFloatingPointTypeImpl(node);
      }
      else if (type == FOREACH_STATEMENT) {
        return new CSharpForeachStatementImpl(node);
      }
      else if (type == FORMAL_PARAMETER_LIST) {
        return new CSharpFormalParameterListImpl(node);
      }
      else if (type == FOR_CONDITION) {
        return new CSharpForConditionImpl(node);
      }
      else if (type == FOR_INITIALIZER) {
        return new CSharpForInitializerImpl(node);
      }
      else if (type == FOR_ITERATOR) {
        return new CSharpForIteratorImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new CSharpForStatementImpl(node);
      }
      else if (type == FROM_CLAUSE) {
        return new CSharpFromClauseImpl(node);
      }
      else if (type == GENERAL_CATCH_CLAUSE) {
        return new CSharpGeneralCatchClauseImpl(node);
      }
      else if (type == GENERIC_DIMENSION_SPECIFIER) {
        return new CSharpGenericDimensionSpecifierImpl(node);
      }
      else if (type == GET_ACCESSOR_DECLARATION) {
        return new CSharpGetAccessorDeclarationImpl(node);
      }
      else if (type == GLOBAL_ATTRIBUTES) {
        return new CSharpGlobalAttributesImpl(node);
      }
      else if (type == GLOBAL_ATTRIBUTE_SECTION) {
        return new CSharpGlobalAttributeSectionImpl(node);
      }
      else if (type == GLOBAL_ATTRIBUTE_SECTIONS) {
        return new CSharpGlobalAttributeSectionsImpl(node);
      }
      else if (type == GLOBAL_ATTRIBUTE_TARGET) {
        return new CSharpGlobalAttributeTargetImpl(node);
      }
      else if (type == GLOBAL_ATTRIBUTE_TARGET_SPECIFIER) {
        return new CSharpGlobalAttributeTargetSpecifierImpl(node);
      }
      else if (type == GOTO_STATEMENT) {
        return new CSharpGotoStatementImpl(node);
      }
      else if (type == GROUP_CLAUSE) {
        return new CSharpGroupClauseImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new CSharpIfStatementImpl(node);
      }
      else if (type == IMPLICIT_ANONYMOUS_FUNCTION_PARAMETER) {
        return new CSharpImplicitAnonymousFunctionParameterImpl(node);
      }
      else if (type == IMPLICIT_ANONYMOUS_FUNCTION_PARAMETER_LIST) {
        return new CSharpImplicitAnonymousFunctionParameterListImpl(node);
      }
      else if (type == IMPLICIT_ANONYMOUS_FUNCTION_SIGNATURE) {
        return new CSharpImplicitAnonymousFunctionSignatureImpl(node);
      }
      else if (type == INDEXER_DECLARATION) {
        return new CSharpIndexerDeclarationImpl(node);
      }
      else if (type == INDEXER_DECLARATOR) {
        return new CSharpIndexerDeclaratorImpl(node);
      }
      else if (type == INDEXER_MODIFIER) {
        return new CSharpIndexerModifierImpl(node);
      }
      else if (type == INDEXER_MODIFIERS) {
        return new CSharpIndexerModifiersImpl(node);
      }
      else if (type == INITIALIZER_VALUE) {
        return new CSharpInitializerValueImpl(node);
      }
      else if (type == INTEGRAL_TYPE) {
        return new CSharpIntegralTypeImpl(node);
      }
      else if (type == INTERFACE_ACCESSORS) {
        return new CSharpInterfaceAccessorsImpl(node);
      }
      else if (type == INTERFACE_BASE) {
        return new CSharpInterfaceBaseImpl(node);
      }
      else if (type == INTERFACE_BODY) {
        return new CSharpInterfaceBodyImpl(node);
      }
      else if (type == INTERFACE_DECLARATION) {
        return new CSharpInterfaceDeclarationImpl(node);
      }
      else if (type == INTERFACE_EVENT_DECLARATION) {
        return new CSharpInterfaceEventDeclarationImpl(node);
      }
      else if (type == INTERFACE_INDEXER_DECLARATION) {
        return new CSharpInterfaceIndexerDeclarationImpl(node);
      }
      else if (type == INTERFACE_MEMBER_DECLARATION) {
        return new CSharpInterfaceMemberDeclarationImpl(node);
      }
      else if (type == INTERFACE_MEMBER_DECLARATIONS) {
        return new CSharpInterfaceMemberDeclarationsImpl(node);
      }
      else if (type == INTERFACE_METHOD_DECLARATION) {
        return new CSharpInterfaceMethodDeclarationImpl(node);
      }
      else if (type == INTERFACE_MODIFIER) {
        return new CSharpInterfaceModifierImpl(node);
      }
      else if (type == INTERFACE_MODIFIERS) {
        return new CSharpInterfaceModifiersImpl(node);
      }
      else if (type == INTERFACE_PROPERTY_DECLARATION) {
        return new CSharpInterfacePropertyDeclarationImpl(node);
      }
      else if (type == INTERFACE_TYPE) {
        return new CSharpInterfaceTypeImpl(node);
      }
      else if (type == INTERFACE_TYPE_LIST) {
        return new CSharpInterfaceTypeListImpl(node);
      }
      else if (type == INVOCATION_EXPRESSION) {
        return new CSharpInvocationExpressionImpl(node);
      }
      else if (type == ITERATION_STATEMENT) {
        return new CSharpIterationStatementImpl(node);
      }
      else if (type == JOIN_CLAUSE) {
        return new CSharpJoinClauseImpl(node);
      }
      else if (type == JOIN_INTO_CLAUSE) {
        return new CSharpJoinIntoClauseImpl(node);
      }
      else if (type == JUMP_STATEMENT) {
        return new CSharpJumpStatementImpl(node);
      }
      else if (type == LABELED_STATEMENT) {
        return new CSharpLabeledStatementImpl(node);
      }
      else if (type == LAMBDA_EXPRESSION) {
        return new CSharpLambdaExpressionImpl(node);
      }
      else if (type == LET_CLAUSE) {
        return new CSharpLetClauseImpl(node);
      }
      else if (type == LOCAL_CONSTANT_DECLARATION) {
        return new CSharpLocalConstantDeclarationImpl(node);
      }
      else if (type == LOCAL_VARIABLE_DECLARATION) {
        return new CSharpLocalVariableDeclarationImpl(node);
      }
      else if (type == LOCAL_VARIABLE_DECLARATOR) {
        return new CSharpLocalVariableDeclaratorImpl(node);
      }
      else if (type == LOCAL_VARIABLE_DECLARATORS) {
        return new CSharpLocalVariableDeclaratorsImpl(node);
      }
      else if (type == LOCAL_VARIABLE_INITIALIZER) {
        return new CSharpLocalVariableInitializerImpl(node);
      }
      else if (type == LOCAL_VARIABLE_TYPE) {
        return new CSharpLocalVariableTypeImpl(node);
      }
      else if (type == LOCK_STATEMENT) {
        return new CSharpLockStatementImpl(node);
      }
      else if (type == MEMBER_ACCESS) {
        return new CSharpMemberAccessImpl(node);
      }
      else if (type == MEMBER_DECLARATOR) {
        return new CSharpMemberDeclaratorImpl(node);
      }
      else if (type == MEMBER_DECLARATOR_LIST) {
        return new CSharpMemberDeclaratorListImpl(node);
      }
      else if (type == MEMBER_INITIALIZER) {
        return new CSharpMemberInitializerImpl(node);
      }
      else if (type == MEMBER_INITIALIZER_LIST) {
        return new CSharpMemberInitializerListImpl(node);
      }
      else if (type == MEMBER_NAME) {
        return new CSharpMemberNameImpl(node);
      }
      else if (type == METHOD_BODY) {
        return new CSharpMethodBodyImpl(node);
      }
      else if (type == METHOD_DECLARATION) {
        return new CSharpMethodDeclarationImpl(node);
      }
      else if (type == METHOD_HEADER) {
        return new CSharpMethodHeaderImpl(node);
      }
      else if (type == METHOD_MODIFIER) {
        return new CSharpMethodModifierImpl(node);
      }
      else if (type == METHOD_MODIFIERS) {
        return new CSharpMethodModifiersImpl(node);
      }
      else if (type == NAMED_ARGUMENT) {
        return new CSharpNamedArgumentImpl(node);
      }
      else if (type == NAMED_ARGUMENT_LIST) {
        return new CSharpNamedArgumentListImpl(node);
      }
      else if (type == NAMESPACE_BODY) {
        return new CSharpNamespaceBodyImpl(node);
      }
      else if (type == NAMESPACE_DECLARATION) {
        return new CSharpNamespaceDeclarationImpl(node);
      }
      else if (type == NAMESPACE_MEMBER_DECLARATION) {
        return new CSharpNamespaceMemberDeclarationImpl(node);
      }
      else if (type == NAMESPACE_MEMBER_DECLARATIONS) {
        return new CSharpNamespaceMemberDeclarationsImpl(node);
      }
      else if (type == NAMESPACE_OR_TYPE_NAME) {
        return new CSharpNamespaceOrTypeNameImpl(node);
      }
      else if (type == NON_ARRAY_TYPE) {
        return new CSharpNonArrayTypeImpl(node);
      }
      else if (type == NON_ASSIGNMENT_EXPRESSION) {
        return new CSharpNonAssignmentExpressionImpl(node);
      }
      else if (type == NUMERIC_TYPE) {
        return new CSharpNumericTypeImpl(node);
      }
      else if (type == OBJECT_CREATION_EXPRESSION) {
        return new CSharpObjectCreationExpressionImpl(node);
      }
      else if (type == OBJECT_INITIALIZER) {
        return new CSharpObjectInitializerImpl(node);
      }
      else if (type == OBJECT_OR_COLLECTION_INITIALIZER) {
        return new CSharpObjectOrCollectionInitializerImpl(node);
      }
      else if (type == OPERATOR_BODY) {
        return new CSharpOperatorBodyImpl(node);
      }
      else if (type == OPERATOR_DECLARATION) {
        return new CSharpOperatorDeclarationImpl(node);
      }
      else if (type == OPERATOR_DECLARATOR) {
        return new CSharpOperatorDeclaratorImpl(node);
      }
      else if (type == OPERATOR_MODIFIER) {
        return new CSharpOperatorModifierImpl(node);
      }
      else if (type == OPERATOR_MODIFIERS) {
        return new CSharpOperatorModifiersImpl(node);
      }
      else if (type == ORDERBY_CLAUSE) {
        return new CSharpOrderbyClauseImpl(node);
      }
      else if (type == ORDERING) {
        return new CSharpOrderingImpl(node);
      }
      else if (type == ORDERINGS) {
        return new CSharpOrderingsImpl(node);
      }
      else if (type == ORDERING_DIRECTION) {
        return new CSharpOrderingDirectionImpl(node);
      }
      else if (type == OVERLOADABLE_BINARY_OPERATOR) {
        return new CSharpOverloadableBinaryOperatorImpl(node);
      }
      else if (type == OVERLOADABLE_UNARY_OPERATOR) {
        return new CSharpOverloadableUnaryOperatorImpl(node);
      }
      else if (type == PARAMETER_ARRAY) {
        return new CSharpParameterArrayImpl(node);
      }
      else if (type == PARAMETER_MODIFIER) {
        return new CSharpParameterModifierImpl(node);
      }
      else if (type == PARENTHESIZED_EXPRESSION) {
        return new CSharpParenthesizedExpressionImpl(node);
      }
      else if (type == POSITIONAL_ARGUMENT) {
        return new CSharpPositionalArgumentImpl(node);
      }
      else if (type == POSITIONAL_ARGUMENT_LIST) {
        return new CSharpPositionalArgumentListImpl(node);
      }
      else if (type == POST_DECREMENT_EXPRESSION) {
        return new CSharpPostDecrementExpressionImpl(node);
      }
      else if (type == POST_INCREMENT_EXPRESSION) {
        return new CSharpPostIncrementExpressionImpl(node);
      }
      else if (type == PREDEFINED_TYPE) {
        return new CSharpPredefinedTypeImpl(node);
      }
      else if (type == PRE_DECREMENT_EXPRESSION) {
        return new CSharpPreDecrementExpressionImpl(node);
      }
      else if (type == PRE_INCREMENT_EXPRESSION) {
        return new CSharpPreIncrementExpressionImpl(node);
      }
      else if (type == PRIMARY_CONSTRAINT) {
        return new CSharpPrimaryConstraintImpl(node);
      }
      else if (type == PRIMARY_EXPRESSION) {
        return new CSharpPrimaryExpressionImpl(node);
      }
      else if (type == PROPERTY_DECLARATION) {
        return new CSharpPropertyDeclarationImpl(node);
      }
      else if (type == PROPERTY_MODIFIER) {
        return new CSharpPropertyModifierImpl(node);
      }
      else if (type == PROPERTY_MODIFIERS) {
        return new CSharpPropertyModifiersImpl(node);
      }
      else if (type == QUALIFIED_ALIAS_MEMBER) {
        return new CSharpQualifiedAliasMemberImpl(node);
      }
      else if (type == QUALIFIED_IDENTIFIER) {
        return new CSharpQualifiedIdentifierImpl(node);
      }
      else if (type == QUERY_BODY) {
        return new CSharpQueryBodyImpl(node);
      }
      else if (type == QUERY_BODY_CLAUSE) {
        return new CSharpQueryBodyClauseImpl(node);
      }
      else if (type == QUERY_BODY_CLAUSES) {
        return new CSharpQueryBodyClausesImpl(node);
      }
      else if (type == QUERY_CONTINUATION) {
        return new CSharpQueryContinuationImpl(node);
      }
      else if (type == QUERY_EXPRESSION) {
        return new CSharpQueryExpressionImpl(node);
      }
      else if (type == RANK_SPECIFIER) {
        return new CSharpRankSpecifierImpl(node);
      }
      else if (type == RANK_SPECIFIERS) {
        return new CSharpRankSpecifiersImpl(node);
      }
      else if (type == REMOVE_ACCESSOR_DECLARATION) {
        return new CSharpRemoveAccessorDeclarationImpl(node);
      }
      else if (type == RESOURCE_ACQUISITION) {
        return new CSharpResourceAcquisitionImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new CSharpReturnStatementImpl(node);
      }
      else if (type == RETURN_TYPE) {
        return new CSharpReturnTypeImpl(node);
      }
      else if (type == RIGHT_SHIFT) {
        return new CSharpRightShiftImpl(node);
      }
      else if (type == RIGHT_SHIFT_ASSIGNMENT) {
        return new CSharpRightShiftAssignmentImpl(node);
      }
      else if (type == SECONDARY_CONSTRAINTS) {
        return new CSharpSecondaryConstraintsImpl(node);
      }
      else if (type == SELECTION_STATEMENT) {
        return new CSharpSelectionStatementImpl(node);
      }
      else if (type == SELECT_CLAUSE) {
        return new CSharpSelectClauseImpl(node);
      }
      else if (type == SELECT_OR_GROUP_CLAUSE) {
        return new CSharpSelectOrGroupClauseImpl(node);
      }
      else if (type == SET_ACCESSOR_DECLARATION) {
        return new CSharpSetAccessorDeclarationImpl(node);
      }
      else if (type == SIMPLE_NAME) {
        return new CSharpSimpleNameImpl(node);
      }
      else if (type == SIMPLE_TYPE) {
        return new CSharpSimpleTypeImpl(node);
      }
      else if (type == SPECIFIC_CATCH_CLAUSE) {
        return new CSharpSpecificCatchClauseImpl(node);
      }
      else if (type == SPECIFIC_CATCH_CLAUSES) {
        return new CSharpSpecificCatchClausesImpl(node);
      }
      else if (type == STATEMENT) {
        return new CSharpStatementImpl(node);
      }
      else if (type == STATEMENT_EXPRESSION) {
        return new CSharpStatementExpressionImpl(node);
      }
      else if (type == STATEMENT_EXPRESSION_LIST) {
        return new CSharpStatementExpressionListImpl(node);
      }
      else if (type == STATEMENT_LIST) {
        return new CSharpStatementListImpl(node);
      }
      else if (type == STATIC_CONSTRUCTOR_BODY) {
        return new CSharpStaticConstructorBodyImpl(node);
      }
      else if (type == STATIC_CONSTRUCTOR_DECLARATION) {
        return new CSharpStaticConstructorDeclarationImpl(node);
      }
      else if (type == STATIC_CONSTRUCTOR_MODIFIERS) {
        return new CSharpStaticConstructorModifiersImpl(node);
      }
      else if (type == STRUCT_BODY) {
        return new CSharpStructBodyImpl(node);
      }
      else if (type == STRUCT_DECLARATION) {
        return new CSharpStructDeclarationImpl(node);
      }
      else if (type == STRUCT_INTERFACES) {
        return new CSharpStructInterfacesImpl(node);
      }
      else if (type == STRUCT_MEMBER_DECLARATION) {
        return new CSharpStructMemberDeclarationImpl(node);
      }
      else if (type == STRUCT_MEMBER_DECLARATIONS) {
        return new CSharpStructMemberDeclarationsImpl(node);
      }
      else if (type == STRUCT_MODIFIER) {
        return new CSharpStructModifierImpl(node);
      }
      else if (type == STRUCT_MODIFIERS) {
        return new CSharpStructModifiersImpl(node);
      }
      else if (type == SWITCH_BLOCK) {
        return new CSharpSwitchBlockImpl(node);
      }
      else if (type == SWITCH_LABEL) {
        return new CSharpSwitchLabelImpl(node);
      }
      else if (type == SWITCH_LABELS) {
        return new CSharpSwitchLabelsImpl(node);
      }
      else if (type == SWITCH_SECTION) {
        return new CSharpSwitchSectionImpl(node);
      }
      else if (type == SWITCH_SECTIONS) {
        return new CSharpSwitchSectionsImpl(node);
      }
      else if (type == SWITCH_STATEMENT) {
        return new CSharpSwitchStatementImpl(node);
      }
      else if (type == THIS_ACCESS) {
        return new CSharpThisAccessImpl(node);
      }
      else if (type == THROW_STATEMENT) {
        return new CSharpThrowStatementImpl(node);
      }
      else if (type == TRY_STATEMENT) {
        return new CSharpTryStatementImpl(node);
      }
      else if (type == TYPE) {
        return new CSharpTypeImpl(node);
      }
      else if (type == TYPEOF_EXPRESSION) {
        return new CSharpTypeofExpressionImpl(node);
      }
      else if (type == TYPE_ARGUMENT) {
        return new CSharpTypeArgumentImpl(node);
      }
      else if (type == TYPE_ARGUMENTS) {
        return new CSharpTypeArgumentsImpl(node);
      }
      else if (type == TYPE_ARGUMENT_LIST) {
        return new CSharpTypeArgumentListImpl(node);
      }
      else if (type == TYPE_DECLARATION) {
        return new CSharpTypeDeclarationImpl(node);
      }
      else if (type == TYPE_NAME) {
        return new CSharpTypeNameImpl(node);
      }
      else if (type == TYPE_PARAMETER) {
        return new CSharpTypeParameterImpl(node);
      }
      else if (type == TYPE_PARAMETERS) {
        return new CSharpTypeParametersImpl(node);
      }
      else if (type == TYPE_PARAMETER_CONSTRAINTS) {
        return new CSharpTypeParameterConstraintsImpl(node);
      }
      else if (type == TYPE_PARAMETER_CONSTRAINTS_CLAUSE) {
        return new CSharpTypeParameterConstraintsClauseImpl(node);
      }
      else if (type == TYPE_PARAMETER_CONSTRAINTS_CLAUSES) {
        return new CSharpTypeParameterConstraintsClausesImpl(node);
      }
      else if (type == TYPE_PARAMETER_LIST) {
        return new CSharpTypeParameterListImpl(node);
      }
      else if (type == UNARY_EXPRESSION) {
        return new CSharpUnaryExpressionImpl(node);
      }
      else if (type == UNARY_OPERATOR_DECLARATOR) {
        return new CSharpUnaryOperatorDeclaratorImpl(node);
      }
      else if (type == UNCHECKED_EXPRESSION) {
        return new CSharpUncheckedExpressionImpl(node);
      }
      else if (type == UNCHECKED_STATEMENT) {
        return new CSharpUncheckedStatementImpl(node);
      }
      else if (type == USING_ALIAS_DIRECTIVE) {
        return new CSharpUsingAliasDirectiveImpl(node);
      }
      else if (type == USING_DIRECTIVE) {
        return new CSharpUsingDirectiveImpl(node);
      }
      else if (type == USING_DIRECTIVES) {
        return new CSharpUsingDirectivesImpl(node);
      }
      else if (type == USING_NAMESPACE_DIRECTIVE) {
        return new CSharpUsingNamespaceDirectiveImpl(node);
      }
      else if (type == USING_STATEMENT) {
        return new CSharpUsingStatementImpl(node);
      }
      else if (type == VARIABLE_DECLARATOR) {
        return new CSharpVariableDeclaratorImpl(node);
      }
      else if (type == VARIABLE_DECLARATORS) {
        return new CSharpVariableDeclaratorsImpl(node);
      }
      else if (type == VARIABLE_INITIALIZER) {
        return new CSharpVariableInitializerImpl(node);
      }
      else if (type == VARIABLE_INITIALIZER_LIST) {
        return new CSharpVariableInitializerListImpl(node);
      }
      else if (type == VARIABLE_REFERENCE) {
        return new CSharpVariableReferenceImpl(node);
      }
      else if (type == VARIANCE_ANNOTATION) {
        return new CSharpVarianceAnnotationImpl(node);
      }
      else if (type == VARIANT_TYPE_PARAMETER) {
        return new CSharpVariantTypeParameterImpl(node);
      }
      else if (type == VARIANT_TYPE_PARAMETERS) {
        return new CSharpVariantTypeParametersImpl(node);
      }
      else if (type == VARIANT_TYPE_PARAMETER_LIST) {
        return new CSharpVariantTypeParameterListImpl(node);
      }
      else if (type == WHERE_CLAUSE) {
        return new CSharpWhereClauseImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new CSharpWhileStatementImpl(node);
      }
      else if (type == YIELD_STATEMENT) {
        return new CSharpYieldStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
