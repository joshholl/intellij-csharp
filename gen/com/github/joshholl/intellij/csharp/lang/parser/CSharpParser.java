// This is a generated file. Not intended for manual editing.
package com.github.joshholl.intellij.csharp.lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.joshholl.intellij.csharp.lang.lexer.CSharpTokenTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CSharpParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ACCESSOR_BODY) {
      r = accessor_body(b, 0);
    }
    else if (t == ACCESSOR_DECLARATIONS) {
      r = accessor_declarations(b, 0);
    }
    else if (t == ACCESSOR_MODIFIER) {
      r = accessor_modifier(b, 0);
    }
    else if (t == ADD_ACCESSOR_DECLARATION) {
      r = add_accessor_declaration(b, 0);
    }
    else if (t == ANONYMOUS_FUNCTION_BODY) {
      r = anonymous_function_body(b, 0);
    }
    else if (t == ANONYMOUS_FUNCTION_PARAMETER_MODIFIER) {
      r = anonymous_function_parameter_modifier(b, 0);
    }
    else if (t == ANONYMOUS_FUNCTION_SIGNATURE) {
      r = anonymous_function_signature(b, 0);
    }
    else if (t == ANONYMOUS_METHOD_EXPRESSION) {
      r = anonymous_method_expression(b, 0);
    }
    else if (t == ANONYMOUS_OBJECT_CREATION_EXPRESSION) {
      r = anonymous_object_creation_expression(b, 0);
    }
    else if (t == ANONYMOUS_OBJECT_INITIALIZER) {
      r = anonymous_object_initializer(b, 0);
    }
    else if (t == ARGUMENT) {
      r = argument(b, 0);
    }
    else if (t == ARGUMENT_LIST) {
      r = argument_list(b, 0);
    }
    else if (t == ARGUMENT_NAME) {
      r = argument_name(b, 0);
    }
    else if (t == ARGUMENT_VALUE) {
      r = argument_value(b, 0);
    }
    else if (t == ARRAY_CREATION_EXPRESSION) {
      r = array_creation_expression(b, 0);
    }
    else if (t == ARRAY_INITIALIZER) {
      r = array_initializer(b, 0);
    }
    else if (t == ARRAY_TYPE) {
      r = array_type(b, 0);
    }
    else if (t == ASSIGNMENT) {
      r = assignment(b, 0);
    }
    else if (t == ASSIGNMENT_OPERATOR) {
      r = assignment_operator(b, 0);
    }
    else if (t == ATTRIBUTE) {
      r = attribute(b, 0);
    }
    else if (t == ATTRIBUTE_ARGUMENT_EXPRESSION) {
      r = attribute_argument_expression(b, 0);
    }
    else if (t == ATTRIBUTE_ARGUMENTS) {
      r = attribute_arguments(b, 0);
    }
    else if (t == ATTRIBUTE_LIST) {
      r = attribute_list(b, 0);
    }
    else if (t == ATTRIBUTE_NAME) {
      r = attribute_name(b, 0);
    }
    else if (t == ATTRIBUTE_SECTION) {
      r = attribute_section(b, 0);
    }
    else if (t == ATTRIBUTE_SECTIONS) {
      r = attribute_sections(b, 0);
    }
    else if (t == ATTRIBUTE_TARGET) {
      r = attribute_target(b, 0);
    }
    else if (t == ATTRIBUTE_TARGET_SPECIFIER) {
      r = attribute_target_specifier(b, 0);
    }
    else if (t == ATTRIBUTES) {
      r = attributes(b, 0);
    }
    else if (t == BASE_ACCESS) {
      r = base_access(b, 0);
    }
    else if (t == BINARY_OPERATOR_DECLARATOR) {
      r = binary_operator_declarator(b, 0);
    }
    else if (t == BLOCK) {
      r = block(b, 0);
    }
    else if (t == BOOLEAN_EXPRESSION) {
      r = boolean_expression(b, 0);
    }
    else if (t == BREAK_STATEMENT) {
      r = break_statement(b, 0);
    }
    else if (t == CAST_EXPRESSION) {
      r = cast_expression(b, 0);
    }
    else if (t == CATCH_CLAUSES) {
      r = catch_clauses(b, 0);
    }
    else if (t == CHECKED_EXPRESSION) {
      r = checked_expression(b, 0);
    }
    else if (t == CHECKED_STATEMENT) {
      r = checked_statement(b, 0);
    }
    else if (t == CLASS_BASE) {
      r = class_base(b, 0);
    }
    else if (t == CLASS_BODY) {
      r = class_body(b, 0);
    }
    else if (t == CLASS_DECLARATION) {
      r = class_declaration(b, 0);
    }
    else if (t == CLASS_MEMBER_DECLARATION) {
      r = class_member_declaration(b, 0);
    }
    else if (t == CLASS_MEMBER_DECLARATIONS) {
      r = class_member_declarations(b, 0);
    }
    else if (t == CLASS_MODIFIER) {
      r = class_modifier(b, 0);
    }
    else if (t == CLASS_MODIFIERS) {
      r = class_modifiers(b, 0);
    }
    else if (t == CLASS_TYPE) {
      r = class_type(b, 0);
    }
    else if (t == COLLECTION_INITIALIZER) {
      r = collection_initializer(b, 0);
    }
    else if (t == COMPARATIVE_EXPRESSION) {
      r = comparative_expression(b, 0);
    }
    else if (t == COMPILATION_UNIT) {
      r = compilation_unit(b, 0);
    }
    else if (t == CONDITIONAL_EXPRESSION) {
      r = conditional_expression(b, 0);
    }
    else if (t == CONSTANT_DECLARATION) {
      r = constant_declaration(b, 0);
    }
    else if (t == CONSTANT_DECLARATOR) {
      r = constant_declarator(b, 0);
    }
    else if (t == CONSTANT_DECLARATORS) {
      r = constant_declarators(b, 0);
    }
    else if (t == CONSTANT_EXPRESSION) {
      r = constant_expression(b, 0);
    }
    else if (t == CONSTANT_MODIFIER) {
      r = constant_modifier(b, 0);
    }
    else if (t == CONSTANT_MODIFIERS) {
      r = constant_modifiers(b, 0);
    }
    else if (t == CONSTRUCTOR_BODY) {
      r = constructor_body(b, 0);
    }
    else if (t == CONSTRUCTOR_CONSTRAINT) {
      r = constructor_constraint(b, 0);
    }
    else if (t == CONSTRUCTOR_DECLARATION) {
      r = constructor_declaration(b, 0);
    }
    else if (t == CONSTRUCTOR_DECLARATOR) {
      r = constructor_declarator(b, 0);
    }
    else if (t == CONSTRUCTOR_INITIALIZER) {
      r = constructor_initializer(b, 0);
    }
    else if (t == CONSTRUCTOR_MODIFIER) {
      r = constructor_modifier(b, 0);
    }
    else if (t == CONSTRUCTOR_MODIFIERS) {
      r = constructor_modifiers(b, 0);
    }
    else if (t == CONTINUE_STATEMENT) {
      r = continue_statement(b, 0);
    }
    else if (t == CONVERSION_OPERATOR_DECLARATOR) {
      r = conversion_operator_declarator(b, 0);
    }
    else if (t == DECLARATION_STATEMENT) {
      r = declaration_statement(b, 0);
    }
    else if (t == DEFAULT_ARGUMENT) {
      r = default_argument(b, 0);
    }
    else if (t == DEFAULT_VALUE_EXPRESSION) {
      r = default_value_expression(b, 0);
    }
    else if (t == DELEGATE_CREATION_EXPRESSION) {
      r = delegate_creation_expression(b, 0);
    }
    else if (t == DELEGATE_DECLARATION) {
      r = delegate_declaration(b, 0);
    }
    else if (t == DELEGATE_MODIFIER) {
      r = delegate_modifier(b, 0);
    }
    else if (t == DELEGATE_MODIFIERS) {
      r = delegate_modifiers(b, 0);
    }
    else if (t == DELEGATE_TYPE) {
      r = delegate_type(b, 0);
    }
    else if (t == DESTRUCTOR_BODY) {
      r = destructor_body(b, 0);
    }
    else if (t == DESTRUCTOR_DECLARATION) {
      r = destructor_declaration(b, 0);
    }
    else if (t == DIM_SEPARATORS) {
      r = dim_separators(b, 0);
    }
    else if (t == DO_STATEMENT) {
      r = do_statement(b, 0);
    }
    else if (t == ELEMENT_INITIALIZER) {
      r = element_initializer(b, 0);
    }
    else if (t == ELEMENT_INITIALIZER_LIST) {
      r = element_initializer_list(b, 0);
    }
    else if (t == EMBEDDED_STATEMENT) {
      r = embedded_statement(b, 0);
    }
    else if (t == EMPTY_STATEMENT) {
      r = empty_statement(b, 0);
    }
    else if (t == ENUM_BASE) {
      r = enum_base(b, 0);
    }
    else if (t == ENUM_BODY) {
      r = enum_body(b, 0);
    }
    else if (t == ENUM_DECLARATION) {
      r = enum_declaration(b, 0);
    }
    else if (t == ENUM_MEMBER_DECLARATION) {
      r = enum_member_declaration(b, 0);
    }
    else if (t == ENUM_MEMBER_DECLARATIONS) {
      r = enum_member_declarations(b, 0);
    }
    else if (t == ENUM_MODIFIER) {
      r = enum_modifier(b, 0);
    }
    else if (t == ENUM_MODIFIERS) {
      r = enum_modifiers(b, 0);
    }
    else if (t == ENUM_TYPE) {
      r = enum_type(b, 0);
    }
    else if (t == EVENT_ACCESSOR_DECLARATIONS) {
      r = event_accessor_declarations(b, 0);
    }
    else if (t == EVENT_DECLARATION) {
      r = event_declaration(b, 0);
    }
    else if (t == EVENT_MODIFIER) {
      r = event_modifier(b, 0);
    }
    else if (t == EVENT_MODIFIERS) {
      r = event_modifiers(b, 0);
    }
    else if (t == EXPLICIT_ANONYMOUS_FUNCTION_PARAMETER) {
      r = explicit_anonymous_function_parameter(b, 0);
    }
    else if (t == EXPLICIT_ANONYMOUS_FUNCTION_PARAMETER_LIST) {
      r = explicit_anonymous_function_parameter_list(b, 0);
    }
    else if (t == EXPLICIT_ANONYMOUS_FUNCTION_SIGNATURE) {
      r = explicit_anonymous_function_signature(b, 0);
    }
    else if (t == EXPRESSION) {
      r = expression(b, 0);
    }
    else if (t == EXPRESSION_LIST) {
      r = expression_list(b, 0);
    }
    else if (t == EXPRESSION_STATEMENT) {
      r = expression_statement(b, 0);
    }
    else if (t == EXTERN_ALIAS_DIRECTIVE) {
      r = extern_alias_directive(b, 0);
    }
    else if (t == EXTERN_ALIAS_DIRECTIVES) {
      r = extern_alias_directives(b, 0);
    }
    else if (t == FIELD_DECLARATION) {
      r = field_declaration(b, 0);
    }
    else if (t == FIELD_MODIFIER) {
      r = field_modifier(b, 0);
    }
    else if (t == FIELD_MODIFIERS) {
      r = field_modifiers(b, 0);
    }
    else if (t == FINALLY_CLAUSE) {
      r = finally_clause(b, 0);
    }
    else if (t == FIXED_PARAMETER) {
      r = fixed_parameter(b, 0);
    }
    else if (t == FIXED_PARAMETERS) {
      r = fixed_parameters(b, 0);
    }
    else if (t == FLOATING_POINT_TYPE) {
      r = floating_point_type(b, 0);
    }
    else if (t == FOR_CONDITION) {
      r = for_condition(b, 0);
    }
    else if (t == FOR_INITIALIZER) {
      r = for_initializer(b, 0);
    }
    else if (t == FOR_ITERATOR) {
      r = for_iterator(b, 0);
    }
    else if (t == FOR_STATEMENT) {
      r = for_statement(b, 0);
    }
    else if (t == FOREACH_STATEMENT) {
      r = foreach_statement(b, 0);
    }
    else if (t == FORMAL_PARAMETER_LIST) {
      r = formal_parameter_list(b, 0);
    }
    else if (t == FROM_CLAUSE) {
      r = from_clause(b, 0);
    }
    else if (t == GENERAL_CATCH_CLAUSE) {
      r = general_catch_clause(b, 0);
    }
    else if (t == GENERIC_DIMENSION_SPECIFIER) {
      r = generic_dimension_specifier(b, 0);
    }
    else if (t == GET_ACCESSOR_DECLARATION) {
      r = get_accessor_declaration(b, 0);
    }
    else if (t == GLOBAL_ATTRIBUTE_SECTION) {
      r = global_attribute_section(b, 0);
    }
    else if (t == GLOBAL_ATTRIBUTE_SECTIONS) {
      r = global_attribute_sections(b, 0);
    }
    else if (t == GLOBAL_ATTRIBUTE_TARGET) {
      r = global_attribute_target(b, 0);
    }
    else if (t == GLOBAL_ATTRIBUTE_TARGET_SPECIFIER) {
      r = global_attribute_target_specifier(b, 0);
    }
    else if (t == GLOBAL_ATTRIBUTES) {
      r = global_attributes(b, 0);
    }
    else if (t == GOTO_STATEMENT) {
      r = goto_statement(b, 0);
    }
    else if (t == GROUP_CLAUSE) {
      r = group_clause(b, 0);
    }
    else if (t == IF_STATEMENT) {
      r = if_statement(b, 0);
    }
    else if (t == IMPLICIT_ANONYMOUS_FUNCTION_PARAMETER) {
      r = implicit_anonymous_function_parameter(b, 0);
    }
    else if (t == IMPLICIT_ANONYMOUS_FUNCTION_PARAMETER_LIST) {
      r = implicit_anonymous_function_parameter_list(b, 0);
    }
    else if (t == IMPLICIT_ANONYMOUS_FUNCTION_SIGNATURE) {
      r = implicit_anonymous_function_signature(b, 0);
    }
    else if (t == INDEXER_DECLARATION) {
      r = indexer_declaration(b, 0);
    }
    else if (t == INDEXER_DECLARATOR) {
      r = indexer_declarator(b, 0);
    }
    else if (t == INDEXER_MODIFIER) {
      r = indexer_modifier(b, 0);
    }
    else if (t == INDEXER_MODIFIERS) {
      r = indexer_modifiers(b, 0);
    }
    else if (t == INITIALIZER_VALUE) {
      r = initializer_value(b, 0);
    }
    else if (t == INTEGRAL_TYPE) {
      r = integral_type(b, 0);
    }
    else if (t == INTERFACE_ACCESSORS) {
      r = interface_accessors(b, 0);
    }
    else if (t == INTERFACE_BASE) {
      r = interface_base(b, 0);
    }
    else if (t == INTERFACE_BODY) {
      r = interface_body(b, 0);
    }
    else if (t == INTERFACE_DECLARATION) {
      r = interface_declaration(b, 0);
    }
    else if (t == INTERFACE_EVENT_DECLARATION) {
      r = interface_event_declaration(b, 0);
    }
    else if (t == INTERFACE_INDEXER_DECLARATION) {
      r = interface_indexer_declaration(b, 0);
    }
    else if (t == INTERFACE_MEMBER_DECLARATION) {
      r = interface_member_declaration(b, 0);
    }
    else if (t == INTERFACE_MEMBER_DECLARATIONS) {
      r = interface_member_declarations(b, 0);
    }
    else if (t == INTERFACE_METHOD_DECLARATION) {
      r = interface_method_declaration(b, 0);
    }
    else if (t == INTERFACE_MODIFIER) {
      r = interface_modifier(b, 0);
    }
    else if (t == INTERFACE_MODIFIERS) {
      r = interface_modifiers(b, 0);
    }
    else if (t == INTERFACE_PROPERTY_DECLARATION) {
      r = interface_property_declaration(b, 0);
    }
    else if (t == INTERFACE_TYPE) {
      r = interface_type(b, 0);
    }
    else if (t == INTERFACE_TYPE_LIST) {
      r = interface_type_list(b, 0);
    }
    else if (t == INVOCATION_EXPRESSION) {
      r = invocation_expression(b, 0);
    }
    else if (t == ITERATION_STATEMENT) {
      r = iteration_statement(b, 0);
    }
    else if (t == JOIN_CLAUSE) {
      r = join_clause(b, 0);
    }
    else if (t == JOIN_INTO_CLAUSE) {
      r = join_into_clause(b, 0);
    }
    else if (t == JUMP_STATEMENT) {
      r = jump_statement(b, 0);
    }
    else if (t == LABELED_STATEMENT) {
      r = labeled_statement(b, 0);
    }
    else if (t == LAMBDA_EXPRESSION) {
      r = lambda_expression(b, 0);
    }
    else if (t == LET_CLAUSE) {
      r = let_clause(b, 0);
    }
    else if (t == LOCAL_CONSTANT_DECLARATION) {
      r = local_constant_declaration(b, 0);
    }
    else if (t == LOCAL_VARIABLE_DECLARATION) {
      r = local_variable_declaration(b, 0);
    }
    else if (t == LOCAL_VARIABLE_DECLARATOR) {
      r = local_variable_declarator(b, 0);
    }
    else if (t == LOCAL_VARIABLE_DECLARATORS) {
      r = local_variable_declarators(b, 0);
    }
    else if (t == LOCAL_VARIABLE_INITIALIZER) {
      r = local_variable_initializer(b, 0);
    }
    else if (t == LOCAL_VARIABLE_TYPE) {
      r = local_variable_type(b, 0);
    }
    else if (t == LOCK_STATEMENT) {
      r = lock_statement(b, 0);
    }
    else if (t == MEMBER_ACCESS) {
      r = member_access(b, 0);
    }
    else if (t == MEMBER_DECLARATOR) {
      r = member_declarator(b, 0);
    }
    else if (t == MEMBER_DECLARATOR_LIST) {
      r = member_declarator_list(b, 0);
    }
    else if (t == MEMBER_INITIALIZER) {
      r = member_initializer(b, 0);
    }
    else if (t == MEMBER_INITIALIZER_LIST) {
      r = member_initializer_list(b, 0);
    }
    else if (t == MEMBER_NAME) {
      r = member_name(b, 0);
    }
    else if (t == METHOD_BODY) {
      r = method_body(b, 0);
    }
    else if (t == METHOD_DECLARATION) {
      r = method_declaration(b, 0);
    }
    else if (t == METHOD_HEADER) {
      r = method_header(b, 0);
    }
    else if (t == METHOD_MODIFIER) {
      r = method_modifier(b, 0);
    }
    else if (t == METHOD_MODIFIERS) {
      r = method_modifiers(b, 0);
    }
    else if (t == NAMED_ARGUMENT) {
      r = named_argument(b, 0);
    }
    else if (t == NAMED_ARGUMENT_LIST) {
      r = named_argument_list(b, 0);
    }
    else if (t == NAMESPACE_BODY) {
      r = namespace_body(b, 0);
    }
    else if (t == NAMESPACE_DECLARATION) {
      r = namespace_declaration(b, 0);
    }
    else if (t == NAMESPACE_MEMBER_DECLARATION) {
      r = namespace_member_declaration(b, 0);
    }
    else if (t == NAMESPACE_MEMBER_DECLARATIONS) {
      r = namespace_member_declarations(b, 0);
    }
    else if (t == NAMESPACE_OR_TYPE_NAME) {
      r = namespace_or_type_name(b, 0);
    }
    else if (t == NON_ARRAY_TYPE) {
      r = non_array_type(b, 0);
    }
    else if (t == NON_ASSIGNMENT_EXPRESSION) {
      r = non_assignment_expression(b, 0);
    }
    else if (t == NUMERIC_TYPE) {
      r = numeric_type(b, 0);
    }
    else if (t == OBJECT_CREATION_EXPRESSION) {
      r = object_creation_expression(b, 0);
    }
    else if (t == OBJECT_INITIALIZER) {
      r = object_initializer(b, 0);
    }
    else if (t == OBJECT_OR_COLLECTION_INITIALIZER) {
      r = object_or_collection_initializer(b, 0);
    }
    else if (t == OPERATOR_BODY) {
      r = operator_body(b, 0);
    }
    else if (t == OPERATOR_DECLARATION) {
      r = operator_declaration(b, 0);
    }
    else if (t == OPERATOR_DECLARATOR) {
      r = operator_declarator(b, 0);
    }
    else if (t == OPERATOR_MODIFIER) {
      r = operator_modifier(b, 0);
    }
    else if (t == OPERATOR_MODIFIERS) {
      r = operator_modifiers(b, 0);
    }
    else if (t == ORDERBY_CLAUSE) {
      r = orderby_clause(b, 0);
    }
    else if (t == ORDERING) {
      r = ordering(b, 0);
    }
    else if (t == ORDERING_DIRECTION) {
      r = ordering_direction(b, 0);
    }
    else if (t == ORDERINGS) {
      r = orderings(b, 0);
    }
    else if (t == OVERLOADABLE_BINARY_OPERATOR) {
      r = overloadable_binary_operator(b, 0);
    }
    else if (t == OVERLOADABLE_UNARY_OPERATOR) {
      r = overloadable_unary_operator(b, 0);
    }
    else if (t == PARAMETER_ARRAY) {
      r = parameter_array(b, 0);
    }
    else if (t == PARAMETER_MODIFIER) {
      r = parameter_modifier(b, 0);
    }
    else if (t == PARENTHESIZED_EXPRESSION) {
      r = parenthesized_expression(b, 0);
    }
    else if (t == POSITIONAL_ARGUMENT) {
      r = positional_argument(b, 0);
    }
    else if (t == POSITIONAL_ARGUMENT_LIST) {
      r = positional_argument_list(b, 0);
    }
    else if (t == POST_DECREMENT_EXPRESSION) {
      r = post_decrement_expression(b, 0);
    }
    else if (t == POST_INCREMENT_EXPRESSION) {
      r = post_increment_expression(b, 0);
    }
    else if (t == PRE_DECREMENT_EXPRESSION) {
      r = pre_decrement_expression(b, 0);
    }
    else if (t == PRE_INCREMENT_EXPRESSION) {
      r = pre_increment_expression(b, 0);
    }
    else if (t == PREDEFINED_TYPE) {
      r = predefined_type(b, 0);
    }
    else if (t == PRIMARY_CONSTRAINT) {
      r = primary_constraint(b, 0);
    }
    else if (t == PRIMARY_EXPRESSION) {
      r = primary_expression(b, 0);
    }
    else if (t == PROPERTY_DECLARATION) {
      r = property_declaration(b, 0);
    }
    else if (t == PROPERTY_MODIFIER) {
      r = property_modifier(b, 0);
    }
    else if (t == PROPERTY_MODIFIERS) {
      r = property_modifiers(b, 0);
    }
    else if (t == QUALIFIED_ALIAS_MEMBER) {
      r = qualified_alias_member(b, 0);
    }
    else if (t == QUALIFIED_IDENTIFIER) {
      r = qualified_identifier(b, 0);
    }
    else if (t == QUERY_BODY) {
      r = query_body(b, 0);
    }
    else if (t == QUERY_BODY_CLAUSE) {
      r = query_body_clause(b, 0);
    }
    else if (t == QUERY_BODY_CLAUSES) {
      r = query_body_clauses(b, 0);
    }
    else if (t == QUERY_CONTINUATION) {
      r = query_continuation(b, 0);
    }
    else if (t == QUERY_EXPRESSION) {
      r = query_expression(b, 0);
    }
    else if (t == RANK_SPECIFIER) {
      r = rank_specifier(b, 0);
    }
    else if (t == RANK_SPECIFIERS) {
      r = rank_specifiers(b, 0);
    }
    else if (t == REMOVE_ACCESSOR_DECLARATION) {
      r = remove_accessor_declaration(b, 0);
    }
    else if (t == RESOURCE_ACQUISITION) {
      r = resource_acquisition(b, 0);
    }
    else if (t == RETURN_STATEMENT) {
      r = return_statement(b, 0);
    }
    else if (t == RETURN_TYPE) {
      r = return_type(b, 0);
    }
    else if (t == RIGHT_SHIFT) {
      r = right_shift(b, 0);
    }
    else if (t == RIGHT_SHIFT_ASSIGNMENT) {
      r = right_shift_assignment(b, 0);
    }
    else if (t == SECONDARY_CONSTRAINTS) {
      r = secondary_constraints(b, 0);
    }
    else if (t == SELECT_CLAUSE) {
      r = select_clause(b, 0);
    }
    else if (t == SELECT_OR_GROUP_CLAUSE) {
      r = select_or_group_clause(b, 0);
    }
    else if (t == SELECTION_STATEMENT) {
      r = selection_statement(b, 0);
    }
    else if (t == SET_ACCESSOR_DECLARATION) {
      r = set_accessor_declaration(b, 0);
    }
    else if (t == SIMPLE_NAME) {
      r = simple_name(b, 0);
    }
    else if (t == SIMPLE_TYPE) {
      r = simple_type(b, 0);
    }
    else if (t == SPECIFIC_CATCH_CLAUSE) {
      r = specific_catch_clause(b, 0);
    }
    else if (t == SPECIFIC_CATCH_CLAUSES) {
      r = specific_catch_clauses(b, 0);
    }
    else if (t == STATEMENT) {
      r = statement(b, 0);
    }
    else if (t == STATEMENT_EXPRESSION) {
      r = statement_expression(b, 0);
    }
    else if (t == STATEMENT_EXPRESSION_LIST) {
      r = statement_expression_list(b, 0);
    }
    else if (t == STATEMENT_LIST) {
      r = statement_list(b, 0);
    }
    else if (t == STATIC_CONSTRUCTOR_BODY) {
      r = static_constructor_body(b, 0);
    }
    else if (t == STATIC_CONSTRUCTOR_DECLARATION) {
      r = static_constructor_declaration(b, 0);
    }
    else if (t == STATIC_CONSTRUCTOR_MODIFIERS) {
      r = static_constructor_modifiers(b, 0);
    }
    else if (t == STRUCT_BODY) {
      r = struct_body(b, 0);
    }
    else if (t == STRUCT_DECLARATION) {
      r = struct_declaration(b, 0);
    }
    else if (t == STRUCT_INTERFACES) {
      r = struct_interfaces(b, 0);
    }
    else if (t == STRUCT_MEMBER_DECLARATION) {
      r = struct_member_declaration(b, 0);
    }
    else if (t == STRUCT_MEMBER_DECLARATIONS) {
      r = struct_member_declarations(b, 0);
    }
    else if (t == STRUCT_MODIFIER) {
      r = struct_modifier(b, 0);
    }
    else if (t == STRUCT_MODIFIERS) {
      r = struct_modifiers(b, 0);
    }
    else if (t == SWITCH_BLOCK) {
      r = switch_block(b, 0);
    }
    else if (t == SWITCH_LABEL) {
      r = switch_label(b, 0);
    }
    else if (t == SWITCH_LABELS) {
      r = switch_labels(b, 0);
    }
    else if (t == SWITCH_SECTION) {
      r = switch_section(b, 0);
    }
    else if (t == SWITCH_SECTIONS) {
      r = switch_sections(b, 0);
    }
    else if (t == SWITCH_STATEMENT) {
      r = switch_statement(b, 0);
    }
    else if (t == THIS_ACCESS) {
      r = this_access(b, 0);
    }
    else if (t == THROW_STATEMENT) {
      r = throw_statement(b, 0);
    }
    else if (t == TRY_STATEMENT) {
      r = try_statement(b, 0);
    }
    else if (t == TYPE) {
      r = type(b, 0);
    }
    else if (t == TYPE_ARGUMENT) {
      r = type_argument(b, 0);
    }
    else if (t == TYPE_ARGUMENT_LIST) {
      r = type_argument_list(b, 0);
    }
    else if (t == TYPE_ARGUMENTS) {
      r = type_arguments(b, 0);
    }
    else if (t == TYPE_DECLARATION) {
      r = type_declaration(b, 0);
    }
    else if (t == TYPE_NAME) {
      r = type_name(b, 0);
    }
    else if (t == TYPE_PARAMETER) {
      r = type_parameter(b, 0);
    }
    else if (t == TYPE_PARAMETER_CONSTRAINTS) {
      r = type_parameter_constraints(b, 0);
    }
    else if (t == TYPE_PARAMETER_CONSTRAINTS_CLAUSE) {
      r = type_parameter_constraints_clause(b, 0);
    }
    else if (t == TYPE_PARAMETER_CONSTRAINTS_CLAUSES) {
      r = type_parameter_constraints_clauses(b, 0);
    }
    else if (t == TYPE_PARAMETER_LIST) {
      r = type_parameter_list(b, 0);
    }
    else if (t == TYPE_PARAMETERS) {
      r = type_parameters(b, 0);
    }
    else if (t == TYPEOF_EXPRESSION) {
      r = typeof_expression(b, 0);
    }
    else if (t == UNARY_EXPRESSION) {
      r = unary_expression(b, 0);
    }
    else if (t == UNARY_OPERATOR_DECLARATOR) {
      r = unary_operator_declarator(b, 0);
    }
    else if (t == UNCHECKED_EXPRESSION) {
      r = unchecked_expression(b, 0);
    }
    else if (t == UNCHECKED_STATEMENT) {
      r = unchecked_statement(b, 0);
    }
    else if (t == USING_ALIAS_DIRECTIVE) {
      r = using_alias_directive(b, 0);
    }
    else if (t == USING_DIRECTIVE) {
      r = using_directive(b, 0);
    }
    else if (t == USING_DIRECTIVES) {
      r = using_directives(b, 0);
    }
    else if (t == USING_NAMESPACE_DIRECTIVE) {
      r = using_namespace_directive(b, 0);
    }
    else if (t == USING_STATEMENT) {
      r = using_statement(b, 0);
    }
    else if (t == VARIABLE_DECLARATOR) {
      r = variable_declarator(b, 0);
    }
    else if (t == VARIABLE_DECLARATORS) {
      r = variable_declarators(b, 0);
    }
    else if (t == VARIABLE_INITIALIZER) {
      r = variable_initializer(b, 0);
    }
    else if (t == VARIABLE_INITIALIZER_LIST) {
      r = variable_initializer_list(b, 0);
    }
    else if (t == VARIABLE_REFERENCE) {
      r = variable_reference(b, 0);
    }
    else if (t == VARIANCE_ANNOTATION) {
      r = variance_annotation(b, 0);
    }
    else if (t == VARIANT_TYPE_PARAMETER) {
      r = variant_type_parameter(b, 0);
    }
    else if (t == VARIANT_TYPE_PARAMETER_LIST) {
      r = variant_type_parameter_list(b, 0);
    }
    else if (t == VARIANT_TYPE_PARAMETERS) {
      r = variant_type_parameters(b, 0);
    }
    else if (t == WHERE_CLAUSE) {
      r = where_clause(b, 0);
    }
    else if (t == WHILE_STATEMENT) {
      r = while_statement(b, 0);
    }
    else if (t == YIELD_STATEMENT) {
      r = yield_statement(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return namespace_name(b, l + 1);
  }

  /* ********************************************************** */
  // block | ';'
  public static boolean accessor_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessor_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<accessor body>");
    r = block(b, l + 1);
    if (!r) r = consumeToken(b, ";");
    exit_section_(b, l, m, ACCESSOR_BODY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (get_accessor_declaration [set_accessor_declaration])
  //     | (set_accessor_declaration [get_accessor_declaration])
  public static boolean accessor_declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessor_declarations")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<accessor declarations>");
    r = accessor_declarations_0(b, l + 1);
    if (!r) r = accessor_declarations_1(b, l + 1);
    exit_section_(b, l, m, ACCESSOR_DECLARATIONS, r, false, null);
    return r;
  }

  // get_accessor_declaration [set_accessor_declaration]
  private static boolean accessor_declarations_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessor_declarations_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = get_accessor_declaration(b, l + 1);
    r = r && accessor_declarations_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [set_accessor_declaration]
  private static boolean accessor_declarations_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessor_declarations_0_1")) return false;
    set_accessor_declaration(b, l + 1);
    return true;
  }

  // set_accessor_declaration [get_accessor_declaration]
  private static boolean accessor_declarations_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessor_declarations_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = set_accessor_declaration(b, l + 1);
    r = r && accessor_declarations_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [get_accessor_declaration]
  private static boolean accessor_declarations_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessor_declarations_1_1")) return false;
    get_accessor_declaration(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'protected' | 'internal' | 'private' | ('protected' 'internal') | ('internal' 'protected')
  public static boolean accessor_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessor_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<accessor modifier>");
    r = consumeToken(b, "protected");
    if (!r) r = consumeToken(b, "internal");
    if (!r) r = consumeToken(b, "private");
    if (!r) r = accessor_modifier_3(b, l + 1);
    if (!r) r = accessor_modifier_4(b, l + 1);
    exit_section_(b, l, m, ACCESSOR_MODIFIER, r, false, null);
    return r;
  }

  // 'protected' 'internal'
  private static boolean accessor_modifier_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessor_modifier_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "protected");
    r = r && consumeToken(b, "internal");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'internal' 'protected'
  private static boolean accessor_modifier_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "accessor_modifier_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "internal");
    r = r && consumeToken(b, "protected");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [attributes] 'add' block
  public static boolean add_accessor_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "add_accessor_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<add accessor declaration>");
    r = add_accessor_declaration_0(b, l + 1);
    r = r && consumeToken(b, "add");
    r = r && block(b, l + 1);
    exit_section_(b, l, m, ADD_ACCESSOR_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean add_accessor_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "add_accessor_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expression | block
  public static boolean anonymous_function_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_function_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<anonymous function body>");
    r = expression(b, l + 1);
    if (!r) r = block(b, l + 1);
    exit_section_(b, l, m, ANONYMOUS_FUNCTION_BODY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'ref' | 'out'
  public static boolean anonymous_function_parameter_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_function_parameter_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<anonymous function parameter modifier>");
    r = consumeToken(b, "ref");
    if (!r) r = consumeToken(b, "out");
    exit_section_(b, l, m, ANONYMOUS_FUNCTION_PARAMETER_MODIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // explicit_anonymous_function_signature | implicit_anonymous_function_signature
  public static boolean anonymous_function_signature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_function_signature")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<anonymous function signature>");
    r = explicit_anonymous_function_signature(b, l + 1);
    if (!r) r = implicit_anonymous_function_signature(b, l + 1);
    exit_section_(b, l, m, ANONYMOUS_FUNCTION_SIGNATURE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'delegate' [explicit_anonymous_function_signature] block
  public static boolean anonymous_method_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_method_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<anonymous method expression>");
    r = consumeToken(b, "delegate");
    r = r && anonymous_method_expression_1(b, l + 1);
    r = r && block(b, l + 1);
    exit_section_(b, l, m, ANONYMOUS_METHOD_EXPRESSION, r, false, null);
    return r;
  }

  // [explicit_anonymous_function_signature]
  private static boolean anonymous_method_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_method_expression_1")) return false;
    explicit_anonymous_function_signature(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'new' anonymous_object_initializer
  public static boolean anonymous_object_creation_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_object_creation_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<anonymous object creation expression>");
    r = consumeToken(b, "new");
    r = r && anonymous_object_initializer(b, l + 1);
    exit_section_(b, l, m, ANONYMOUS_OBJECT_CREATION_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( '{' [member_declarator_list] '}' ) | ( '{' member_declarator_list ',' '}' )
  public static boolean anonymous_object_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_object_initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<anonymous object initializer>");
    r = anonymous_object_initializer_0(b, l + 1);
    if (!r) r = anonymous_object_initializer_1(b, l + 1);
    exit_section_(b, l, m, ANONYMOUS_OBJECT_INITIALIZER, r, false, null);
    return r;
  }

  // '{' [member_declarator_list] '}'
  private static boolean anonymous_object_initializer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_object_initializer_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && anonymous_object_initializer_0_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // [member_declarator_list]
  private static boolean anonymous_object_initializer_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_object_initializer_0_1")) return false;
    member_declarator_list(b, l + 1);
    return true;
  }

  // '{' member_declarator_list ',' '}'
  private static boolean anonymous_object_initializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "anonymous_object_initializer_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && member_declarator_list(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [argument_name]  argument_value
  public static boolean argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<argument>");
    r = argument_0(b, l + 1);
    r = r && argument_value(b, l + 1);
    exit_section_(b, l, m, ARGUMENT, r, false, null);
    return r;
  }

  // [argument_name]
  private static boolean argument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_0")) return false;
    argument_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // argument | (',' argument) *
  public static boolean argument_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<argument list>");
    r = argument(b, l + 1);
    if (!r) r = argument_list_1(b, l + 1);
    exit_section_(b, l, m, ARGUMENT_LIST, r, false, null);
    return r;
  }

  // (',' argument) *
  private static boolean argument_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!argument_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "argument_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' argument
  private static boolean argument_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier ':'
  public static boolean argument_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, ARGUMENT_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // expression | ('ref'   variable_reference) | ('out'   variable_reference)
  public static boolean argument_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<argument value>");
    r = expression(b, l + 1);
    if (!r) r = argument_value_1(b, l + 1);
    if (!r) r = argument_value_2(b, l + 1);
    exit_section_(b, l, m, ARGUMENT_VALUE, r, false, null);
    return r;
  }

  // 'ref'   variable_reference
  private static boolean argument_value_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_value_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "ref");
    r = r && variable_reference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'out'   variable_reference
  private static boolean argument_value_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_value_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "out");
    r = r && variable_reference(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('new' non_array_type '[' expression_list ']' [rank_specifiers] [array_initializer])
  //     | ('new' array_type array_initializer) | ('new' rank_specifier array_initializer)
  public static boolean array_creation_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_creation_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<array creation expression>");
    r = array_creation_expression_0(b, l + 1);
    if (!r) r = array_creation_expression_1(b, l + 1);
    if (!r) r = array_creation_expression_2(b, l + 1);
    exit_section_(b, l, m, ARRAY_CREATION_EXPRESSION, r, false, null);
    return r;
  }

  // 'new' non_array_type '[' expression_list ']' [rank_specifiers] [array_initializer]
  private static boolean array_creation_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_creation_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "new");
    r = r && non_array_type(b, l + 1);
    r = r && consumeToken(b, "[");
    r = r && expression_list(b, l + 1);
    r = r && consumeToken(b, "]");
    r = r && array_creation_expression_0_5(b, l + 1);
    r = r && array_creation_expression_0_6(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [rank_specifiers]
  private static boolean array_creation_expression_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_creation_expression_0_5")) return false;
    rank_specifiers(b, l + 1);
    return true;
  }

  // [array_initializer]
  private static boolean array_creation_expression_0_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_creation_expression_0_6")) return false;
    array_initializer(b, l + 1);
    return true;
  }

  // 'new' array_type array_initializer
  private static boolean array_creation_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_creation_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "new");
    r = r && array_type(b, l + 1);
    r = r && array_initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'new' rank_specifier array_initializer
  private static boolean array_creation_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_creation_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "new");
    r = r && rank_specifier(b, l + 1);
    r = r && array_initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('{' [variable_initializer_list] '}') | ('{'   variable_initializer_list ',' '}')
  public static boolean array_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<array initializer>");
    r = array_initializer_0(b, l + 1);
    if (!r) r = array_initializer_1(b, l + 1);
    exit_section_(b, l, m, ARRAY_INITIALIZER, r, false, null);
    return r;
  }

  // '{' [variable_initializer_list] '}'
  private static boolean array_initializer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_initializer_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && array_initializer_0_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // [variable_initializer_list]
  private static boolean array_initializer_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_initializer_0_1")) return false;
    variable_initializer_list(b, l + 1);
    return true;
  }

  // '{'   variable_initializer_list ',' '}'
  private static boolean array_initializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_initializer_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && variable_initializer_list(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // non_array_type rank_specifiers+
  public static boolean array_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<array type>");
    r = non_array_type(b, l + 1);
    r = r && array_type_1(b, l + 1);
    exit_section_(b, l, m, ARRAY_TYPE, r, false, null);
    return r;
  }

  // rank_specifiers+
  private static boolean array_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = rank_specifiers(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!rank_specifiers(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_type_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // unary_expression | assignment_operator | expression
  public static boolean assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<assignment>");
    r = unary_expression(b, l + 1);
    if (!r) r = assignment_operator(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, l, m, ASSIGNMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '=' | '+=' | '_=' | '*=' | '/=' | '%=' | '&=' | '|=' |'^=' |'<<=' | right_shift_assignment
  public static boolean assignment_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<assignment operator>");
    r = consumeToken(b, "=");
    if (!r) r = consumeToken(b, "+=");
    if (!r) r = consumeToken(b, "_=");
    if (!r) r = consumeToken(b, "*=");
    if (!r) r = consumeToken(b, "/=");
    if (!r) r = consumeToken(b, "%=");
    if (!r) r = consumeToken(b, "&=");
    if (!r) r = consumeToken(b, "|=");
    if (!r) r = consumeToken(b, "^=");
    if (!r) r = consumeToken(b, "<<=");
    if (!r) r = right_shift_assignment(b, l + 1);
    exit_section_(b, l, m, ASSIGNMENT_OPERATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // attribute_name [attribute_arguments]
  public static boolean attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attribute_name(b, l + 1);
    r = r && attribute_1(b, l + 1);
    exit_section_(b, m, ATTRIBUTE, r);
    return r;
  }

  // [attribute_arguments]
  private static boolean attribute_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_1")) return false;
    attribute_arguments(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expression
  public static boolean attribute_argument_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_argument_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<attribute argument expression>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, ATTRIBUTE_ARGUMENT_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('(' [positional_argument_list] ')') | ('(' positional_argument_list ',' named_argument_list ')')
  //     | ('(' named_argument_list ')')
  public static boolean attribute_arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_arguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<attribute arguments>");
    r = attribute_arguments_0(b, l + 1);
    if (!r) r = attribute_arguments_1(b, l + 1);
    if (!r) r = attribute_arguments_2(b, l + 1);
    exit_section_(b, l, m, ATTRIBUTE_ARGUMENTS, r, false, null);
    return r;
  }

  // '(' [positional_argument_list] ')'
  private static boolean attribute_arguments_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_arguments_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && attribute_arguments_0_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // [positional_argument_list]
  private static boolean attribute_arguments_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_arguments_0_1")) return false;
    positional_argument_list(b, l + 1);
    return true;
  }

  // '(' positional_argument_list ',' named_argument_list ')'
  private static boolean attribute_arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_arguments_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && positional_argument_list(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && named_argument_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' named_argument_list ')'
  private static boolean attribute_arguments_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_arguments_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && named_argument_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // attribute [(','  attribute)*]
  public static boolean attribute_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attribute(b, l + 1);
    r = r && attribute_list_1(b, l + 1);
    exit_section_(b, m, ATTRIBUTE_LIST, r);
    return r;
  }

  // [(','  attribute)*]
  private static boolean attribute_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_list_1")) return false;
    attribute_list_1_0(b, l + 1);
    return true;
  }

  // (','  attribute)*
  private static boolean attribute_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_list_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!attribute_list_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "attribute_list_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','  attribute
  private static boolean attribute_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_list_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && attribute(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type_name
  public static boolean attribute_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_name(b, l + 1);
    exit_section_(b, m, ATTRIBUTE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // ('[' [attribute_target_specifier] attribute_list ']')
  //     | ('[' [attribute_target_specifier] attribute_list ',' ']')
  public static boolean attribute_section(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_section")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<attribute section>");
    r = attribute_section_0(b, l + 1);
    if (!r) r = attribute_section_1(b, l + 1);
    exit_section_(b, l, m, ATTRIBUTE_SECTION, r, false, null);
    return r;
  }

  // '[' [attribute_target_specifier] attribute_list ']'
  private static boolean attribute_section_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_section_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && attribute_section_0_1(b, l + 1);
    r = r && attribute_list(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // [attribute_target_specifier]
  private static boolean attribute_section_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_section_0_1")) return false;
    attribute_target_specifier(b, l + 1);
    return true;
  }

  // '[' [attribute_target_specifier] attribute_list ',' ']'
  private static boolean attribute_section_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_section_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && attribute_section_1_1(b, l + 1);
    r = r && attribute_list(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // [attribute_target_specifier]
  private static boolean attribute_section_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_section_1_1")) return false;
    attribute_target_specifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // attribute_section*
  public static boolean attribute_sections(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_sections")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<attribute sections>");
    int c = current_position_(b);
    while (true) {
      if (!attribute_section(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "attribute_sections", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, ATTRIBUTE_SECTIONS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // 'field' |'event' | 'method' | 'param' | 'property' | 'return' | 'type'
  public static boolean attribute_target(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_target")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<attribute target>");
    r = consumeToken(b, "field");
    if (!r) r = consumeToken(b, "event");
    if (!r) r = consumeToken(b, "method");
    if (!r) r = consumeToken(b, "param");
    if (!r) r = consumeToken(b, "property");
    if (!r) r = consumeToken(b, "return");
    if (!r) r = consumeToken(b, "type");
    exit_section_(b, l, m, ATTRIBUTE_TARGET, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // attribute_target ':'
  public static boolean attribute_target_specifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute_target_specifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<attribute target specifier>");
    r = attribute_target(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, l, m, ATTRIBUTE_TARGET_SPECIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // attribute_sections
  public static boolean attributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<attributes>");
    r = attribute_sections(b, l + 1);
    exit_section_(b, l, m, ATTRIBUTES, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ( 'base' '.' identifier) | ( 'base' '['  argument_list ']' )
  public static boolean base_access(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_access")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<base access>");
    r = base_access_0(b, l + 1);
    if (!r) r = base_access_1(b, l + 1);
    exit_section_(b, l, m, BASE_ACCESS, r, false, null);
    return r;
  }

  // 'base' '.' identifier
  private static boolean base_access_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_access_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "base");
    r = r && consumeToken(b, ".");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'base' '['  argument_list ']'
  private static boolean base_access_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_access_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "base");
    r = r && consumeToken(b, "[");
    r = r && argument_list(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // array_creation_expression
  //     | literal
  //     | simple_name
  //     | parenthesized_expression
  //     | predefined_type '.' identifier [type_argument_list]
  //     | qualified_alias_member '.' identifier
  //     | array_creation_expression '(' [argument_list] ')'
  //     | this_access
  //     | base_access
  //     | object_creation_expression
  //     | delegate_creation_expression
  //     | anonymous_object_creation_expression
  //     | typeof_expression
  //     | checked_expression
  //     | unchecked_expression
  //     | default_value_expression
  //     | anonymous_method_expression
  static boolean base_primary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_primary_expression")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_creation_expression(b, l + 1);
    if (!r) r = consumeToken(b, LITERAL);
    if (!r) r = simple_name(b, l + 1);
    if (!r) r = parenthesized_expression(b, l + 1);
    if (!r) r = base_primary_expression_4(b, l + 1);
    if (!r) r = base_primary_expression_5(b, l + 1);
    if (!r) r = base_primary_expression_6(b, l + 1);
    if (!r) r = this_access(b, l + 1);
    if (!r) r = base_access(b, l + 1);
    if (!r) r = object_creation_expression(b, l + 1);
    if (!r) r = delegate_creation_expression(b, l + 1);
    if (!r) r = anonymous_object_creation_expression(b, l + 1);
    if (!r) r = typeof_expression(b, l + 1);
    if (!r) r = checked_expression(b, l + 1);
    if (!r) r = unchecked_expression(b, l + 1);
    if (!r) r = default_value_expression(b, l + 1);
    if (!r) r = anonymous_method_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // predefined_type '.' identifier [type_argument_list]
  private static boolean base_primary_expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_primary_expression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = predefined_type(b, l + 1);
    r = r && consumeToken(b, ".");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && base_primary_expression_4_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [type_argument_list]
  private static boolean base_primary_expression_4_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_primary_expression_4_3")) return false;
    type_argument_list(b, l + 1);
    return true;
  }

  // qualified_alias_member '.' identifier
  private static boolean base_primary_expression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_primary_expression_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = qualified_alias_member(b, l + 1);
    r = r && consumeToken(b, ".");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // array_creation_expression '(' [argument_list] ')'
  private static boolean base_primary_expression_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_primary_expression_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = array_creation_expression(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && base_primary_expression_6_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // [argument_list]
  private static boolean base_primary_expression_6_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_primary_expression_6_2")) return false;
    argument_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // type 'operator' overloadable_binary_operator '(' type identifier ',' type identifier ')'
  public static boolean binary_operator_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "binary_operator_declarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<binary operator declarator>");
    r = type(b, l + 1);
    r = r && consumeToken(b, "operator");
    r = r && overloadable_binary_operator(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, ",");
    r = r && type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, BINARY_OPERATOR_DECLARATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' [statement_list] '}'
  public static boolean block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<block>");
    r = consumeToken(b, "{");
    r = r && block_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, BLOCK, r, false, null);
    return r;
  }

  // [statement_list]
  private static boolean block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "block_1")) return false;
    statement_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // expression
  public static boolean boolean_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<boolean expression>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, BOOLEAN_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'break' ';'
  public static boolean break_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "break_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<break statement>");
    r = consumeToken(b, "break");
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, BREAK_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' type ')' unary_expression
  public static boolean cast_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<cast expression>");
    r = consumeToken(b, "(");
    r = r && type(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && unary_expression(b, l + 1);
    exit_section_(b, l, m, CAST_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (specific_catch_clauses [general_catch_clause])
  //     |   ([specific_catch_clauses] general_catch_clause)
  public static boolean catch_clauses(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clauses")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<catch clauses>");
    r = catch_clauses_0(b, l + 1);
    if (!r) r = catch_clauses_1(b, l + 1);
    exit_section_(b, l, m, CATCH_CLAUSES, r, false, null);
    return r;
  }

  // specific_catch_clauses [general_catch_clause]
  private static boolean catch_clauses_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clauses_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = specific_catch_clauses(b, l + 1);
    r = r && catch_clauses_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [general_catch_clause]
  private static boolean catch_clauses_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clauses_0_1")) return false;
    general_catch_clause(b, l + 1);
    return true;
  }

  // [specific_catch_clauses] general_catch_clause
  private static boolean catch_clauses_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clauses_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = catch_clauses_1_0(b, l + 1);
    r = r && general_catch_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [specific_catch_clauses]
  private static boolean catch_clauses_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_clauses_1_0")) return false;
    specific_catch_clauses(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'checked' '(' expression ')'
  public static boolean checked_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "checked_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<checked expression>");
    r = consumeToken(b, "checked");
    r = r && consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, CHECKED_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'checked' block
  public static boolean checked_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "checked_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<checked statement>");
    r = consumeToken(b, "checked");
    r = r && block(b, l + 1);
    exit_section_(b, l, m, CHECKED_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (':'   class_type) | (':'   interface_type_list) | (':'   class_type ','   interface_type_list)
  public static boolean class_base(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_base")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<class base>");
    r = class_base_0(b, l + 1);
    if (!r) r = class_base_1(b, l + 1);
    if (!r) r = class_base_2(b, l + 1);
    exit_section_(b, l, m, CLASS_BASE, r, false, null);
    return r;
  }

  // ':'   class_type
  private static boolean class_base_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_base_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && class_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':'   interface_type_list
  private static boolean class_base_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_base_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && interface_type_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':'   class_type ','   interface_type_list
  private static boolean class_base_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_base_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && class_type(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && interface_type_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' [class_member_declarations] '}'
  public static boolean class_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<class body>");
    r = consumeToken(b, "{");
    r = r && class_body_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, CLASS_BODY, r, false, null);
    return r;
  }

  // [class_member_declarations]
  private static boolean class_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_body_1")) return false;
    class_member_declarations(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [attributes] [class_modifiers] ['partial'] 'class' identifier [type_parameter_list]
  // 		[class_base] [type_parameter_constraints_clauses] class_body   [';']
  public static boolean class_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<class declaration>");
    r = class_declaration_0(b, l + 1);
    r = r && class_declaration_1(b, l + 1);
    r = r && class_declaration_2(b, l + 1);
    r = r && consumeToken(b, "class");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && class_declaration_5(b, l + 1);
    r = r && class_declaration_6(b, l + 1);
    r = r && class_declaration_7(b, l + 1);
    r = r && class_body(b, l + 1);
    r = r && class_declaration_9(b, l + 1);
    exit_section_(b, l, m, CLASS_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean class_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [class_modifiers]
  private static boolean class_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_1")) return false;
    class_modifiers(b, l + 1);
    return true;
  }

  // ['partial']
  private static boolean class_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_2")) return false;
    consumeToken(b, "partial");
    return true;
  }

  // [type_parameter_list]
  private static boolean class_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_5")) return false;
    type_parameter_list(b, l + 1);
    return true;
  }

  // [class_base]
  private static boolean class_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_6")) return false;
    class_base(b, l + 1);
    return true;
  }

  // [type_parameter_constraints_clauses]
  private static boolean class_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_7")) return false;
    type_parameter_constraints_clauses(b, l + 1);
    return true;
  }

  // [';']
  private static boolean class_declaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_declaration_9")) return false;
    consumeToken(b, ";");
    return true;
  }

  /* ********************************************************** */
  // constant_declaration |field_declaration |method_declaration |property_declaration
  //     |event_declaration |indexer_declaration |operator_declaration |constructor_declaration |destructor_declaration
  //     |static_constructor_declaration |type_declaration
  public static boolean class_member_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_member_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<class member declaration>");
    r = constant_declaration(b, l + 1);
    if (!r) r = field_declaration(b, l + 1);
    if (!r) r = method_declaration(b, l + 1);
    if (!r) r = property_declaration(b, l + 1);
    if (!r) r = event_declaration(b, l + 1);
    if (!r) r = indexer_declaration(b, l + 1);
    if (!r) r = operator_declaration(b, l + 1);
    if (!r) r = constructor_declaration(b, l + 1);
    if (!r) r = destructor_declaration(b, l + 1);
    if (!r) r = static_constructor_declaration(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    exit_section_(b, l, m, CLASS_MEMBER_DECLARATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // class_member_declaration *
  public static boolean class_member_declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_member_declarations")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<class member declarations>");
    int c = current_position_(b);
    while (true) {
      if (!class_member_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_member_declarations", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, CLASS_MEMBER_DECLARATIONS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // 'new' |'public' |'protected' |'internal' |'private' |'abstract' |'sealed' |'static'
  public static boolean class_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<class modifier>");
    r = consumeToken(b, "new");
    if (!r) r = consumeToken(b, "public");
    if (!r) r = consumeToken(b, "protected");
    if (!r) r = consumeToken(b, "internal");
    if (!r) r = consumeToken(b, "private");
    if (!r) r = consumeToken(b, "abstract");
    if (!r) r = consumeToken(b, "sealed");
    if (!r) r = consumeToken(b, "static");
    exit_section_(b, l, m, CLASS_MODIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // class_modifier*
  public static boolean class_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<class modifiers>");
    int c = current_position_(b);
    while (true) {
      if (!class_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_modifiers", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, CLASS_MODIFIERS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // type_name | 'object' | 'dynamic' | 'string'
  public static boolean class_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<class type>");
    r = type_name(b, l + 1);
    if (!r) r = consumeToken(b, "object");
    if (!r) r = consumeToken(b, "dynamic");
    if (!r) r = consumeToken(b, "string");
    exit_section_(b, l, m, CLASS_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('{' element_initializer_list '}') | ('{' element_initializer_list ',' '}')
  public static boolean collection_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collection_initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<collection initializer>");
    r = collection_initializer_0(b, l + 1);
    if (!r) r = collection_initializer_1(b, l + 1);
    exit_section_(b, l, m, COLLECTION_INITIALIZER, r, false, null);
    return r;
  }

  // '{' element_initializer_list '}'
  private static boolean collection_initializer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collection_initializer_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && element_initializer_list(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' element_initializer_list ',' '}'
  private static boolean collection_initializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "collection_initializer_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && element_initializer_list(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (unary_expression
  //         (
  //             (
  //                 ('*'|'%'|'/')
  //                 | ('-'|'+')
  //                 | ('<<' |right_shift)
  //                 | ('<' | '>' | '<=' | '>=')
  //                 | ('==' | '!=')
  //                 | '&'
  //                 | '^'
  //                 | '|'
  //                 | '&&'
  //                 | '||'
  //                 | '??'
  //             )
  //             (comparative_expression | unary_expression)
  //         )+
  //     )
  //     | (('is'|'as') (type|unary_expression))+
  //     | unary_expression
  public static boolean comparative_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparative_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<comparative expression>");
    r = comparative_expression_0(b, l + 1);
    if (!r) r = comparative_expression_1(b, l + 1);
    if (!r) r = unary_expression(b, l + 1);
    exit_section_(b, l, m, COMPARATIVE_EXPRESSION, r, false, null);
    return r;
  }

  // unary_expression
  //         (
  //             (
  //                 ('*'|'%'|'/')
  //                 | ('-'|'+')
  //                 | ('<<' |right_shift)
  //                 | ('<' | '>' | '<=' | '>=')
  //                 | ('==' | '!=')
  //                 | '&'
  //                 | '^'
  //                 | '|'
  //                 | '&&'
  //                 | '||'
  //                 | '??'
  //             )
  //             (comparative_expression | unary_expression)
  //         )+
  private static boolean comparative_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparative_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unary_expression(b, l + 1);
    r = r && comparative_expression_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (
  //             (
  //                 ('*'|'%'|'/')
  //                 | ('-'|'+')
  //                 | ('<<' |right_shift)
  //                 | ('<' | '>' | '<=' | '>=')
  //                 | ('==' | '!=')
  //                 | '&'
  //                 | '^'
  //                 | '|'
  //                 | '&&'
  //                 | '||'
  //                 | '??'
  //             )
  //             (comparative_expression | unary_expression)
  //         )+
  private static boolean comparative_expression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparative_expression_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comparative_expression_0_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!comparative_expression_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "comparative_expression_0_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // (
  //                 ('*'|'%'|'/')
  //                 | ('-'|'+')
  //                 | ('<<' |right_shift)
  //                 | ('<' | '>' | '<=' | '>=')
  //                 | ('==' | '!=')
  //                 | '&'
  //                 | '^'
  //                 | '|'
  //                 | '&&'
  //                 | '||'
  //                 | '??'
  //             )
  //             (comparative_expression | unary_expression)
  private static boolean comparative_expression_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparative_expression_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comparative_expression_0_1_0_0(b, l + 1);
    r = r && comparative_expression_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ('*'|'%'|'/')
  //                 | ('-'|'+')
  //                 | ('<<' |right_shift)
  //                 | ('<' | '>' | '<=' | '>=')
  //                 | ('==' | '!=')
  //                 | '&'
  //                 | '^'
  //                 | '|'
  //                 | '&&'
  //                 | '||'
  //                 | '??'
  private static boolean comparative_expression_0_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparative_expression_0_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comparative_expression_0_1_0_0_0(b, l + 1);
    if (!r) r = comparative_expression_0_1_0_0_1(b, l + 1);
    if (!r) r = comparative_expression_0_1_0_0_2(b, l + 1);
    if (!r) r = comparative_expression_0_1_0_0_3(b, l + 1);
    if (!r) r = comparative_expression_0_1_0_0_4(b, l + 1);
    if (!r) r = consumeToken(b, "&");
    if (!r) r = consumeToken(b, "^");
    if (!r) r = consumeToken(b, "|");
    if (!r) r = consumeToken(b, "&&");
    if (!r) r = consumeToken(b, "||");
    if (!r) r = consumeToken(b, "??");
    exit_section_(b, m, null, r);
    return r;
  }

  // '*'|'%'|'/'
  private static boolean comparative_expression_0_1_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparative_expression_0_1_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, "%");
    if (!r) r = consumeToken(b, "/");
    exit_section_(b, m, null, r);
    return r;
  }

  // '-'|'+'
  private static boolean comparative_expression_0_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparative_expression_0_1_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "-");
    if (!r) r = consumeToken(b, "+");
    exit_section_(b, m, null, r);
    return r;
  }

  // '<<' |right_shift
  private static boolean comparative_expression_0_1_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparative_expression_0_1_0_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "<<");
    if (!r) r = right_shift(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '<' | '>' | '<=' | '>='
  private static boolean comparative_expression_0_1_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparative_expression_0_1_0_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "<");
    if (!r) r = consumeToken(b, ">");
    if (!r) r = consumeToken(b, "<=");
    if (!r) r = consumeToken(b, ">=");
    exit_section_(b, m, null, r);
    return r;
  }

  // '==' | '!='
  private static boolean comparative_expression_0_1_0_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparative_expression_0_1_0_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "==");
    if (!r) r = consumeToken(b, "!=");
    exit_section_(b, m, null, r);
    return r;
  }

  // comparative_expression | unary_expression
  private static boolean comparative_expression_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparative_expression_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comparative_expression(b, l + 1);
    if (!r) r = unary_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (('is'|'as') (type|unary_expression))+
  private static boolean comparative_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparative_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comparative_expression_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!comparative_expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "comparative_expression_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ('is'|'as') (type|unary_expression)
  private static boolean comparative_expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparative_expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comparative_expression_1_0_0(b, l + 1);
    r = r && comparative_expression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'is'|'as'
  private static boolean comparative_expression_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparative_expression_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "is");
    if (!r) r = consumeToken(b, "as");
    exit_section_(b, m, null, r);
    return r;
  }

  // type|unary_expression
  private static boolean comparative_expression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparative_expression_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    if (!r) r = unary_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [extern_alias_directives] [using_directives] [global_attributes] [namespace_member_declarations]
  public static boolean compilation_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilation_unit")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<compilation unit>");
    r = compilation_unit_0(b, l + 1);
    r = r && compilation_unit_1(b, l + 1);
    r = r && compilation_unit_2(b, l + 1);
    r = r && compilation_unit_3(b, l + 1);
    exit_section_(b, l, m, COMPILATION_UNIT, r, false, null);
    return r;
  }

  // [extern_alias_directives]
  private static boolean compilation_unit_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilation_unit_0")) return false;
    extern_alias_directives(b, l + 1);
    return true;
  }

  // [using_directives]
  private static boolean compilation_unit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilation_unit_1")) return false;
    using_directives(b, l + 1);
    return true;
  }

  // [global_attributes]
  private static boolean compilation_unit_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilation_unit_2")) return false;
    global_attributes(b, l + 1);
    return true;
  }

  // [namespace_member_declarations]
  private static boolean compilation_unit_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compilation_unit_3")) return false;
    namespace_member_declarations(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // comparative_expression
  //     | (comparative_expression '?' expression ':' expression)
  public static boolean conditional_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<conditional expression>");
    r = comparative_expression(b, l + 1);
    if (!r) r = conditional_expression_1(b, l + 1);
    exit_section_(b, l, m, CONDITIONAL_EXPRESSION, r, false, null);
    return r;
  }

  // comparative_expression '?' expression ':' expression
  private static boolean conditional_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comparative_expression(b, l + 1);
    r = r && consumeToken(b, "?");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [attributes] [constant_modifiers] 'const' type constant_declarators ';'
  public static boolean constant_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<constant declaration>");
    r = constant_declaration_0(b, l + 1);
    r = r && constant_declaration_1(b, l + 1);
    r = r && consumeToken(b, "const");
    r = r && type(b, l + 1);
    r = r && constant_declarators(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, CONSTANT_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean constant_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [constant_modifiers]
  private static boolean constant_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declaration_1")) return false;
    constant_modifiers(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier '=' constant_expression
  public static boolean constant_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declarator")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && constant_expression(b, l + 1);
    exit_section_(b, m, CONSTANT_DECLARATOR, r);
    return r;
  }

  /* ********************************************************** */
  // constant_declarator   [(',' constant_declarator)*]
  public static boolean constant_declarators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declarators")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = constant_declarator(b, l + 1);
    r = r && constant_declarators_1(b, l + 1);
    exit_section_(b, m, CONSTANT_DECLARATORS, r);
    return r;
  }

  // [(',' constant_declarator)*]
  private static boolean constant_declarators_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declarators_1")) return false;
    constant_declarators_1_0(b, l + 1);
    return true;
  }

  // (',' constant_declarator)*
  private static boolean constant_declarators_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declarators_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!constant_declarators_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "constant_declarators_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' constant_declarator
  private static boolean constant_declarators_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_declarators_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && constant_declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression
  public static boolean constant_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<constant expression>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, CONSTANT_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'new' | 'public' | 'protected' | 'internal' | 'private'
  public static boolean constant_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<constant modifier>");
    r = consumeToken(b, "new");
    if (!r) r = consumeToken(b, "public");
    if (!r) r = consumeToken(b, "protected");
    if (!r) r = consumeToken(b, "internal");
    if (!r) r = consumeToken(b, "private");
    exit_section_(b, l, m, CONSTANT_MODIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // constant_modifier *
  public static boolean constant_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constant_modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<constant modifiers>");
    int c = current_position_(b);
    while (true) {
      if (!constant_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "constant_modifiers", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, CONSTANT_MODIFIERS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // block | ';'
  public static boolean constructor_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<constructor body>");
    r = block(b, l + 1);
    if (!r) r = consumeToken(b, ";");
    exit_section_(b, l, m, CONSTRUCTOR_BODY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'new' '(' ')'
  public static boolean constructor_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<constructor constraint>");
    r = consumeToken(b, "new");
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, CONSTRUCTOR_CONSTRAINT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [attributes] [constructor_modifiers] constructor_declarator constructor_body
  public static boolean constructor_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<constructor declaration>");
    r = constructor_declaration_0(b, l + 1);
    r = r && constructor_declaration_1(b, l + 1);
    r = r && constructor_declarator(b, l + 1);
    r = r && constructor_body(b, l + 1);
    exit_section_(b, l, m, CONSTRUCTOR_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean constructor_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [constructor_modifiers]
  private static boolean constructor_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_declaration_1")) return false;
    constructor_modifiers(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier '(' [formal_parameter_list] ')' [constructor_initializer]
  public static boolean constructor_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_declarator")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "(");
    r = r && constructor_declarator_2(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && constructor_declarator_4(b, l + 1);
    exit_section_(b, m, CONSTRUCTOR_DECLARATOR, r);
    return r;
  }

  // [formal_parameter_list]
  private static boolean constructor_declarator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_declarator_2")) return false;
    formal_parameter_list(b, l + 1);
    return true;
  }

  // [constructor_initializer]
  private static boolean constructor_declarator_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_declarator_4")) return false;
    constructor_initializer(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (':' 'base' '(' [argument_list] ')') | (':' 'this' '(' [argument_list] ')')
  public static boolean constructor_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<constructor initializer>");
    r = constructor_initializer_0(b, l + 1);
    if (!r) r = constructor_initializer_1(b, l + 1);
    exit_section_(b, l, m, CONSTRUCTOR_INITIALIZER, r, false, null);
    return r;
  }

  // ':' 'base' '(' [argument_list] ')'
  private static boolean constructor_initializer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_initializer_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && consumeToken(b, "base");
    r = r && consumeToken(b, "(");
    r = r && constructor_initializer_0_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // [argument_list]
  private static boolean constructor_initializer_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_initializer_0_3")) return false;
    argument_list(b, l + 1);
    return true;
  }

  // ':' 'this' '(' [argument_list] ')'
  private static boolean constructor_initializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_initializer_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && consumeToken(b, "this");
    r = r && consumeToken(b, "(");
    r = r && constructor_initializer_1_3(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // [argument_list]
  private static boolean constructor_initializer_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_initializer_1_3")) return false;
    argument_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'public' | 'protected' | 'internal' | 'private' | 'extern'
  public static boolean constructor_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<constructor modifier>");
    r = consumeToken(b, "public");
    if (!r) r = consumeToken(b, "protected");
    if (!r) r = consumeToken(b, "internal");
    if (!r) r = consumeToken(b, "private");
    if (!r) r = consumeToken(b, "extern");
    exit_section_(b, l, m, CONSTRUCTOR_MODIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // constructor_modifier*
  public static boolean constructor_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<constructor modifiers>");
    int c = current_position_(b);
    while (true) {
      if (!constructor_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "constructor_modifiers", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, CONSTRUCTOR_MODIFIERS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // 'continue'  ';'
  public static boolean continue_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continue_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<continue statement>");
    r = consumeToken(b, "continue");
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, CONTINUE_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('implicit' 'operator' type '(' type identifier ')')
  //     | ('explicit' 'operator' type '(' type identifier ')')
  public static boolean conversion_operator_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conversion_operator_declarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<conversion operator declarator>");
    r = conversion_operator_declarator_0(b, l + 1);
    if (!r) r = conversion_operator_declarator_1(b, l + 1);
    exit_section_(b, l, m, CONVERSION_OPERATOR_DECLARATOR, r, false, null);
    return r;
  }

  // 'implicit' 'operator' type '(' type identifier ')'
  private static boolean conversion_operator_declarator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conversion_operator_declarator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "implicit");
    r = r && consumeToken(b, "operator");
    r = r && type(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'explicit' 'operator' type '(' type identifier ')'
  private static boolean conversion_operator_declarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conversion_operator_declarator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "explicit");
    r = r && consumeToken(b, "operator");
    r = r && type(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (local_variable_declaration ';') | (local_constant_declaration ';')
  public static boolean declaration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<declaration statement>");
    r = declaration_statement_0(b, l + 1);
    if (!r) r = declaration_statement_1(b, l + 1);
    exit_section_(b, l, m, DECLARATION_STATEMENT, r, false, null);
    return r;
  }

  // local_variable_declaration ';'
  private static boolean declaration_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = local_variable_declaration(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // local_constant_declaration ';'
  private static boolean declaration_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = local_constant_declaration(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '=' expression
  public static boolean default_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_argument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<default argument>");
    r = consumeToken(b, "=");
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, DEFAULT_ARGUMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'default' '(' type ')'
  public static boolean default_value_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_value_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<default value expression>");
    r = consumeToken(b, "default");
    r = r && consumeToken(b, "(");
    r = r && type(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, DEFAULT_VALUE_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'new' delegate_type '(' expression ')'
  public static boolean delegate_creation_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_creation_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<delegate creation expression>");
    r = consumeToken(b, "new");
    r = r && delegate_type(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, DELEGATE_CREATION_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [attributes] [delegate_modifiers] 'delegate' return_type identifier
  //     [variant_type_parameter_list] '(' [formal_parameter_list] ')' [type_parameter_constraints_clauses] ';'
  public static boolean delegate_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<delegate declaration>");
    r = delegate_declaration_0(b, l + 1);
    r = r && delegate_declaration_1(b, l + 1);
    r = r && consumeToken(b, "delegate");
    r = r && return_type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && delegate_declaration_5(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && delegate_declaration_7(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && delegate_declaration_9(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, DELEGATE_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean delegate_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [delegate_modifiers]
  private static boolean delegate_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_1")) return false;
    delegate_modifiers(b, l + 1);
    return true;
  }

  // [variant_type_parameter_list]
  private static boolean delegate_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_5")) return false;
    variant_type_parameter_list(b, l + 1);
    return true;
  }

  // [formal_parameter_list]
  private static boolean delegate_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_7")) return false;
    formal_parameter_list(b, l + 1);
    return true;
  }

  // [type_parameter_constraints_clauses]
  private static boolean delegate_declaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_declaration_9")) return false;
    type_parameter_constraints_clauses(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'new' | 'public' | 'protected' | 'internal' | 'private'
  public static boolean delegate_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<delegate modifier>");
    r = consumeToken(b, "new");
    if (!r) r = consumeToken(b, "public");
    if (!r) r = consumeToken(b, "protected");
    if (!r) r = consumeToken(b, "internal");
    if (!r) r = consumeToken(b, "private");
    exit_section_(b, l, m, DELEGATE_MODIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // delegate_modifier*
  public static boolean delegate_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<delegate modifiers>");
    int c = current_position_(b);
    while (true) {
      if (!delegate_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "delegate_modifiers", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, DELEGATE_MODIFIERS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // type_name
  public static boolean delegate_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "delegate_type")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_name(b, l + 1);
    exit_section_(b, m, DELEGATE_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // block | ';'
  public static boolean destructor_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "destructor_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<destructor body>");
    r = block(b, l + 1);
    if (!r) r = consumeToken(b, ";");
    exit_section_(b, l, m, DESTRUCTOR_BODY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [attributes] ['extern'] '~' identifier  '(' ')' destructor_body
  public static boolean destructor_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "destructor_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<destructor declaration>");
    r = destructor_declaration_0(b, l + 1);
    r = r && destructor_declaration_1(b, l + 1);
    r = r && consumeToken(b, "~");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, ")");
    r = r && destructor_body(b, l + 1);
    exit_section_(b, l, m, DESTRUCTOR_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean destructor_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "destructor_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // ['extern']
  private static boolean destructor_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "destructor_declaration_1")) return false;
    consumeToken(b, "extern");
    return true;
  }

  /* ********************************************************** */
  // ','*
  public static boolean dim_separators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dim_separators")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<dim separators>");
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, ",")) break;
      if (!empty_element_parsed_guard_(b, "dim_separators", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, DIM_SEPARATORS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // 'do' embedded_statement 'while' '(' boolean_expression ')' ';'
  public static boolean do_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "do_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<do statement>");
    r = consumeToken(b, "do");
    r = r && embedded_statement(b, l + 1);
    r = r && consumeToken(b, "while");
    r = r && consumeToken(b, "(");
    r = r && boolean_expression(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, DO_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // non_assignment_expression | ('{'  expression_list '}')
  public static boolean element_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<element initializer>");
    r = non_assignment_expression(b, l + 1);
    if (!r) r = element_initializer_1(b, l + 1);
    exit_section_(b, l, m, ELEMENT_INITIALIZER, r, false, null);
    return r;
  }

  // '{'  expression_list '}'
  private static boolean element_initializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_initializer_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && expression_list(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // element_initializer ( ','  element_initializer) *
  public static boolean element_initializer_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_initializer_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<element initializer list>");
    r = element_initializer(b, l + 1);
    r = r && element_initializer_list_1(b, l + 1);
    exit_section_(b, l, m, ELEMENT_INITIALIZER_LIST, r, false, null);
    return r;
  }

  // ( ','  element_initializer) *
  private static boolean element_initializer_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_initializer_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!element_initializer_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "element_initializer_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','  element_initializer
  private static boolean element_initializer_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "element_initializer_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && element_initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // block | empty_statement | expression_statement | selection_statement | iteration_statement
  //     | jump_statement | try_statement | checked_statement | unchecked_statement | lock_statement | using_statement
  //     | yield_statement
  public static boolean embedded_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "embedded_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<embedded statement>");
    r = block(b, l + 1);
    if (!r) r = empty_statement(b, l + 1);
    if (!r) r = expression_statement(b, l + 1);
    if (!r) r = selection_statement(b, l + 1);
    if (!r) r = iteration_statement(b, l + 1);
    if (!r) r = jump_statement(b, l + 1);
    if (!r) r = try_statement(b, l + 1);
    if (!r) r = checked_statement(b, l + 1);
    if (!r) r = unchecked_statement(b, l + 1);
    if (!r) r = lock_statement(b, l + 1);
    if (!r) r = using_statement(b, l + 1);
    if (!r) r = yield_statement(b, l + 1);
    exit_section_(b, l, m, EMBEDDED_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ';'
  public static boolean empty_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "empty_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<empty statement>");
    r = consumeToken(b, ";");
    exit_section_(b, l, m, EMPTY_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ':' integral_type
  public static boolean enum_base(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_base")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<enum base>");
    r = consumeToken(b, ":");
    r = r && integral_type(b, l + 1);
    exit_section_(b, l, m, ENUM_BASE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('{' [enum_member_declarations] '}') | ('{' enum_member_declarations ',' '}')
  public static boolean enum_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<enum body>");
    r = enum_body_0(b, l + 1);
    if (!r) r = enum_body_1(b, l + 1);
    exit_section_(b, l, m, ENUM_BODY, r, false, null);
    return r;
  }

  // '{' [enum_member_declarations] '}'
  private static boolean enum_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_body_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && enum_body_0_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // [enum_member_declarations]
  private static boolean enum_body_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_body_0_1")) return false;
    enum_member_declarations(b, l + 1);
    return true;
  }

  // '{' enum_member_declarations ',' '}'
  private static boolean enum_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_body_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && enum_member_declarations(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [attributes] [enum_modifiers] 'enum' identifier [enum_base] enum_body [';']
  public static boolean enum_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<enum declaration>");
    r = enum_declaration_0(b, l + 1);
    r = r && enum_declaration_1(b, l + 1);
    r = r && consumeToken(b, "enum");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && enum_declaration_4(b, l + 1);
    r = r && enum_body(b, l + 1);
    r = r && enum_declaration_6(b, l + 1);
    exit_section_(b, l, m, ENUM_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean enum_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [enum_modifiers]
  private static boolean enum_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_1")) return false;
    enum_modifiers(b, l + 1);
    return true;
  }

  // [enum_base]
  private static boolean enum_declaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_4")) return false;
    enum_base(b, l + 1);
    return true;
  }

  // [';']
  private static boolean enum_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_declaration_6")) return false;
    consumeToken(b, ";");
    return true;
  }

  /* ********************************************************** */
  // ([attributes] identifier )| ( [attributes] identifier '=' constant_expression)
  public static boolean enum_member_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_member_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<enum member declaration>");
    r = enum_member_declaration_0(b, l + 1);
    if (!r) r = enum_member_declaration_1(b, l + 1);
    exit_section_(b, l, m, ENUM_MEMBER_DECLARATION, r, false, null);
    return r;
  }

  // [attributes] identifier
  private static boolean enum_member_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_member_declaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_member_declaration_0_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // [attributes]
  private static boolean enum_member_declaration_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_member_declaration_0_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [attributes] identifier '=' constant_expression
  private static boolean enum_member_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_member_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enum_member_declaration_1_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && constant_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [attributes]
  private static boolean enum_member_declaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_member_declaration_1_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // enum_member_declaration [(',' enum_member_declaration)*]
  public static boolean enum_member_declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_member_declarations")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<enum member declarations>");
    r = enum_member_declaration(b, l + 1);
    r = r && enum_member_declarations_1(b, l + 1);
    exit_section_(b, l, m, ENUM_MEMBER_DECLARATIONS, r, false, null);
    return r;
  }

  // [(',' enum_member_declaration)*]
  private static boolean enum_member_declarations_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_member_declarations_1")) return false;
    enum_member_declarations_1_0(b, l + 1);
    return true;
  }

  // (',' enum_member_declaration)*
  private static boolean enum_member_declarations_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_member_declarations_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!enum_member_declarations_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_member_declarations_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' enum_member_declaration
  private static boolean enum_member_declarations_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_member_declarations_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && enum_member_declaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'new' | 'public' | 'protected' | 'internal' | 'private'
  public static boolean enum_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<enum modifier>");
    r = consumeToken(b, "new");
    if (!r) r = consumeToken(b, "public");
    if (!r) r = consumeToken(b, "protected");
    if (!r) r = consumeToken(b, "internal");
    if (!r) r = consumeToken(b, "private");
    exit_section_(b, l, m, ENUM_MODIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // enum_modifier*
  public static boolean enum_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<enum modifiers>");
    int c = current_position_(b);
    while (true) {
      if (!enum_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enum_modifiers", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, ENUM_MODIFIERS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // type_name
  public static boolean enum_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_type")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_name(b, l + 1);
    exit_section_(b, m, ENUM_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // (add_accessor_declaration remove_accessor_declaration) |
  //     (remove_accessor_declaration add_accessor_declaration)
  public static boolean event_accessor_declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_accessor_declarations")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<event accessor declarations>");
    r = event_accessor_declarations_0(b, l + 1);
    if (!r) r = event_accessor_declarations_1(b, l + 1);
    exit_section_(b, l, m, EVENT_ACCESSOR_DECLARATIONS, r, false, null);
    return r;
  }

  // add_accessor_declaration remove_accessor_declaration
  private static boolean event_accessor_declarations_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_accessor_declarations_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = add_accessor_declaration(b, l + 1);
    r = r && remove_accessor_declaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // remove_accessor_declaration add_accessor_declaration
  private static boolean event_accessor_declarations_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_accessor_declarations_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = remove_accessor_declaration(b, l + 1);
    r = r && add_accessor_declaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ([attributes] [event_modifiers] 'event' type variable_declarators ';')
  //     | ([attributes] [event_modifiers] 'event' type member_name '{' event_accessor_declarations '}')
  public static boolean event_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<event declaration>");
    r = event_declaration_0(b, l + 1);
    if (!r) r = event_declaration_1(b, l + 1);
    exit_section_(b, l, m, EVENT_DECLARATION, r, false, null);
    return r;
  }

  // [attributes] [event_modifiers] 'event' type variable_declarators ';'
  private static boolean event_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_declaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = event_declaration_0_0(b, l + 1);
    r = r && event_declaration_0_1(b, l + 1);
    r = r && consumeToken(b, "event");
    r = r && type(b, l + 1);
    r = r && variable_declarators(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // [attributes]
  private static boolean event_declaration_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_declaration_0_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [event_modifiers]
  private static boolean event_declaration_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_declaration_0_1")) return false;
    event_modifiers(b, l + 1);
    return true;
  }

  // [attributes] [event_modifiers] 'event' type member_name '{' event_accessor_declarations '}'
  private static boolean event_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_declaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = event_declaration_1_0(b, l + 1);
    r = r && event_declaration_1_1(b, l + 1);
    r = r && consumeToken(b, "event");
    r = r && type(b, l + 1);
    r = r && member_name(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && event_accessor_declarations(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // [attributes]
  private static boolean event_declaration_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_declaration_1_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [event_modifiers]
  private static boolean event_declaration_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_declaration_1_1")) return false;
    event_modifiers(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'new' | 'public' | 'protected' | 'internal' | 'private' | 'static' | 'virtual' | 'sealed' | 'override'
  //     | 'abstract' | 'extern'
  public static boolean event_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<event modifier>");
    r = consumeToken(b, "new");
    if (!r) r = consumeToken(b, "public");
    if (!r) r = consumeToken(b, "protected");
    if (!r) r = consumeToken(b, "internal");
    if (!r) r = consumeToken(b, "private");
    if (!r) r = consumeToken(b, "static");
    if (!r) r = consumeToken(b, "virtual");
    if (!r) r = consumeToken(b, "sealed");
    if (!r) r = consumeToken(b, "override");
    if (!r) r = consumeToken(b, "abstract");
    if (!r) r = consumeToken(b, "extern");
    exit_section_(b, l, m, EVENT_MODIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // event_modifier*
  public static boolean event_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "event_modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<event modifiers>");
    int c = current_position_(b);
    while (true) {
      if (!event_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "event_modifiers", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, EVENT_MODIFIERS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // [anonymous_function_parameter_modifier] type identifier
  public static boolean explicit_anonymous_function_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_anonymous_function_parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<explicit anonymous function parameter>");
    r = explicit_anonymous_function_parameter_0(b, l + 1);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, EXPLICIT_ANONYMOUS_FUNCTION_PARAMETER, r, false, null);
    return r;
  }

  // [anonymous_function_parameter_modifier]
  private static boolean explicit_anonymous_function_parameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_anonymous_function_parameter_0")) return false;
    anonymous_function_parameter_modifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // explicit_anonymous_function_parameter (',' explicit_anonymous_function_parameter)*
  public static boolean explicit_anonymous_function_parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_anonymous_function_parameter_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<explicit anonymous function parameter list>");
    r = explicit_anonymous_function_parameter(b, l + 1);
    r = r && explicit_anonymous_function_parameter_list_1(b, l + 1);
    exit_section_(b, l, m, EXPLICIT_ANONYMOUS_FUNCTION_PARAMETER_LIST, r, false, null);
    return r;
  }

  // (',' explicit_anonymous_function_parameter)*
  private static boolean explicit_anonymous_function_parameter_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_anonymous_function_parameter_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!explicit_anonymous_function_parameter_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "explicit_anonymous_function_parameter_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' explicit_anonymous_function_parameter
  private static boolean explicit_anonymous_function_parameter_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_anonymous_function_parameter_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && explicit_anonymous_function_parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '('  [explicit_anonymous_function_parameter_list] ')'
  public static boolean explicit_anonymous_function_signature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_anonymous_function_signature")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<explicit anonymous function signature>");
    r = consumeToken(b, "(");
    r = r && explicit_anonymous_function_signature_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, EXPLICIT_ANONYMOUS_FUNCTION_SIGNATURE, r, false, null);
    return r;
  }

  // [explicit_anonymous_function_parameter_list]
  private static boolean explicit_anonymous_function_signature_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "explicit_anonymous_function_signature_1")) return false;
    explicit_anonymous_function_parameter_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // non_assignment_expression | (unary_expression | assignment_operator expression)
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<expression>");
    r = non_assignment_expression(b, l + 1);
    if (!r) r = expression_1(b, l + 1);
    exit_section_(b, l, m, EXPRESSION, r, false, null);
    return r;
  }

  // unary_expression | assignment_operator expression
  private static boolean expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unary_expression(b, l + 1);
    if (!r) r = expression_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // assignment_operator expression
  private static boolean expression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignment_operator(b, l + 1);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression ( ','  expression) *
  public static boolean expression_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<expression list>");
    r = expression(b, l + 1);
    r = r && expression_list_1(b, l + 1);
    exit_section_(b, l, m, EXPRESSION_LIST, r, false, null);
    return r;
  }

  // ( ','  expression) *
  private static boolean expression_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expression_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','  expression
  private static boolean expression_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // statement_expression ';'
  public static boolean expression_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<expression statement>");
    r = statement_expression(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, EXPRESSION_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' [argument_list] ')'
  //      '[' (expression_list | expression) ']'
  //      | '--'
  //      | '++'
  //      | '.' identifier [type_argument_list]
  static boolean expression_trail(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_trail")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_trail_0(b, l + 1);
    if (!r) r = consumeToken(b, "--");
    if (!r) r = consumeToken(b, "++");
    if (!r) r = expression_trail_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' [argument_list] ')'
  //      '[' (expression_list | expression) ']'
  private static boolean expression_trail_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_trail_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && expression_trail_0_1(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, "[");
    r = r && expression_trail_0_4(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // [argument_list]
  private static boolean expression_trail_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_trail_0_1")) return false;
    argument_list(b, l + 1);
    return true;
  }

  // expression_list | expression
  private static boolean expression_trail_0_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_trail_0_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_list(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '.' identifier [type_argument_list]
  private static boolean expression_trail_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_trail_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && expression_trail_3_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [type_argument_list]
  private static boolean expression_trail_3_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_trail_3_2")) return false;
    type_argument_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'extern' 'alias' identifier ';'
  public static boolean extern_alias_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_alias_directive")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<extern alias directive>");
    r = consumeToken(b, "extern");
    r = r && consumeToken(b, "alias");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, EXTERN_ALIAS_DIRECTIVE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // extern_alias_directive *
  public static boolean extern_alias_directives(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extern_alias_directives")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<extern alias directives>");
    int c = current_position_(b);
    while (true) {
      if (!extern_alias_directive(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "extern_alias_directives", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, EXTERN_ALIAS_DIRECTIVES, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // [attributes] [field_modifiers] type variable_declarators ';'
  public static boolean field_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<field declaration>");
    r = field_declaration_0(b, l + 1);
    r = r && field_declaration_1(b, l + 1);
    r = r && type(b, l + 1);
    r = r && variable_declarators(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, FIELD_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean field_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [field_modifiers]
  private static boolean field_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_declaration_1")) return false;
    field_modifiers(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'new' | 'public' | 'protected' | 'internal' | 'private' | 'static' | 'readonly' | 'volatile'
  public static boolean field_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<field modifier>");
    r = consumeToken(b, "new");
    if (!r) r = consumeToken(b, "public");
    if (!r) r = consumeToken(b, "protected");
    if (!r) r = consumeToken(b, "internal");
    if (!r) r = consumeToken(b, "private");
    if (!r) r = consumeToken(b, "static");
    if (!r) r = consumeToken(b, "readonly");
    if (!r) r = consumeToken(b, "volatile");
    exit_section_(b, l, m, FIELD_MODIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // field_modifier *
  public static boolean field_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "field_modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<field modifiers>");
    int c = current_position_(b);
    while (true) {
      if (!field_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "field_modifiers", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, FIELD_MODIFIERS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // 'finally' block
  public static boolean finally_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "finally_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<finally clause>");
    r = consumeToken(b, "finally");
    r = r && block(b, l + 1);
    exit_section_(b, l, m, FINALLY_CLAUSE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [attributes] [parameter_modifier] type identifier [default_argument]
  public static boolean fixed_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fixed_parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<fixed parameter>");
    r = fixed_parameter_0(b, l + 1);
    r = r && fixed_parameter_1(b, l + 1);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && fixed_parameter_4(b, l + 1);
    exit_section_(b, l, m, FIXED_PARAMETER, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean fixed_parameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fixed_parameter_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [parameter_modifier]
  private static boolean fixed_parameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fixed_parameter_1")) return false;
    parameter_modifier(b, l + 1);
    return true;
  }

  // [default_argument]
  private static boolean fixed_parameter_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fixed_parameter_4")) return false;
    default_argument(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // fixed_parameter  [(',' fixed_parameter) * ]
  public static boolean fixed_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fixed_parameters")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<fixed parameters>");
    r = fixed_parameter(b, l + 1);
    r = r && fixed_parameters_1(b, l + 1);
    exit_section_(b, l, m, FIXED_PARAMETERS, r, false, null);
    return r;
  }

  // [(',' fixed_parameter) * ]
  private static boolean fixed_parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fixed_parameters_1")) return false;
    fixed_parameters_1_0(b, l + 1);
    return true;
  }

  // (',' fixed_parameter) *
  private static boolean fixed_parameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fixed_parameters_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!fixed_parameters_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "fixed_parameters_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' fixed_parameter
  private static boolean fixed_parameters_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "fixed_parameters_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && fixed_parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'float' | 'double'
  public static boolean floating_point_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "floating_point_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<floating point type>");
    r = consumeToken(b, "float");
    if (!r) r = consumeToken(b, "double");
    exit_section_(b, l, m, FLOATING_POINT_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // boolean_expression
  public static boolean for_condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<for condition>");
    r = boolean_expression(b, l + 1);
    exit_section_(b, l, m, FOR_CONDITION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // local_variable_declaration | statement_expression_list
  public static boolean for_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<for initializer>");
    r = local_variable_declaration(b, l + 1);
    if (!r) r = statement_expression_list(b, l + 1);
    exit_section_(b, l, m, FOR_INITIALIZER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // statement_expression_list
  public static boolean for_iterator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_iterator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<for iterator>");
    r = statement_expression_list(b, l + 1);
    exit_section_(b, l, m, FOR_ITERATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'for' '(' [for_initializer] ';' [for_condition] ';' [for_iterator] ')'  embedded_statement
  public static boolean for_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<for statement>");
    r = consumeToken(b, "for");
    r = r && consumeToken(b, "(");
    r = r && for_statement_2(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && for_statement_4(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && for_statement_6(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && embedded_statement(b, l + 1);
    exit_section_(b, l, m, FOR_STATEMENT, r, false, null);
    return r;
  }

  // [for_initializer]
  private static boolean for_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_2")) return false;
    for_initializer(b, l + 1);
    return true;
  }

  // [for_condition]
  private static boolean for_statement_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_4")) return false;
    for_condition(b, l + 1);
    return true;
  }

  // [for_iterator]
  private static boolean for_statement_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "for_statement_6")) return false;
    for_iterator(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'foreach' '(' local_variable_type identifier 'in' expression ')'   embedded_statement
  public static boolean foreach_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreach_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<foreach statement>");
    r = consumeToken(b, "foreach");
    r = r && consumeToken(b, "(");
    r = r && local_variable_type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "in");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && embedded_statement(b, l + 1);
    exit_section_(b, l, m, FOREACH_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // fixed_parameters | (fixed_parameters ',' parameter_array) | parameter_array
  public static boolean formal_parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameter_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<formal parameter list>");
    r = fixed_parameters(b, l + 1);
    if (!r) r = formal_parameter_list_1(b, l + 1);
    if (!r) r = parameter_array(b, l + 1);
    exit_section_(b, l, m, FORMAL_PARAMETER_LIST, r, false, null);
    return r;
  }

  // fixed_parameters ',' parameter_array
  private static boolean formal_parameter_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "formal_parameter_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = fixed_parameters(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && parameter_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'from' [type] identifier 'in' expression
  public static boolean from_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "from_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<from clause>");
    r = consumeToken(b, "from");
    r = r && from_clause_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "in");
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, FROM_CLAUSE, r, false, null);
    return r;
  }

  // [type]
  private static boolean from_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "from_clause_1")) return false;
    type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'catch' block
  public static boolean general_catch_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "general_catch_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<general catch clause>");
    r = consumeToken(b, "catch");
    r = r && block(b, l + 1);
    exit_section_(b, l, m, GENERAL_CATCH_CLAUSE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<' [(',')*] '>'
  public static boolean generic_dimension_specifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_dimension_specifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<generic dimension specifier>");
    r = consumeToken(b, "<");
    r = r && generic_dimension_specifier_1(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, l, m, GENERIC_DIMENSION_SPECIFIER, r, false, null);
    return r;
  }

  // [(',')*]
  private static boolean generic_dimension_specifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_dimension_specifier_1")) return false;
    generic_dimension_specifier_1_0(b, l + 1);
    return true;
  }

  // (',')*
  private static boolean generic_dimension_specifier_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_dimension_specifier_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!generic_dimension_specifier_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "generic_dimension_specifier_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (',')
  private static boolean generic_dimension_specifier_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "generic_dimension_specifier_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [attributes] [accessor_modifier] 'get' accessor_body
  public static boolean get_accessor_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "get_accessor_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<get accessor declaration>");
    r = get_accessor_declaration_0(b, l + 1);
    r = r && get_accessor_declaration_1(b, l + 1);
    r = r && consumeToken(b, "get");
    r = r && accessor_body(b, l + 1);
    exit_section_(b, l, m, GET_ACCESSOR_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean get_accessor_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "get_accessor_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [accessor_modifier]
  private static boolean get_accessor_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "get_accessor_declaration_1")) return false;
    accessor_modifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ('[' global_attribute_target_specifier attribute_list ']')
  //     | ('[' global_attribute_target_specifier attribute_list ',' ']')
  public static boolean global_attribute_section(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_attribute_section")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<global attribute section>");
    r = global_attribute_section_0(b, l + 1);
    if (!r) r = global_attribute_section_1(b, l + 1);
    exit_section_(b, l, m, GLOBAL_ATTRIBUTE_SECTION, r, false, null);
    return r;
  }

  // '[' global_attribute_target_specifier attribute_list ']'
  private static boolean global_attribute_section_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_attribute_section_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && global_attribute_target_specifier(b, l + 1);
    r = r && attribute_list(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' global_attribute_target_specifier attribute_list ',' ']'
  private static boolean global_attribute_section_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_attribute_section_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && global_attribute_target_specifier(b, l + 1);
    r = r && attribute_list(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // global_attribute_section*
  public static boolean global_attribute_sections(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_attribute_sections")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<global attribute sections>");
    int c = current_position_(b);
    while (true) {
      if (!global_attribute_section(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "global_attribute_sections", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, GLOBAL_ATTRIBUTE_SECTIONS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // 'assembly' | 'module'
  public static boolean global_attribute_target(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_attribute_target")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<global attribute target>");
    r = consumeToken(b, "assembly");
    if (!r) r = consumeToken(b, "module");
    exit_section_(b, l, m, GLOBAL_ATTRIBUTE_TARGET, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // global_attribute_target ':'
  public static boolean global_attribute_target_specifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_attribute_target_specifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<global attribute target specifier>");
    r = global_attribute_target(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, l, m, GLOBAL_ATTRIBUTE_TARGET_SPECIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // global_attribute_sections
  public static boolean global_attributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "global_attributes")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<global attributes>");
    r = global_attribute_sections(b, l + 1);
    exit_section_(b, l, m, GLOBAL_ATTRIBUTES, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('goto' identifier ';') | ('goto' 'case' constant_expression ';') | ('goto' 'default' ';' )
  public static boolean goto_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "goto_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<goto statement>");
    r = goto_statement_0(b, l + 1);
    if (!r) r = goto_statement_1(b, l + 1);
    if (!r) r = goto_statement_2(b, l + 1);
    exit_section_(b, l, m, GOTO_STATEMENT, r, false, null);
    return r;
  }

  // 'goto' identifier ';'
  private static boolean goto_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "goto_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "goto");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'goto' 'case' constant_expression ';'
  private static boolean goto_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "goto_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "goto");
    r = r && consumeToken(b, "case");
    r = r && constant_expression(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'goto' 'default' ';'
  private static boolean goto_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "goto_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "goto");
    r = r && consumeToken(b, "default");
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'group' expression 'by' expression
  public static boolean group_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "group_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<group clause>");
    r = consumeToken(b, "group");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, "by");
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, GROUP_CLAUSE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('if' '(' boolean_expression ')' embedded_statement)
  //     | ('if' '(' boolean_expression ')' embedded_statement 'else' embedded_statement)
  public static boolean if_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<if statement>");
    r = if_statement_0(b, l + 1);
    if (!r) r = if_statement_1(b, l + 1);
    exit_section_(b, l, m, IF_STATEMENT, r, false, null);
    return r;
  }

  // 'if' '(' boolean_expression ')' embedded_statement
  private static boolean if_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "if");
    r = r && consumeToken(b, "(");
    r = r && boolean_expression(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && embedded_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'if' '(' boolean_expression ')' embedded_statement 'else' embedded_statement
  private static boolean if_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "if");
    r = r && consumeToken(b, "(");
    r = r && boolean_expression(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && embedded_statement(b, l + 1);
    r = r && consumeToken(b, "else");
    r = r && embedded_statement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean implicit_anonymous_function_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implicit_anonymous_function_parameter")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, IMPLICIT_ANONYMOUS_FUNCTION_PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // implicit_anonymous_function_parameter
  //     (',' implicit_anonymous_function_parameter ) *
  public static boolean implicit_anonymous_function_parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implicit_anonymous_function_parameter_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = implicit_anonymous_function_parameter(b, l + 1);
    r = r && implicit_anonymous_function_parameter_list_1(b, l + 1);
    exit_section_(b, m, IMPLICIT_ANONYMOUS_FUNCTION_PARAMETER_LIST, r);
    return r;
  }

  // (',' implicit_anonymous_function_parameter ) *
  private static boolean implicit_anonymous_function_parameter_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implicit_anonymous_function_parameter_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!implicit_anonymous_function_parameter_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "implicit_anonymous_function_parameter_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' implicit_anonymous_function_parameter
  private static boolean implicit_anonymous_function_parameter_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implicit_anonymous_function_parameter_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && implicit_anonymous_function_parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ('(' [implicit_anonymous_function_parameter_list] ')')
  //     | implicit_anonymous_function_parameter
  public static boolean implicit_anonymous_function_signature(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implicit_anonymous_function_signature")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<implicit anonymous function signature>");
    r = implicit_anonymous_function_signature_0(b, l + 1);
    if (!r) r = implicit_anonymous_function_parameter(b, l + 1);
    exit_section_(b, l, m, IMPLICIT_ANONYMOUS_FUNCTION_SIGNATURE, r, false, null);
    return r;
  }

  // '(' [implicit_anonymous_function_parameter_list] ')'
  private static boolean implicit_anonymous_function_signature_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implicit_anonymous_function_signature_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && implicit_anonymous_function_signature_0_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // [implicit_anonymous_function_parameter_list]
  private static boolean implicit_anonymous_function_signature_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "implicit_anonymous_function_signature_0_1")) return false;
    implicit_anonymous_function_parameter_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [attributes] [indexer_modifiers] indexer_declarator '{' accessor_declarations '}'
  public static boolean indexer_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexer_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<indexer declaration>");
    r = indexer_declaration_0(b, l + 1);
    r = r && indexer_declaration_1(b, l + 1);
    r = r && indexer_declarator(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && accessor_declarations(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, INDEXER_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean indexer_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexer_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [indexer_modifiers]
  private static boolean indexer_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexer_declaration_1")) return false;
    indexer_modifiers(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (type this '[' formal_parameter_list ']')
  //     | (type interface_type '.' this '[' formal_parameter_list ']')
  public static boolean indexer_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexer_declarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<indexer declarator>");
    r = indexer_declarator_0(b, l + 1);
    if (!r) r = indexer_declarator_1(b, l + 1);
    exit_section_(b, l, m, INDEXER_DECLARATOR, r, false, null);
    return r;
  }

  // type this '[' formal_parameter_list ']'
  private static boolean indexer_declarator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexer_declarator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && consumeToken(b, THIS);
    r = r && consumeToken(b, "[");
    r = r && formal_parameter_list(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // type interface_type '.' this '[' formal_parameter_list ']'
  private static boolean indexer_declarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexer_declarator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && interface_type(b, l + 1);
    r = r && consumeToken(b, ".");
    r = r && consumeToken(b, THIS);
    r = r && consumeToken(b, "[");
    r = r && formal_parameter_list(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'new' | 'public' |'protected' | 'internal' | 'private' | 'virtual' | 'sealed' | 'override'
  //     | 'abstract'| 'extern'
  public static boolean indexer_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexer_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<indexer modifier>");
    r = consumeToken(b, "new");
    if (!r) r = consumeToken(b, "public");
    if (!r) r = consumeToken(b, "protected");
    if (!r) r = consumeToken(b, "internal");
    if (!r) r = consumeToken(b, "private");
    if (!r) r = consumeToken(b, "virtual");
    if (!r) r = consumeToken(b, "sealed");
    if (!r) r = consumeToken(b, "override");
    if (!r) r = consumeToken(b, "abstract");
    if (!r) r = consumeToken(b, "extern");
    exit_section_(b, l, m, INDEXER_MODIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // indexer_modifier*
  public static boolean indexer_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexer_modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<indexer modifiers>");
    int c = current_position_(b);
    while (true) {
      if (!indexer_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "indexer_modifiers", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, INDEXER_MODIFIERS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // expression | object_or_collection_initializer
  public static boolean initializer_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<initializer value>");
    r = expression(b, l + 1);
    if (!r) r = object_or_collection_initializer(b, l + 1);
    exit_section_(b, l, m, INITIALIZER_VALUE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'sbyte' | 'byte' | 'short' | 'ushort' | 'int' | 'uint' | 'long' | 'ulong' | 'char'
  public static boolean integral_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "integral_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<integral type>");
    r = consumeToken(b, "sbyte");
    if (!r) r = consumeToken(b, "byte");
    if (!r) r = consumeToken(b, "short");
    if (!r) r = consumeToken(b, "ushort");
    if (!r) r = consumeToken(b, "int");
    if (!r) r = consumeToken(b, "uint");
    if (!r) r = consumeToken(b, "long");
    if (!r) r = consumeToken(b, "ulong");
    if (!r) r = consumeToken(b, "char");
    exit_section_(b, l, m, INTEGRAL_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ([attributes] 'get' ';') | ([attributes] 'set' ';')
  //     | ([attributes] 'get' ';' [attributes] 'set' ';') | ([attributes] 'set' ';' [attributes] 'get' ';')
  public static boolean interface_accessors(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_accessors")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<interface accessors>");
    r = interface_accessors_0(b, l + 1);
    if (!r) r = interface_accessors_1(b, l + 1);
    if (!r) r = interface_accessors_2(b, l + 1);
    if (!r) r = interface_accessors_3(b, l + 1);
    exit_section_(b, l, m, INTERFACE_ACCESSORS, r, false, null);
    return r;
  }

  // [attributes] 'get' ';'
  private static boolean interface_accessors_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_accessors_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interface_accessors_0_0(b, l + 1);
    r = r && consumeToken(b, "get");
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // [attributes]
  private static boolean interface_accessors_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_accessors_0_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [attributes] 'set' ';'
  private static boolean interface_accessors_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_accessors_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interface_accessors_1_0(b, l + 1);
    r = r && consumeToken(b, "set");
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // [attributes]
  private static boolean interface_accessors_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_accessors_1_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [attributes] 'get' ';' [attributes] 'set' ';'
  private static boolean interface_accessors_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_accessors_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interface_accessors_2_0(b, l + 1);
    r = r && consumeToken(b, "get");
    r = r && consumeToken(b, ";");
    r = r && interface_accessors_2_3(b, l + 1);
    r = r && consumeToken(b, "set");
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // [attributes]
  private static boolean interface_accessors_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_accessors_2_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [attributes]
  private static boolean interface_accessors_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_accessors_2_3")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [attributes] 'set' ';' [attributes] 'get' ';'
  private static boolean interface_accessors_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_accessors_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interface_accessors_3_0(b, l + 1);
    r = r && consumeToken(b, "set");
    r = r && consumeToken(b, ";");
    r = r && interface_accessors_3_3(b, l + 1);
    r = r && consumeToken(b, "get");
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // [attributes]
  private static boolean interface_accessors_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_accessors_3_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [attributes]
  private static boolean interface_accessors_3_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_accessors_3_3")) return false;
    attributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ':' interface_type_list
  public static boolean interface_base(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_base")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<interface base>");
    r = consumeToken(b, ":");
    r = r && interface_type_list(b, l + 1);
    exit_section_(b, l, m, INTERFACE_BASE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '{' [interface_member_declarations] '}'
  public static boolean interface_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<interface body>");
    r = consumeToken(b, "{");
    r = r && interface_body_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, INTERFACE_BODY, r, false, null);
    return r;
  }

  // [interface_member_declarations]
  private static boolean interface_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_body_1")) return false;
    interface_member_declarations(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [attributes] [interface_modifiers] [partial] 'interface' identifier
  //     [variant_type_parameter_list] [interface_base] [type_parameter_constraints_clauses]   interface_body   [';']
  public static boolean interface_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<interface declaration>");
    r = interface_declaration_0(b, l + 1);
    r = r && interface_declaration_1(b, l + 1);
    r = r && interface_declaration_2(b, l + 1);
    r = r && consumeToken(b, "interface");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && interface_declaration_5(b, l + 1);
    r = r && interface_declaration_6(b, l + 1);
    r = r && interface_declaration_7(b, l + 1);
    r = r && interface_body(b, l + 1);
    r = r && interface_declaration_9(b, l + 1);
    exit_section_(b, l, m, INTERFACE_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean interface_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [interface_modifiers]
  private static boolean interface_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_1")) return false;
    interface_modifiers(b, l + 1);
    return true;
  }

  // [partial]
  private static boolean interface_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_2")) return false;
    consumeToken(b, PARTIAL);
    return true;
  }

  // [variant_type_parameter_list]
  private static boolean interface_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_5")) return false;
    variant_type_parameter_list(b, l + 1);
    return true;
  }

  // [interface_base]
  private static boolean interface_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_6")) return false;
    interface_base(b, l + 1);
    return true;
  }

  // [type_parameter_constraints_clauses]
  private static boolean interface_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_7")) return false;
    type_parameter_constraints_clauses(b, l + 1);
    return true;
  }

  // [';']
  private static boolean interface_declaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_declaration_9")) return false;
    consumeToken(b, ";");
    return true;
  }

  /* ********************************************************** */
  // [attributes] ['new'] 'event' type identifier ';'
  public static boolean interface_event_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_event_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<interface event declaration>");
    r = interface_event_declaration_0(b, l + 1);
    r = r && interface_event_declaration_1(b, l + 1);
    r = r && consumeToken(b, "event");
    r = r && type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, INTERFACE_EVENT_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean interface_event_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_event_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // ['new']
  private static boolean interface_event_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_event_declaration_1")) return false;
    consumeToken(b, "new");
    return true;
  }

  /* ********************************************************** */
  // [attributes] ['new']  type 'this' '[' formal_parameter_list ']' '{' interface_accessors '}'
  public static boolean interface_indexer_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_indexer_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<interface indexer declaration>");
    r = interface_indexer_declaration_0(b, l + 1);
    r = r && interface_indexer_declaration_1(b, l + 1);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, "this");
    r = r && consumeToken(b, "[");
    r = r && formal_parameter_list(b, l + 1);
    r = r && consumeToken(b, "]");
    r = r && consumeToken(b, "{");
    r = r && interface_accessors(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, INTERFACE_INDEXER_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean interface_indexer_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_indexer_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // ['new']
  private static boolean interface_indexer_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_indexer_declaration_1")) return false;
    consumeToken(b, "new");
    return true;
  }

  /* ********************************************************** */
  // interface_method_declaration | interface_property_declaration
  //     | interface_event_declaration | interface_indexer_declaration
  public static boolean interface_member_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_member_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<interface member declaration>");
    r = interface_method_declaration(b, l + 1);
    if (!r) r = interface_property_declaration(b, l + 1);
    if (!r) r = interface_event_declaration(b, l + 1);
    if (!r) r = interface_indexer_declaration(b, l + 1);
    exit_section_(b, l, m, INTERFACE_MEMBER_DECLARATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // interface_member_declaration*
  public static boolean interface_member_declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_member_declarations")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<interface member declarations>");
    int c = current_position_(b);
    while (true) {
      if (!interface_member_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_member_declarations", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, INTERFACE_MEMBER_DECLARATIONS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // [attributes] ['new'] return_type identifier type_parameter_list
  //     '(' [formal_parameter_list] ')' [type_parameter_constraints_clauses] ';'
  public static boolean interface_method_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_method_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<interface method declaration>");
    r = interface_method_declaration_0(b, l + 1);
    r = r && interface_method_declaration_1(b, l + 1);
    r = r && return_type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && type_parameter_list(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && interface_method_declaration_6(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && interface_method_declaration_8(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, INTERFACE_METHOD_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean interface_method_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_method_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // ['new']
  private static boolean interface_method_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_method_declaration_1")) return false;
    consumeToken(b, "new");
    return true;
  }

  // [formal_parameter_list]
  private static boolean interface_method_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_method_declaration_6")) return false;
    formal_parameter_list(b, l + 1);
    return true;
  }

  // [type_parameter_constraints_clauses]
  private static boolean interface_method_declaration_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_method_declaration_8")) return false;
    type_parameter_constraints_clauses(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'new' | 'public' | 'protected' | 'internal' | 'private'
  public static boolean interface_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<interface modifier>");
    r = consumeToken(b, "new");
    if (!r) r = consumeToken(b, "public");
    if (!r) r = consumeToken(b, "protected");
    if (!r) r = consumeToken(b, "internal");
    if (!r) r = consumeToken(b, "private");
    exit_section_(b, l, m, INTERFACE_MODIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // interface_modifier*
  public static boolean interface_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<interface modifiers>");
    int c = current_position_(b);
    while (true) {
      if (!interface_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_modifiers", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, INTERFACE_MODIFIERS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // [attributes]   ['new'] type identifier '{' interface_accessors '}'
  public static boolean interface_property_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_property_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<interface property declaration>");
    r = interface_property_declaration_0(b, l + 1);
    r = r && interface_property_declaration_1(b, l + 1);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "{");
    r = r && interface_accessors(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, INTERFACE_PROPERTY_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean interface_property_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_property_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // ['new']
  private static boolean interface_property_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_property_declaration_1")) return false;
    consumeToken(b, "new");
    return true;
  }

  /* ********************************************************** */
  // type_name
  public static boolean interface_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_type")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_name(b, l + 1);
    exit_section_(b, m, INTERFACE_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // interface_type [(',' interface_type)*]
  public static boolean interface_type_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_type_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interface_type(b, l + 1);
    r = r && interface_type_list_1(b, l + 1);
    exit_section_(b, m, INTERFACE_TYPE_LIST, r);
    return r;
  }

  // [(',' interface_type)*]
  private static boolean interface_type_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_type_list_1")) return false;
    interface_type_list_1_0(b, l + 1);
    return true;
  }

  // (',' interface_type)*
  private static boolean interface_type_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_type_list_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!interface_type_list_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "interface_type_list_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' interface_type
  private static boolean interface_type_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interface_type_list_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && interface_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // base_primary_expression expression_trail+
  public static boolean invocation_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "invocation_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<invocation expression>");
    r = base_primary_expression(b, l + 1);
    r = r && invocation_expression_1(b, l + 1);
    exit_section_(b, l, m, INVOCATION_EXPRESSION, r, false, null);
    return r;
  }

  // expression_trail+
  private static boolean invocation_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "invocation_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_trail(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!expression_trail(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "invocation_expression_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // while_statement | do_statement | for_statement | foreach_statement
  public static boolean iteration_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<iteration statement>");
    r = while_statement(b, l + 1);
    if (!r) r = do_statement(b, l + 1);
    if (!r) r = for_statement(b, l + 1);
    if (!r) r = foreach_statement(b, l + 1);
    exit_section_(b, l, m, ITERATION_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'join'  [type] identifier 'in' expression 'on' expression 'equals' expression
  public static boolean join_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<join clause>");
    r = consumeToken(b, "join");
    r = r && join_clause_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "in");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, "on");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, "equals");
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, JOIN_CLAUSE, r, false, null);
    return r;
  }

  // [type]
  private static boolean join_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_clause_1")) return false;
    type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'join' [type] identifier 'in' expression 'on' expression 'equals' expression 'into' identifier
  public static boolean join_into_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_into_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<join into clause>");
    r = consumeToken(b, "join");
    r = r && join_into_clause_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "in");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, "on");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, "equals");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, "into");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, JOIN_INTO_CLAUSE, r, false, null);
    return r;
  }

  // [type]
  private static boolean join_into_clause_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "join_into_clause_1")) return false;
    type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // break_statement | continue_statement | goto_statement | return_statement | throw_statement
  public static boolean jump_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jump_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<jump statement>");
    r = break_statement(b, l + 1);
    if (!r) r = continue_statement(b, l + 1);
    if (!r) r = goto_statement(b, l + 1);
    if (!r) r = return_statement(b, l + 1);
    if (!r) r = throw_statement(b, l + 1);
    exit_section_(b, l, m, JUMP_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier ':' statement
  public static boolean labeled_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "labeled_statement")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, ":");
    r = r && statement(b, l + 1);
    exit_section_(b, m, LABELED_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // anonymous_function_signature '=>' anonymous_function_body
  public static boolean lambda_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambda_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<lambda expression>");
    r = anonymous_function_signature(b, l + 1);
    r = r && consumeToken(b, "=>");
    r = r && anonymous_function_body(b, l + 1);
    exit_section_(b, l, m, LAMBDA_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'let' identifier '='  expression
  public static boolean let_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "let_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<let clause>");
    r = consumeToken(b, "let");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, LET_CLAUSE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'const' type constant_declarators
  public static boolean local_constant_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_constant_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<local constant declaration>");
    r = consumeToken(b, "const");
    r = r && type(b, l + 1);
    r = r && constant_declarators(b, l + 1);
    exit_section_(b, l, m, LOCAL_CONSTANT_DECLARATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // local_variable_type local_variable_declarators
  public static boolean local_variable_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<local variable declaration>");
    r = local_variable_type(b, l + 1);
    r = r && local_variable_declarators(b, l + 1);
    exit_section_(b, l, m, LOCAL_VARIABLE_DECLARATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier| ( identifier '=' local_variable_initializer )
  public static boolean local_variable_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declarator")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = local_variable_declarator_1(b, l + 1);
    exit_section_(b, m, LOCAL_VARIABLE_DECLARATOR, r);
    return r;
  }

  // identifier '=' local_variable_initializer
  private static boolean local_variable_declarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declarator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && local_variable_initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // local_variable_declarator [(',' local_variable_declarator) *]
  public static boolean local_variable_declarators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declarators")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = local_variable_declarator(b, l + 1);
    r = r && local_variable_declarators_1(b, l + 1);
    exit_section_(b, m, LOCAL_VARIABLE_DECLARATORS, r);
    return r;
  }

  // [(',' local_variable_declarator) *]
  private static boolean local_variable_declarators_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declarators_1")) return false;
    local_variable_declarators_1_0(b, l + 1);
    return true;
  }

  // (',' local_variable_declarator) *
  private static boolean local_variable_declarators_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declarators_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!local_variable_declarators_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "local_variable_declarators_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' local_variable_declarator
  private static boolean local_variable_declarators_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_declarators_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && local_variable_declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression | array_initializer
  public static boolean local_variable_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<local variable initializer>");
    r = expression(b, l + 1);
    if (!r) r = array_initializer(b, l + 1);
    exit_section_(b, l, m, LOCAL_VARIABLE_INITIALIZER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type | 'var'
  public static boolean local_variable_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "local_variable_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<local variable type>");
    r = type(b, l + 1);
    if (!r) r = consumeToken(b, "var");
    exit_section_(b, l, m, LOCAL_VARIABLE_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'lock' '(' expression ')' embedded_statement
  public static boolean lock_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lock_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<lock statement>");
    r = consumeToken(b, "lock");
    r = r && consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && embedded_statement(b, l + 1);
    exit_section_(b, l, m, LOCK_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // base_primary_expression expression_trail+
  public static boolean member_access(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_access")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<member access>");
    r = base_primary_expression(b, l + 1);
    r = r && member_access_1(b, l + 1);
    exit_section_(b, l, m, MEMBER_ACCESS, r, false, null);
    return r;
  }

  // expression_trail+
  private static boolean member_access_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_access_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_trail(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!expression_trail(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "member_access_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // simple_name | member_access | ( identifier '=' expression )
  public static boolean member_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_declarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<member declarator>");
    r = simple_name(b, l + 1);
    if (!r) r = member_access(b, l + 1);
    if (!r) r = member_declarator_2(b, l + 1);
    exit_section_(b, l, m, MEMBER_DECLARATOR, r, false, null);
    return r;
  }

  // identifier '=' expression
  private static boolean member_declarator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_declarator_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // member_declarator (',' member_declarator) *
  public static boolean member_declarator_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_declarator_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<member declarator list>");
    r = member_declarator(b, l + 1);
    r = r && member_declarator_list_1(b, l + 1);
    exit_section_(b, l, m, MEMBER_DECLARATOR_LIST, r, false, null);
    return r;
  }

  // (',' member_declarator) *
  private static boolean member_declarator_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_declarator_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!member_declarator_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "member_declarator_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' member_declarator
  private static boolean member_declarator_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_declarator_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && member_declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier '='  initializer_value
  public static boolean member_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_initializer")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && initializer_value(b, l + 1);
    exit_section_(b, m, MEMBER_INITIALIZER, r);
    return r;
  }

  /* ********************************************************** */
  // member_initializer ( ',' member_initializer) *
  public static boolean member_initializer_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_initializer_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = member_initializer(b, l + 1);
    r = r && member_initializer_list_1(b, l + 1);
    exit_section_(b, m, MEMBER_INITIALIZER_LIST, r);
    return r;
  }

  // ( ',' member_initializer) *
  private static boolean member_initializer_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_initializer_list_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!member_initializer_list_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "member_initializer_list_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' member_initializer
  private static boolean member_initializer_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_initializer_list_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && member_initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifier | (interface_type '.' identifier)
  public static boolean member_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = member_name_1(b, l + 1);
    exit_section_(b, m, MEMBER_NAME, r);
    return r;
  }

  // interface_type '.' identifier
  private static boolean member_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "member_name_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interface_type(b, l + 1);
    r = r && consumeToken(b, ".");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // block | ';'
  public static boolean method_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<method body>");
    r = block(b, l + 1);
    if (!r) r = consumeToken(b, ";");
    exit_section_(b, l, m, METHOD_BODY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // method_header method_body
  public static boolean method_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<method declaration>");
    r = method_header(b, l + 1);
    r = r && method_body(b, l + 1);
    exit_section_(b, l, m, METHOD_DECLARATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [attributes] [method_modifiers] [partial] return_type member_name [type_parameter_list]
  //     '(' [formal_parameter_list] ')' [type_parameter_constraints_clauses]
  public static boolean method_header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<method header>");
    r = method_header_0(b, l + 1);
    r = r && method_header_1(b, l + 1);
    r = r && method_header_2(b, l + 1);
    r = r && return_type(b, l + 1);
    r = r && member_name(b, l + 1);
    r = r && method_header_5(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && method_header_7(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && method_header_9(b, l + 1);
    exit_section_(b, l, m, METHOD_HEADER, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean method_header_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_header_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [method_modifiers]
  private static boolean method_header_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_header_1")) return false;
    method_modifiers(b, l + 1);
    return true;
  }

  // [partial]
  private static boolean method_header_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_header_2")) return false;
    consumeToken(b, PARTIAL);
    return true;
  }

  // [type_parameter_list]
  private static boolean method_header_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_header_5")) return false;
    type_parameter_list(b, l + 1);
    return true;
  }

  // [formal_parameter_list]
  private static boolean method_header_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_header_7")) return false;
    formal_parameter_list(b, l + 1);
    return true;
  }

  // [type_parameter_constraints_clauses]
  private static boolean method_header_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_header_9")) return false;
    type_parameter_constraints_clauses(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'new' | 'public' | 'protected' | 'internal' | 'private' | 'static' | 'virtual' | 'sealed'
  //     | 'override' | 'abstract' |'extern'
  public static boolean method_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<method modifier>");
    r = consumeToken(b, "new");
    if (!r) r = consumeToken(b, "public");
    if (!r) r = consumeToken(b, "protected");
    if (!r) r = consumeToken(b, "internal");
    if (!r) r = consumeToken(b, "private");
    if (!r) r = consumeToken(b, "static");
    if (!r) r = consumeToken(b, "virtual");
    if (!r) r = consumeToken(b, "sealed");
    if (!r) r = consumeToken(b, "override");
    if (!r) r = consumeToken(b, "abstract");
    if (!r) r = consumeToken(b, "extern");
    exit_section_(b, l, m, METHOD_MODIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // method_modifier*
  public static boolean method_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method_modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<method modifiers>");
    int c = current_position_(b);
    while (true) {
      if (!method_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "method_modifiers", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, METHOD_MODIFIERS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // identifier '=' attribute_argument_expression
  public static boolean named_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_argument")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && attribute_argument_expression(b, l + 1);
    exit_section_(b, m, NAMED_ARGUMENT, r);
    return r;
  }

  /* ********************************************************** */
  // named_argument  [(','  named_argument)*]
  public static boolean named_argument_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_argument_list")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = named_argument(b, l + 1);
    r = r && named_argument_list_1(b, l + 1);
    exit_section_(b, m, NAMED_ARGUMENT_LIST, r);
    return r;
  }

  // [(','  named_argument)*]
  private static boolean named_argument_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_argument_list_1")) return false;
    named_argument_list_1_0(b, l + 1);
    return true;
  }

  // (','  named_argument)*
  private static boolean named_argument_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_argument_list_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!named_argument_list_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "named_argument_list_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','  named_argument
  private static boolean named_argument_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "named_argument_list_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && named_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' [extern_alias_directives] [using_directives] [namespace_member_declarations] '}'
  public static boolean namespace_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<namespace body>");
    r = consumeToken(b, "{");
    r = r && namespace_body_1(b, l + 1);
    r = r && namespace_body_2(b, l + 1);
    r = r && namespace_body_3(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, NAMESPACE_BODY, r, false, null);
    return r;
  }

  // [extern_alias_directives]
  private static boolean namespace_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_body_1")) return false;
    extern_alias_directives(b, l + 1);
    return true;
  }

  // [using_directives]
  private static boolean namespace_body_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_body_2")) return false;
    using_directives(b, l + 1);
    return true;
  }

  // [namespace_member_declarations]
  private static boolean namespace_body_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_body_3")) return false;
    namespace_member_declarations(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'namespace' qualified_identifier namespace_body [';']
  public static boolean namespace_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<namespace declaration>");
    r = consumeToken(b, "namespace");
    r = r && qualified_identifier(b, l + 1);
    r = r && namespace_body(b, l + 1);
    r = r && namespace_declaration_3(b, l + 1);
    exit_section_(b, l, m, NAMESPACE_DECLARATION, r, false, null);
    return r;
  }

  // [';']
  private static boolean namespace_declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_declaration_3")) return false;
    consumeToken(b, ";");
    return true;
  }

  /* ********************************************************** */
  // namespace_declaration | type_declaration
  public static boolean namespace_member_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_member_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<namespace member declaration>");
    r = namespace_declaration(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    exit_section_(b, l, m, NAMESPACE_MEMBER_DECLARATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // namespace_member_declaration *
  public static boolean namespace_member_declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_member_declarations")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<namespace member declarations>");
    int c = current_position_(b);
    while (true) {
      if (!namespace_member_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "namespace_member_declarations", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, NAMESPACE_MEMBER_DECLARATIONS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // namespace_or_type_name
  static boolean namespace_name(PsiBuilder b, int l) {
    return namespace_or_type_name(b, l + 1);
  }

  /* ********************************************************** */
  // (identifier   [type_argument_list]) [ ',' (identifier [type_argument_list])]| qualified_alias_member
  public static boolean namespace_or_type_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_or_type_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespace_or_type_name_0(b, l + 1);
    if (!r) r = qualified_alias_member(b, l + 1);
    exit_section_(b, m, NAMESPACE_OR_TYPE_NAME, r);
    return r;
  }

  // (identifier   [type_argument_list]) [ ',' (identifier [type_argument_list])]
  private static boolean namespace_or_type_name_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_or_type_name_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespace_or_type_name_0_0(b, l + 1);
    r = r && namespace_or_type_name_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier   [type_argument_list]
  private static boolean namespace_or_type_name_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_or_type_name_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && namespace_or_type_name_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [type_argument_list]
  private static boolean namespace_or_type_name_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_or_type_name_0_0_1")) return false;
    type_argument_list(b, l + 1);
    return true;
  }

  // [ ',' (identifier [type_argument_list])]
  private static boolean namespace_or_type_name_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_or_type_name_0_1")) return false;
    namespace_or_type_name_0_1_0(b, l + 1);
    return true;
  }

  // ',' (identifier [type_argument_list])
  private static boolean namespace_or_type_name_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_or_type_name_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && namespace_or_type_name_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier [type_argument_list]
  private static boolean namespace_or_type_name_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_or_type_name_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && namespace_or_type_name_0_1_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [type_argument_list]
  private static boolean namespace_or_type_name_0_1_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "namespace_or_type_name_0_1_0_1_1")) return false;
    type_argument_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ( type_name | simple_type | enum_type| type_parameter | class_type | interface_type | delegate_type)
  //     ['?']
  public static boolean non_array_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "non_array_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<non array type>");
    r = non_array_type_0(b, l + 1);
    r = r && non_array_type_1(b, l + 1);
    exit_section_(b, l, m, NON_ARRAY_TYPE, r, false, null);
    return r;
  }

  // type_name | simple_type | enum_type| type_parameter | class_type | interface_type | delegate_type
  private static boolean non_array_type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "non_array_type_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_name(b, l + 1);
    if (!r) r = simple_type(b, l + 1);
    if (!r) r = enum_type(b, l + 1);
    if (!r) r = type_parameter(b, l + 1);
    if (!r) r = class_type(b, l + 1);
    if (!r) r = interface_type(b, l + 1);
    if (!r) r = delegate_type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['?']
  private static boolean non_array_type_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "non_array_type_1")) return false;
    consumeToken(b, "?");
    return true;
  }

  /* ********************************************************** */
  // conditional_expression | lambda_expression| query_expression
  public static boolean non_assignment_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "non_assignment_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<non assignment expression>");
    r = conditional_expression(b, l + 1);
    if (!r) r = lambda_expression(b, l + 1);
    if (!r) r = query_expression(b, l + 1);
    exit_section_(b, l, m, NON_ASSIGNMENT_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // integral_type | floating_point_type | 'decimal'
  public static boolean numeric_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "numeric_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<numeric type>");
    r = integral_type(b, l + 1);
    if (!r) r = floating_point_type(b, l + 1);
    if (!r) r = consumeToken(b, "decimal");
    exit_section_(b, l, m, NUMERIC_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('new' type '('  [argument_list] ')' [object_or_collection_initializer])
  //     | ('new' type  object_or_collection_initializer)
  public static boolean object_creation_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_creation_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<object creation expression>");
    r = object_creation_expression_0(b, l + 1);
    if (!r) r = object_creation_expression_1(b, l + 1);
    exit_section_(b, l, m, OBJECT_CREATION_EXPRESSION, r, false, null);
    return r;
  }

  // 'new' type '('  [argument_list] ')' [object_or_collection_initializer]
  private static boolean object_creation_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_creation_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "new");
    r = r && type(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && object_creation_expression_0_3(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && object_creation_expression_0_5(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [argument_list]
  private static boolean object_creation_expression_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_creation_expression_0_3")) return false;
    argument_list(b, l + 1);
    return true;
  }

  // [object_or_collection_initializer]
  private static boolean object_creation_expression_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_creation_expression_0_5")) return false;
    object_or_collection_initializer(b, l + 1);
    return true;
  }

  // 'new' type  object_or_collection_initializer
  private static boolean object_creation_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_creation_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "new");
    r = r && type(b, l + 1);
    r = r && object_or_collection_initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ( '{' [member_initializer_list] '}' ) | ( '{' member_initializer_list   ','   '}')
  public static boolean object_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<object initializer>");
    r = object_initializer_0(b, l + 1);
    if (!r) r = object_initializer_1(b, l + 1);
    exit_section_(b, l, m, OBJECT_INITIALIZER, r, false, null);
    return r;
  }

  // '{' [member_initializer_list] '}'
  private static boolean object_initializer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_initializer_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && object_initializer_0_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // [member_initializer_list]
  private static boolean object_initializer_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_initializer_0_1")) return false;
    member_initializer_list(b, l + 1);
    return true;
  }

  // '{' member_initializer_list   ','   '}'
  private static boolean object_initializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_initializer_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && member_initializer_list(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // object_initializer | collection_initializer
  public static boolean object_or_collection_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_or_collection_initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<object or collection initializer>");
    r = object_initializer(b, l + 1);
    if (!r) r = collection_initializer(b, l + 1);
    exit_section_(b, l, m, OBJECT_OR_COLLECTION_INITIALIZER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // block | ';'
  public static boolean operator_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<operator body>");
    r = block(b, l + 1);
    if (!r) r = consumeToken(b, ";");
    exit_section_(b, l, m, OPERATOR_BODY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [attributes] operator_modifiers   operator_declarator   operator_body
  public static boolean operator_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<operator declaration>");
    r = operator_declaration_0(b, l + 1);
    r = r && operator_modifiers(b, l + 1);
    r = r && operator_declarator(b, l + 1);
    r = r && operator_body(b, l + 1);
    exit_section_(b, l, m, OPERATOR_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean operator_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // unary_operator_declarator | binary_operator_declarator | conversion_operator_declarator
  public static boolean operator_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_declarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<operator declarator>");
    r = unary_operator_declarator(b, l + 1);
    if (!r) r = binary_operator_declarator(b, l + 1);
    if (!r) r = conversion_operator_declarator(b, l + 1);
    exit_section_(b, l, m, OPERATOR_DECLARATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'public' | 'static' | 'extern'
  public static boolean operator_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<operator modifier>");
    r = consumeToken(b, "public");
    if (!r) r = consumeToken(b, "static");
    if (!r) r = consumeToken(b, "extern");
    exit_section_(b, l, m, OPERATOR_MODIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // operator_modifier*
  public static boolean operator_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator_modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<operator modifiers>");
    int c = current_position_(b);
    while (true) {
      if (!operator_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "operator_modifiers", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, OPERATOR_MODIFIERS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // orderby orderings
  public static boolean orderby_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orderby_clause")) return false;
    if (!nextTokenIs(b, ORDERBY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ORDERBY);
    r = r && orderings(b, l + 1);
    exit_section_(b, m, ORDERBY_CLAUSE, r);
    return r;
  }

  /* ********************************************************** */
  // expression [ordering_direction]
  public static boolean ordering(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ordering")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<ordering>");
    r = expression(b, l + 1);
    r = r && ordering_1(b, l + 1);
    exit_section_(b, l, m, ORDERING, r, false, null);
    return r;
  }

  // [ordering_direction]
  private static boolean ordering_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ordering_1")) return false;
    ordering_direction(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'ascending' | 'descending'
  public static boolean ordering_direction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ordering_direction")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<ordering direction>");
    r = consumeToken(b, "ascending");
    if (!r) r = consumeToken(b, "descending");
    exit_section_(b, l, m, ORDERING_DIRECTION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ordering (',' ordering) *
  public static boolean orderings(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orderings")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<orderings>");
    r = ordering(b, l + 1);
    r = r && orderings_1(b, l + 1);
    exit_section_(b, l, m, ORDERINGS, r, false, null);
    return r;
  }

  // (',' ordering) *
  private static boolean orderings_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orderings_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!orderings_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "orderings_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' ordering
  private static boolean orderings_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orderings_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && ordering(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '+' | '-' | '*' | '/' | '%' | '&' | '|' | '^' | '<<' | right_shift | '==' | '!=' | '>'
  //     | '<' | '>=' | '<='
  public static boolean overloadable_binary_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "overloadable_binary_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<overloadable binary operator>");
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    if (!r) r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, "/");
    if (!r) r = consumeToken(b, "%");
    if (!r) r = consumeToken(b, "&");
    if (!r) r = consumeToken(b, "|");
    if (!r) r = consumeToken(b, "^");
    if (!r) r = consumeToken(b, "<<");
    if (!r) r = right_shift(b, l + 1);
    if (!r) r = consumeToken(b, "==");
    if (!r) r = consumeToken(b, "!=");
    if (!r) r = consumeToken(b, ">");
    if (!r) r = consumeToken(b, "<");
    if (!r) r = consumeToken(b, ">=");
    if (!r) r = consumeToken(b, "<=");
    exit_section_(b, l, m, OVERLOADABLE_BINARY_OPERATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '+' | '-' | '!' | '~' | '++' | '--' | 'true' | 'false'
  public static boolean overloadable_unary_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "overloadable_unary_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<overloadable unary operator>");
    r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    if (!r) r = consumeToken(b, "!");
    if (!r) r = consumeToken(b, "~");
    if (!r) r = consumeToken(b, "++");
    if (!r) r = consumeToken(b, "--");
    if (!r) r = consumeToken(b, "true");
    if (!r) r = consumeToken(b, "false");
    exit_section_(b, l, m, OVERLOADABLE_UNARY_OPERATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [attributes] 'params' array_type   identifier
  public static boolean parameter_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_array")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<parameter array>");
    r = parameter_array_0(b, l + 1);
    r = r && consumeToken(b, "params");
    r = r && array_type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, PARAMETER_ARRAY, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean parameter_array_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_array_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'ref'| 'out' | 'this'
  public static boolean parameter_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<parameter modifier>");
    r = consumeToken(b, "ref");
    if (!r) r = consumeToken(b, "out");
    if (!r) r = consumeToken(b, "this");
    exit_section_(b, l, m, PARAMETER_MODIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '(' expression ')'
  public static boolean parenthesized_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parenthesized_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<parenthesized expression>");
    r = consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, PARENTHESIZED_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [argument_name]   attribute_argument_expression
  public static boolean positional_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "positional_argument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<positional argument>");
    r = positional_argument_0(b, l + 1);
    r = r && attribute_argument_expression(b, l + 1);
    exit_section_(b, l, m, POSITIONAL_ARGUMENT, r, false, null);
    return r;
  }

  // [argument_name]
  private static boolean positional_argument_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "positional_argument_0")) return false;
    argument_name(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // positional_argument [(',' positional_argument)*]
  public static boolean positional_argument_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "positional_argument_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<positional argument list>");
    r = positional_argument(b, l + 1);
    r = r && positional_argument_list_1(b, l + 1);
    exit_section_(b, l, m, POSITIONAL_ARGUMENT_LIST, r, false, null);
    return r;
  }

  // [(',' positional_argument)*]
  private static boolean positional_argument_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "positional_argument_list_1")) return false;
    positional_argument_list_1_0(b, l + 1);
    return true;
  }

  // (',' positional_argument)*
  private static boolean positional_argument_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "positional_argument_list_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!positional_argument_list_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "positional_argument_list_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' positional_argument
  private static boolean positional_argument_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "positional_argument_list_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && positional_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // base_primary_expression expression_trail+
  public static boolean post_decrement_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "post_decrement_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<post decrement expression>");
    r = base_primary_expression(b, l + 1);
    r = r && post_decrement_expression_1(b, l + 1);
    exit_section_(b, l, m, POST_DECREMENT_EXPRESSION, r, false, null);
    return r;
  }

  // expression_trail+
  private static boolean post_decrement_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "post_decrement_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_trail(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!expression_trail(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "post_decrement_expression_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // base_primary_expression expression_trail+
  public static boolean post_increment_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "post_increment_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<post increment expression>");
    r = base_primary_expression(b, l + 1);
    r = r && post_increment_expression_1(b, l + 1);
    exit_section_(b, l, m, POST_INCREMENT_EXPRESSION, r, false, null);
    return r;
  }

  // expression_trail+
  private static boolean post_increment_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "post_increment_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression_trail(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!expression_trail(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "post_increment_expression_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '--'   unary_expression
  public static boolean pre_decrement_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pre_decrement_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<pre decrement expression>");
    r = consumeToken(b, "--");
    r = r && unary_expression(b, l + 1);
    exit_section_(b, l, m, PRE_DECREMENT_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '++' unary_expression
  public static boolean pre_increment_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pre_increment_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<pre increment expression>");
    r = consumeToken(b, "++");
    r = r && unary_expression(b, l + 1);
    exit_section_(b, l, m, PRE_INCREMENT_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'bool' | 'byte' | 'char' | 'decimal' | 'double'| 'float' | 'int' | 'long' | 'object' | 'sbyte'
  //     | 'short' | 'string' | 'uint' | 'ulong' | 'ushort'
  public static boolean predefined_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "predefined_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<predefined type>");
    r = consumeToken(b, "bool");
    if (!r) r = consumeToken(b, "byte");
    if (!r) r = consumeToken(b, "char");
    if (!r) r = consumeToken(b, "decimal");
    if (!r) r = consumeToken(b, "double");
    if (!r) r = consumeToken(b, "float");
    if (!r) r = consumeToken(b, "int");
    if (!r) r = consumeToken(b, "long");
    if (!r) r = consumeToken(b, "object");
    if (!r) r = consumeToken(b, "sbyte");
    if (!r) r = consumeToken(b, "short");
    if (!r) r = consumeToken(b, "string");
    if (!r) r = consumeToken(b, "uint");
    if (!r) r = consumeToken(b, "ulong");
    if (!r) r = consumeToken(b, "ushort");
    exit_section_(b, l, m, PREDEFINED_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // class_type | 'class' | 'struct'
  public static boolean primary_constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_constraint")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<primary constraint>");
    r = class_type(b, l + 1);
    if (!r) r = consumeToken(b, "class");
    if (!r) r = consumeToken(b, "struct");
    exit_section_(b, l, m, PRIMARY_CONSTRAINT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // base_primary_expression expression_trail*
  public static boolean primary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<primary expression>");
    r = base_primary_expression(b, l + 1);
    r = r && primary_expression_1(b, l + 1);
    exit_section_(b, l, m, PRIMARY_EXPRESSION, r, false, null);
    return r;
  }

  // expression_trail*
  private static boolean primary_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_expression_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expression_trail(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "primary_expression_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // [attributes] [property_modifiers] type member_name '{' accessor_declarations '}'
  public static boolean property_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<property declaration>");
    r = property_declaration_0(b, l + 1);
    r = r && property_declaration_1(b, l + 1);
    r = r && type(b, l + 1);
    r = r && member_name(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && accessor_declarations(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, PROPERTY_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean property_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [property_modifiers]
  private static boolean property_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_declaration_1")) return false;
    property_modifiers(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'new' | 'public' | 'protected' | 'internal' | 'private' | 'static' | 'virtual' | 'sealed'
  //     | 'override'| 'abstract' | 'extern'
  public static boolean property_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<property modifier>");
    r = consumeToken(b, "new");
    if (!r) r = consumeToken(b, "public");
    if (!r) r = consumeToken(b, "protected");
    if (!r) r = consumeToken(b, "internal");
    if (!r) r = consumeToken(b, "private");
    if (!r) r = consumeToken(b, "static");
    if (!r) r = consumeToken(b, "virtual");
    if (!r) r = consumeToken(b, "sealed");
    if (!r) r = consumeToken(b, "override");
    if (!r) r = consumeToken(b, "abstract");
    if (!r) r = consumeToken(b, "extern");
    exit_section_(b, l, m, PROPERTY_MODIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // property_modifier *
  public static boolean property_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<property modifiers>");
    int c = current_position_(b);
    while (true) {
      if (!property_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "property_modifiers", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, PROPERTY_MODIFIERS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // identifier '::' identifier [type_argument_list]
  public static boolean qualified_alias_member(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_alias_member")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "::");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && qualified_alias_member_3(b, l + 1);
    exit_section_(b, m, QUALIFIED_ALIAS_MEMBER, r);
    return r;
  }

  // [type_argument_list]
  private static boolean qualified_alias_member_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_alias_member_3")) return false;
    type_argument_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier [('.' identifier)*]
  public static boolean qualified_identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_identifier")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && qualified_identifier_1(b, l + 1);
    exit_section_(b, m, QUALIFIED_IDENTIFIER, r);
    return r;
  }

  // [('.' identifier)*]
  private static boolean qualified_identifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_identifier_1")) return false;
    qualified_identifier_1_0(b, l + 1);
    return true;
  }

  // ('.' identifier)*
  private static boolean qualified_identifier_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_identifier_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!qualified_identifier_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "qualified_identifier_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // '.' identifier
  private static boolean qualified_identifier_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "qualified_identifier_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ".");
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // [query_body_clauses] select_or_group_clause [query_continuation]
  public static boolean query_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<query body>");
    r = query_body_0(b, l + 1);
    r = r && select_or_group_clause(b, l + 1);
    r = r && query_body_2(b, l + 1);
    exit_section_(b, l, m, QUERY_BODY, r, false, null);
    return r;
  }

  // [query_body_clauses]
  private static boolean query_body_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_body_0")) return false;
    query_body_clauses(b, l + 1);
    return true;
  }

  // [query_continuation]
  private static boolean query_body_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_body_2")) return false;
    query_continuation(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // from_clause | let_clause | where_clause | join_clause | join_into_clause | orderby_clause
  public static boolean query_body_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_body_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<query body clause>");
    r = from_clause(b, l + 1);
    if (!r) r = let_clause(b, l + 1);
    if (!r) r = where_clause(b, l + 1);
    if (!r) r = join_clause(b, l + 1);
    if (!r) r = join_into_clause(b, l + 1);
    if (!r) r = orderby_clause(b, l + 1);
    exit_section_(b, l, m, QUERY_BODY_CLAUSE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // query_body_clause *
  public static boolean query_body_clauses(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_body_clauses")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<query body clauses>");
    int c = current_position_(b);
    while (true) {
      if (!query_body_clause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "query_body_clauses", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, QUERY_BODY_CLAUSES, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // 'into'   identifier   query_body
  public static boolean query_continuation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_continuation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<query continuation>");
    r = consumeToken(b, "into");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && query_body(b, l + 1);
    exit_section_(b, l, m, QUERY_CONTINUATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // from_clause query_body
  public static boolean query_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "query_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<query expression>");
    r = from_clause(b, l + 1);
    r = r && query_body(b, l + 1);
    exit_section_(b, l, m, QUERY_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '[' [dim_separators] ']'
  public static boolean rank_specifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rank_specifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<rank specifier>");
    r = consumeToken(b, "[");
    r = r && rank_specifier_1(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, l, m, RANK_SPECIFIER, r, false, null);
    return r;
  }

  // [dim_separators]
  private static boolean rank_specifier_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rank_specifier_1")) return false;
    dim_separators(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // rank_specifier *
  public static boolean rank_specifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rank_specifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<rank specifiers>");
    int c = current_position_(b);
    while (true) {
      if (!rank_specifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "rank_specifiers", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, RANK_SPECIFIERS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // [attributes] 'remove' block
  public static boolean remove_accessor_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "remove_accessor_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<remove accessor declaration>");
    r = remove_accessor_declaration_0(b, l + 1);
    r = r && consumeToken(b, "remove");
    r = r && block(b, l + 1);
    exit_section_(b, l, m, REMOVE_ACCESSOR_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean remove_accessor_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "remove_accessor_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // local_variable_declaration | expression
  public static boolean resource_acquisition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resource_acquisition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<resource acquisition>");
    r = local_variable_declaration(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, l, m, RESOURCE_ACQUISITION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'return' [expression] ';'
  public static boolean return_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<return statement>");
    r = consumeToken(b, "return");
    r = r && return_statement_1(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, RETURN_STATEMENT, r, false, null);
    return r;
  }

  // [expression]
  private static boolean return_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // type | 'void'
  public static boolean return_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<return type>");
    r = type(b, l + 1);
    if (!r) r = consumeToken(b, "void");
    exit_section_(b, l, m, RETURN_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '>>'
  public static boolean right_shift(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "right_shift")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<right shift>");
    r = consumeToken(b, ">>");
    exit_section_(b, l, m, RIGHT_SHIFT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '>>='
  public static boolean right_shift_assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "right_shift_assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<right shift assignment>");
    r = consumeToken(b, ">>=");
    exit_section_(b, l, m, RIGHT_SHIFT_ASSIGNMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ((interface_type | type_parameter) (',' (interface_type | type_parameter |secondary_constraints))+)
  //     | interface_type | type_parameter
  public static boolean secondary_constraints(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondary_constraints")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = secondary_constraints_0(b, l + 1);
    if (!r) r = interface_type(b, l + 1);
    if (!r) r = type_parameter(b, l + 1);
    exit_section_(b, m, SECONDARY_CONSTRAINTS, r);
    return r;
  }

  // (interface_type | type_parameter) (',' (interface_type | type_parameter |secondary_constraints))+
  private static boolean secondary_constraints_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondary_constraints_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = secondary_constraints_0_0(b, l + 1);
    r = r && secondary_constraints_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // interface_type | type_parameter
  private static boolean secondary_constraints_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondary_constraints_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interface_type(b, l + 1);
    if (!r) r = type_parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (',' (interface_type | type_parameter |secondary_constraints))+
  private static boolean secondary_constraints_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondary_constraints_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = secondary_constraints_0_1_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!secondary_constraints_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "secondary_constraints_0_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // ',' (interface_type | type_parameter |secondary_constraints)
  private static boolean secondary_constraints_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondary_constraints_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && secondary_constraints_0_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // interface_type | type_parameter |secondary_constraints
  private static boolean secondary_constraints_0_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondary_constraints_0_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interface_type(b, l + 1);
    if (!r) r = type_parameter(b, l + 1);
    if (!r) r = secondary_constraints(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'select'   expression
  public static boolean select_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<select clause>");
    r = consumeToken(b, "select");
    r = r && expression(b, l + 1);
    exit_section_(b, l, m, SELECT_CLAUSE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // select_clause | group_clause
  public static boolean select_or_group_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "select_or_group_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<select or group clause>");
    r = select_clause(b, l + 1);
    if (!r) r = group_clause(b, l + 1);
    exit_section_(b, l, m, SELECT_OR_GROUP_CLAUSE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // if_statement | switch_statement
  public static boolean selection_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selection_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<selection statement>");
    r = if_statement(b, l + 1);
    if (!r) r = switch_statement(b, l + 1);
    exit_section_(b, l, m, SELECTION_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [attributes] [accessor_modifier] 'set' accessor_body
  public static boolean set_accessor_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_accessor_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<set accessor declaration>");
    r = set_accessor_declaration_0(b, l + 1);
    r = r && set_accessor_declaration_1(b, l + 1);
    r = r && consumeToken(b, "set");
    r = r && accessor_body(b, l + 1);
    exit_section_(b, l, m, SET_ACCESSOR_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean set_accessor_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_accessor_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [accessor_modifier]
  private static boolean set_accessor_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "set_accessor_declaration_1")) return false;
    accessor_modifier(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier [type_argument_list]
  public static boolean simple_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && simple_name_1(b, l + 1);
    exit_section_(b, m, SIMPLE_NAME, r);
    return r;
  }

  // [type_argument_list]
  private static boolean simple_name_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_name_1")) return false;
    type_argument_list(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // numeric_type | 'bool'
  public static boolean simple_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<simple type>");
    r = numeric_type(b, l + 1);
    if (!r) r = consumeToken(b, "bool");
    exit_section_(b, l, m, SIMPLE_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'catch' '(' class_type [identifier] ')'   block
  public static boolean specific_catch_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specific_catch_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<specific catch clause>");
    r = consumeToken(b, "catch");
    r = r && consumeToken(b, "(");
    r = r && class_type(b, l + 1);
    r = r && specific_catch_clause_3(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && block(b, l + 1);
    exit_section_(b, l, m, SPECIFIC_CATCH_CLAUSE, r, false, null);
    return r;
  }

  // [identifier]
  private static boolean specific_catch_clause_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specific_catch_clause_3")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // specific_catch_clause *
  public static boolean specific_catch_clauses(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specific_catch_clauses")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<specific catch clauses>");
    int c = current_position_(b);
    while (true) {
      if (!specific_catch_clause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "specific_catch_clauses", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, SPECIFIC_CATCH_CLAUSES, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // labeled_statement | declaration_statement | embedded_statement
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<statement>");
    r = labeled_statement(b, l + 1);
    if (!r) r = declaration_statement(b, l + 1);
    if (!r) r = embedded_statement(b, l + 1);
    exit_section_(b, l, m, STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // invocation_expression | object_creation_expression | assignment | post_increment_expression
  //     post_decrement_expression | pre_increment_expression | pre_decrement_expression
  public static boolean statement_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<statement expression>");
    r = invocation_expression(b, l + 1);
    if (!r) r = object_creation_expression(b, l + 1);
    if (!r) r = assignment(b, l + 1);
    if (!r) r = statement_expression_3(b, l + 1);
    if (!r) r = pre_increment_expression(b, l + 1);
    if (!r) r = pre_decrement_expression(b, l + 1);
    exit_section_(b, l, m, STATEMENT_EXPRESSION, r, false, null);
    return r;
  }

  // post_increment_expression
  //     post_decrement_expression
  private static boolean statement_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_expression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = post_increment_expression(b, l + 1);
    r = r && post_decrement_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // statement_expression [(',' statement_expression) *]
  public static boolean statement_expression_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_expression_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<statement expression list>");
    r = statement_expression(b, l + 1);
    r = r && statement_expression_list_1(b, l + 1);
    exit_section_(b, l, m, STATEMENT_EXPRESSION_LIST, r, false, null);
    return r;
  }

  // [(',' statement_expression) *]
  private static boolean statement_expression_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_expression_list_1")) return false;
    statement_expression_list_1_0(b, l + 1);
    return true;
  }

  // (',' statement_expression) *
  private static boolean statement_expression_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_expression_list_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!statement_expression_list_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statement_expression_list_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' statement_expression
  private static boolean statement_expression_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_expression_list_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && statement_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // statement *
  public static boolean statement_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement_list")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<statement list>");
    int c = current_position_(b);
    while (true) {
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "statement_list", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, STATEMENT_LIST, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // block | ';'
  public static boolean static_constructor_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_constructor_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static constructor body>");
    r = block(b, l + 1);
    if (!r) r = consumeToken(b, ";");
    exit_section_(b, l, m, STATIC_CONSTRUCTOR_BODY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [attributes] static_constructor_modifiers  identifier   '('  ')'  static_constructor_body
  public static boolean static_constructor_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_constructor_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static constructor declaration>");
    r = static_constructor_declaration_0(b, l + 1);
    r = r && static_constructor_modifiers(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, ")");
    r = r && static_constructor_body(b, l + 1);
    exit_section_(b, l, m, STATIC_CONSTRUCTOR_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean static_constructor_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_constructor_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (['extern'] 'static') | ('static' ['extern'])
  public static boolean static_constructor_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_constructor_modifiers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<static constructor modifiers>");
    r = static_constructor_modifiers_0(b, l + 1);
    if (!r) r = static_constructor_modifiers_1(b, l + 1);
    exit_section_(b, l, m, STATIC_CONSTRUCTOR_MODIFIERS, r, false, null);
    return r;
  }

  // ['extern'] 'static'
  private static boolean static_constructor_modifiers_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_constructor_modifiers_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = static_constructor_modifiers_0_0(b, l + 1);
    r = r && consumeToken(b, "static");
    exit_section_(b, m, null, r);
    return r;
  }

  // ['extern']
  private static boolean static_constructor_modifiers_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_constructor_modifiers_0_0")) return false;
    consumeToken(b, "extern");
    return true;
  }

  // 'static' ['extern']
  private static boolean static_constructor_modifiers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_constructor_modifiers_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "static");
    r = r && static_constructor_modifiers_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ['extern']
  private static boolean static_constructor_modifiers_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "static_constructor_modifiers_1_1")) return false;
    consumeToken(b, "extern");
    return true;
  }

  /* ********************************************************** */
  // '{' [struct_member_declarations] '}'
  public static boolean struct_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<struct body>");
    r = consumeToken(b, "{");
    r = r && struct_body_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, STRUCT_BODY, r, false, null);
    return r;
  }

  // [struct_member_declarations]
  private static boolean struct_body_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_body_1")) return false;
    struct_member_declarations(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // [attributes] [struct_modifiers] [partial] 'struct' identifier [type_parameter_list]
  //     [struct_interfaces] [type_parameter_constraints_clauses] struct_body   [';']
  public static boolean struct_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<struct declaration>");
    r = struct_declaration_0(b, l + 1);
    r = r && struct_declaration_1(b, l + 1);
    r = r && struct_declaration_2(b, l + 1);
    r = r && consumeToken(b, "struct");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && struct_declaration_5(b, l + 1);
    r = r && struct_declaration_6(b, l + 1);
    r = r && struct_declaration_7(b, l + 1);
    r = r && struct_body(b, l + 1);
    r = r && struct_declaration_9(b, l + 1);
    exit_section_(b, l, m, STRUCT_DECLARATION, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean struct_declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [struct_modifiers]
  private static boolean struct_declaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_1")) return false;
    struct_modifiers(b, l + 1);
    return true;
  }

  // [partial]
  private static boolean struct_declaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_2")) return false;
    consumeToken(b, PARTIAL);
    return true;
  }

  // [type_parameter_list]
  private static boolean struct_declaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_5")) return false;
    type_parameter_list(b, l + 1);
    return true;
  }

  // [struct_interfaces]
  private static boolean struct_declaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_6")) return false;
    struct_interfaces(b, l + 1);
    return true;
  }

  // [type_parameter_constraints_clauses]
  private static boolean struct_declaration_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_7")) return false;
    type_parameter_constraints_clauses(b, l + 1);
    return true;
  }

  // [';']
  private static boolean struct_declaration_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declaration_9")) return false;
    consumeToken(b, ";");
    return true;
  }

  /* ********************************************************** */
  // ':' interface_type_list
  public static boolean struct_interfaces(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_interfaces")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<struct interfaces>");
    r = consumeToken(b, ":");
    r = r && interface_type_list(b, l + 1);
    exit_section_(b, l, m, STRUCT_INTERFACES, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // constant_declaration |field_declaration |method_declaration|property_declaration |event_declaration|indexer_declaration|operator_declaration|constructor_declaration |static_constructor_declaration |type_declaration
  public static boolean struct_member_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_member_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<struct member declaration>");
    r = constant_declaration(b, l + 1);
    if (!r) r = field_declaration(b, l + 1);
    if (!r) r = method_declaration(b, l + 1);
    if (!r) r = property_declaration(b, l + 1);
    if (!r) r = event_declaration(b, l + 1);
    if (!r) r = indexer_declaration(b, l + 1);
    if (!r) r = operator_declaration(b, l + 1);
    if (!r) r = constructor_declaration(b, l + 1);
    if (!r) r = static_constructor_declaration(b, l + 1);
    if (!r) r = type_declaration(b, l + 1);
    exit_section_(b, l, m, STRUCT_MEMBER_DECLARATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // struct_member_declaration *
  public static boolean struct_member_declarations(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_member_declarations")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<struct member declarations>");
    int c = current_position_(b);
    while (true) {
      if (!struct_member_declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_member_declarations", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, STRUCT_MEMBER_DECLARATIONS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // 'new'|'public'|'protected'|'internal'|'private'
  public static boolean struct_modifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_modifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<struct modifier>");
    r = consumeToken(b, "new");
    if (!r) r = consumeToken(b, "public");
    if (!r) r = consumeToken(b, "protected");
    if (!r) r = consumeToken(b, "internal");
    if (!r) r = consumeToken(b, "private");
    exit_section_(b, l, m, STRUCT_MODIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // struct_modifier*
  public static boolean struct_modifiers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_modifiers")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<struct modifiers>");
    int c = current_position_(b);
    while (true) {
      if (!struct_modifier(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "struct_modifiers", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, STRUCT_MODIFIERS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // '{' [switch_sections] '}'
  public static boolean switch_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<switch block>");
    r = consumeToken(b, "{");
    r = r && switch_block_1(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, l, m, SWITCH_BLOCK, r, false, null);
    return r;
  }

  // [switch_sections]
  private static boolean switch_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_block_1")) return false;
    switch_sections(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ('case' constant_expression ':' ) | ('default' ':' )
  public static boolean switch_label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_label")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<switch label>");
    r = switch_label_0(b, l + 1);
    if (!r) r = switch_label_1(b, l + 1);
    exit_section_(b, l, m, SWITCH_LABEL, r, false, null);
    return r;
  }

  // 'case' constant_expression ':'
  private static boolean switch_label_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_label_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "case");
    r = r && constant_expression(b, l + 1);
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'default' ':'
  private static boolean switch_label_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_label_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "default");
    r = r && consumeToken(b, ":");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // switch_label *
  public static boolean switch_labels(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_labels")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<switch labels>");
    int c = current_position_(b);
    while (true) {
      if (!switch_label(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switch_labels", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, SWITCH_LABELS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // switch_labels statement_list
  public static boolean switch_section(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_section")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<switch section>");
    r = switch_labels(b, l + 1);
    r = r && statement_list(b, l + 1);
    exit_section_(b, l, m, SWITCH_SECTION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // switch_section *
  public static boolean switch_sections(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_sections")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<switch sections>");
    int c = current_position_(b);
    while (true) {
      if (!switch_section(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "switch_sections", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, SWITCH_SECTIONS, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // 'switch' '(' expression ')' switch_block
  public static boolean switch_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switch_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<switch statement>");
    r = consumeToken(b, "switch");
    r = r && consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && switch_block(b, l + 1);
    exit_section_(b, l, m, SWITCH_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'this'
  public static boolean this_access(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "this_access")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<this access>");
    r = consumeToken(b, "this");
    exit_section_(b, l, m, THIS_ACCESS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'throw' [expression] ';'
  public static boolean throw_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throw_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<throw statement>");
    r = consumeToken(b, "throw");
    r = r && throw_statement_1(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, THROW_STATEMENT, r, false, null);
    return r;
  }

  // [expression]
  private static boolean throw_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throw_statement_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ('try' block catch_clauses) | ('try' block finally_clause ) | ('try' block catch_clauses finally_clause )
  public static boolean try_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<try statement>");
    r = try_statement_0(b, l + 1);
    if (!r) r = try_statement_1(b, l + 1);
    if (!r) r = try_statement_2(b, l + 1);
    exit_section_(b, l, m, TRY_STATEMENT, r, false, null);
    return r;
  }

  // 'try' block catch_clauses
  private static boolean try_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "try");
    r = r && block(b, l + 1);
    r = r && catch_clauses(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'try' block finally_clause
  private static boolean try_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "try");
    r = r && block(b, l + 1);
    r = r && finally_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'try' block catch_clauses finally_clause
  private static boolean try_statement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "try_statement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "try");
    r = r && block(b, l + 1);
    r = r && catch_clauses(b, l + 1);
    r = r && finally_clause(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // non_array_type | array_type
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type>");
    r = non_array_type(b, l + 1);
    if (!r) r = array_type(b, l + 1);
    exit_section_(b, l, m, TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type
  public static boolean type_argument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_argument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type argument>");
    r = type(b, l + 1);
    exit_section_(b, l, m, TYPE_ARGUMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<' type_arguments '>'
  public static boolean type_argument_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_argument_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type argument list>");
    r = consumeToken(b, "<");
    r = r && type_arguments(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, l, m, TYPE_ARGUMENT_LIST, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type_argument [( ',' type_argument)*]
  public static boolean type_arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type arguments>");
    r = type_argument(b, l + 1);
    r = r && type_arguments_1(b, l + 1);
    exit_section_(b, l, m, TYPE_ARGUMENTS, r, false, null);
    return r;
  }

  // [( ',' type_argument)*]
  private static boolean type_arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments_1")) return false;
    type_arguments_1_0(b, l + 1);
    return true;
  }

  // ( ',' type_argument)*
  private static boolean type_arguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!type_arguments_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_arguments_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' type_argument
  private static boolean type_arguments_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_arguments_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && type_argument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // class_declaration | struct_declaration | interface_declaration | enum_declaration
  //     | delegate_declaration
  public static boolean type_declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type declaration>");
    r = class_declaration(b, l + 1);
    if (!r) r = struct_declaration(b, l + 1);
    if (!r) r = interface_declaration(b, l + 1);
    if (!r) r = enum_declaration(b, l + 1);
    if (!r) r = delegate_declaration(b, l + 1);
    exit_section_(b, l, m, TYPE_DECLARATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // namespace_or_type_name
  public static boolean type_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_name")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = namespace_or_type_name(b, l + 1);
    exit_section_(b, m, TYPE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // identifier
  public static boolean type_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameter")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, TYPE_PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // primary_constraint |secondary_constraints | constructor_constraint
  //     | (primary_constraint ',' secondary_constraints ) | (primary_constraint ',' constructor_constraint )
  //     | (secondary_constraints','   constructor_constraint )
  //     | (primary_constraint ',' secondary_constraints ',' constructor_constraint)
  public static boolean type_parameter_constraints(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameter_constraints")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type parameter constraints>");
    r = primary_constraint(b, l + 1);
    if (!r) r = secondary_constraints(b, l + 1);
    if (!r) r = constructor_constraint(b, l + 1);
    if (!r) r = type_parameter_constraints_3(b, l + 1);
    if (!r) r = type_parameter_constraints_4(b, l + 1);
    if (!r) r = type_parameter_constraints_5(b, l + 1);
    if (!r) r = type_parameter_constraints_6(b, l + 1);
    exit_section_(b, l, m, TYPE_PARAMETER_CONSTRAINTS, r, false, null);
    return r;
  }

  // primary_constraint ',' secondary_constraints
  private static boolean type_parameter_constraints_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameter_constraints_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_constraint(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && secondary_constraints(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // primary_constraint ',' constructor_constraint
  private static boolean type_parameter_constraints_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameter_constraints_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_constraint(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && constructor_constraint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // secondary_constraints','   constructor_constraint
  private static boolean type_parameter_constraints_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameter_constraints_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = secondary_constraints(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && constructor_constraint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // primary_constraint ',' secondary_constraints ',' constructor_constraint
  private static boolean type_parameter_constraints_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameter_constraints_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = primary_constraint(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && secondary_constraints(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && constructor_constraint(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'where' type_parameter ':' type_parameter_constraints
  public static boolean type_parameter_constraints_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameter_constraints_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type parameter constraints clause>");
    r = consumeToken(b, "where");
    r = r && type_parameter(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && type_parameter_constraints(b, l + 1);
    exit_section_(b, l, m, TYPE_PARAMETER_CONSTRAINTS_CLAUSE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type_parameter_constraints_clause *
  public static boolean type_parameter_constraints_clauses(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameter_constraints_clauses")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<type parameter constraints clauses>");
    int c = current_position_(b);
    while (true) {
      if (!type_parameter_constraints_clause(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_parameter_constraints_clauses", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, TYPE_PARAMETER_CONSTRAINTS_CLAUSES, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // '<' type_parameters '>'
  public static boolean type_parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameter_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type parameter list>");
    r = consumeToken(b, "<");
    r = r && type_parameters(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, l, m, TYPE_PARAMETER_LIST, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ([attributes] type_parameter) [(','([attributes] type_parameter)) *]
  public static boolean type_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type parameters>");
    r = type_parameters_0(b, l + 1);
    r = r && type_parameters_1(b, l + 1);
    exit_section_(b, l, m, TYPE_PARAMETERS, r, false, null);
    return r;
  }

  // [attributes] type_parameter
  private static boolean type_parameters_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_parameters_0_0(b, l + 1);
    r = r && type_parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [attributes]
  private static boolean type_parameters_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters_0_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [(','([attributes] type_parameter)) *]
  private static boolean type_parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters_1")) return false;
    type_parameters_1_0(b, l + 1);
    return true;
  }

  // (','([attributes] type_parameter)) *
  private static boolean type_parameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!type_parameters_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_parameters_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','([attributes] type_parameter)
  private static boolean type_parameters_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && type_parameters_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [attributes] type_parameter
  private static boolean type_parameters_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters_1_0_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_parameters_1_0_0_1_0(b, l + 1);
    r = r && type_parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [attributes]
  private static boolean type_parameters_1_0_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_parameters_1_0_0_1_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // 'typeof' '('   type   ')'
  //     | 'typeof' '(' (identifier [generic_dimension_specifier] | identifier '::' identifier [generic_dimension_specifier]  )+ ')'
  //     | 'typeof' '(' 'void' ')'
  public static boolean typeof_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeof_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<typeof expression>");
    r = typeof_expression_0(b, l + 1);
    if (!r) r = typeof_expression_1(b, l + 1);
    if (!r) r = typeof_expression_2(b, l + 1);
    exit_section_(b, l, m, TYPEOF_EXPRESSION, r, false, null);
    return r;
  }

  // 'typeof' '('   type   ')'
  private static boolean typeof_expression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeof_expression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "typeof");
    r = r && consumeToken(b, "(");
    r = r && type(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'typeof' '(' (identifier [generic_dimension_specifier] | identifier '::' identifier [generic_dimension_specifier]  )+ ')'
  private static boolean typeof_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeof_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "typeof");
    r = r && consumeToken(b, "(");
    r = r && typeof_expression_1_2(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // (identifier [generic_dimension_specifier] | identifier '::' identifier [generic_dimension_specifier]  )+
  private static boolean typeof_expression_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeof_expression_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeof_expression_1_2_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!typeof_expression_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeof_expression_1_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier [generic_dimension_specifier] | identifier '::' identifier [generic_dimension_specifier]
  private static boolean typeof_expression_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeof_expression_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeof_expression_1_2_0_0(b, l + 1);
    if (!r) r = typeof_expression_1_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // identifier [generic_dimension_specifier]
  private static boolean typeof_expression_1_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeof_expression_1_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && typeof_expression_1_2_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [generic_dimension_specifier]
  private static boolean typeof_expression_1_2_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeof_expression_1_2_0_0_1")) return false;
    generic_dimension_specifier(b, l + 1);
    return true;
  }

  // identifier '::' identifier [generic_dimension_specifier]
  private static boolean typeof_expression_1_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeof_expression_1_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "::");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && typeof_expression_1_2_0_1_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [generic_dimension_specifier]
  private static boolean typeof_expression_1_2_0_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeof_expression_1_2_0_1_3")) return false;
    generic_dimension_specifier(b, l + 1);
    return true;
  }

  // 'typeof' '(' 'void' ')'
  private static boolean typeof_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeof_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "typeof");
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, "void");
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // primary_expression | ( '+' unary_expression ) | ( '_'   unary_expression )
  //     | ( '!'   unary_expression )| ( '~'   unary_expression )
  //     | pre_increment_expression | pre_decrement_expression | cast_expression
  public static boolean unary_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<unary expression>");
    r = primary_expression(b, l + 1);
    if (!r) r = unary_expression_1(b, l + 1);
    if (!r) r = unary_expression_2(b, l + 1);
    if (!r) r = unary_expression_3(b, l + 1);
    if (!r) r = unary_expression_4(b, l + 1);
    if (!r) r = pre_increment_expression(b, l + 1);
    if (!r) r = pre_decrement_expression(b, l + 1);
    if (!r) r = cast_expression(b, l + 1);
    exit_section_(b, l, m, UNARY_EXPRESSION, r, false, null);
    return r;
  }

  // '+' unary_expression
  private static boolean unary_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "+");
    r = r && unary_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '_'   unary_expression
  private static boolean unary_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "_");
    r = r && unary_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '!'   unary_expression
  private static boolean unary_expression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "!");
    r = r && unary_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '~'   unary_expression
  private static boolean unary_expression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_expression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "~");
    r = r && unary_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type 'operator' overloadable_unary_operator '(' type identifier ')'
  public static boolean unary_operator_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_operator_declarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<unary operator declarator>");
    r = type(b, l + 1);
    r = r && consumeToken(b, "operator");
    r = r && overloadable_unary_operator(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, UNARY_OPERATOR_DECLARATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'unchecked' '(' expression ')'
  public static boolean unchecked_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unchecked_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<unchecked expression>");
    r = consumeToken(b, "unchecked");
    r = r && consumeToken(b, "(");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, UNCHECKED_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'unchecked' block
  public static boolean unchecked_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unchecked_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<unchecked statement>");
    r = consumeToken(b, "unchecked");
    r = r && block(b, l + 1);
    exit_section_(b, l, m, UNCHECKED_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'using' identifier '=' namespace_or_type_name ';'
  public static boolean using_alias_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_alias_directive")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<using alias directive>");
    r = consumeToken(b, "using");
    r = r && consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && namespace_or_type_name(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, USING_ALIAS_DIRECTIVE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // using_alias_directive | using_namespace_directive
  public static boolean using_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_directive")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<using directive>");
    r = using_alias_directive(b, l + 1);
    if (!r) r = using_namespace_directive(b, l + 1);
    exit_section_(b, l, m, USING_DIRECTIVE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // using_directive*
  public static boolean using_directives(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_directives")) return false;
    Marker m = enter_section_(b, l, _NONE_, "<using directives>");
    int c = current_position_(b);
    while (true) {
      if (!using_directive(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "using_directives", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, USING_DIRECTIVES, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // 'using' namespace_or_type_name ';'
  public static boolean using_namespace_directive(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_namespace_directive")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<using namespace directive>");
    r = consumeToken(b, "using");
    r = r && namespace_or_type_name(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, USING_NAMESPACE_DIRECTIVE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'using' '(' resource_acquisition ')' embedded_statement
  public static boolean using_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "using_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<using statement>");
    r = consumeToken(b, "using");
    r = r && consumeToken(b, "(");
    r = r && resource_acquisition(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && embedded_statement(b, l + 1);
    exit_section_(b, l, m, USING_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // identifier '=' variable_initializer
  public static boolean variable_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declarator")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && consumeToken(b, "=");
    r = r && variable_initializer(b, l + 1);
    exit_section_(b, m, VARIABLE_DECLARATOR, r);
    return r;
  }

  /* ********************************************************** */
  // variable_declarator (','  variable_declarator) *
  public static boolean variable_declarators(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declarators")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = variable_declarator(b, l + 1);
    r = r && variable_declarators_1(b, l + 1);
    exit_section_(b, m, VARIABLE_DECLARATORS, r);
    return r;
  }

  // (','  variable_declarator) *
  private static boolean variable_declarators_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declarators_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!variable_declarators_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variable_declarators_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ','  variable_declarator
  private static boolean variable_declarators_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_declarators_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && variable_declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression | array_initializer
  public static boolean variable_initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<variable initializer>");
    r = expression(b, l + 1);
    if (!r) r = array_initializer(b, l + 1);
    exit_section_(b, l, m, VARIABLE_INITIALIZER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // variable_initializer  [(',' variable_initializer)*]
  public static boolean variable_initializer_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_initializer_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<variable initializer list>");
    r = variable_initializer(b, l + 1);
    r = r && variable_initializer_list_1(b, l + 1);
    exit_section_(b, l, m, VARIABLE_INITIALIZER_LIST, r, false, null);
    return r;
  }

  // [(',' variable_initializer)*]
  private static boolean variable_initializer_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_initializer_list_1")) return false;
    variable_initializer_list_1_0(b, l + 1);
    return true;
  }

  // (',' variable_initializer)*
  private static boolean variable_initializer_list_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_initializer_list_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!variable_initializer_list_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variable_initializer_list_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' variable_initializer
  private static boolean variable_initializer_list_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_initializer_list_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && variable_initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression
  public static boolean variable_reference(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variable_reference")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<variable reference>");
    r = expression(b, l + 1);
    exit_section_(b, l, m, VARIABLE_REFERENCE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'in' | 'out'
  public static boolean variance_annotation(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variance_annotation")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<variance annotation>");
    r = consumeToken(b, "in");
    if (!r) r = consumeToken(b, "out");
    exit_section_(b, l, m, VARIANCE_ANNOTATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [attributes] [variance_annotation]  type_parameter
  public static boolean variant_type_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_type_parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<variant type parameter>");
    r = variant_type_parameter_0(b, l + 1);
    r = r && variant_type_parameter_1(b, l + 1);
    r = r && type_parameter(b, l + 1);
    exit_section_(b, l, m, VARIANT_TYPE_PARAMETER, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean variant_type_parameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_type_parameter_0")) return false;
    attributes(b, l + 1);
    return true;
  }

  // [variance_annotation]
  private static boolean variant_type_parameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_type_parameter_1")) return false;
    variance_annotation(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // '<' variant_type_parameters   '>'
  public static boolean variant_type_parameter_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_type_parameter_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<variant type parameter list>");
    r = consumeToken(b, "<");
    r = r && variant_type_parameters(b, l + 1);
    r = r && consumeToken(b, ">");
    exit_section_(b, l, m, VARIANT_TYPE_PARAMETER_LIST, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // variant_type_parameter [(',' variant_type_parameter)*]
  public static boolean variant_type_parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_type_parameters")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<variant type parameters>");
    r = variant_type_parameter(b, l + 1);
    r = r && variant_type_parameters_1(b, l + 1);
    exit_section_(b, l, m, VARIANT_TYPE_PARAMETERS, r, false, null);
    return r;
  }

  // [(',' variant_type_parameter)*]
  private static boolean variant_type_parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_type_parameters_1")) return false;
    variant_type_parameters_1_0(b, l + 1);
    return true;
  }

  // (',' variant_type_parameter)*
  private static boolean variant_type_parameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_type_parameters_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!variant_type_parameters_1_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variant_type_parameters_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // ',' variant_type_parameter
  private static boolean variant_type_parameters_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variant_type_parameters_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ",");
    r = r && variant_type_parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'where' boolean_expression
  public static boolean where_clause(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "where_clause")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<where clause>");
    r = consumeToken(b, "where");
    r = r && boolean_expression(b, l + 1);
    exit_section_(b, l, m, WHERE_CLAUSE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'while' '(' boolean_expression ')' embedded_statement
  public static boolean while_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<while statement>");
    r = consumeToken(b, "while");
    r = r && consumeToken(b, "(");
    r = r && boolean_expression(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && embedded_statement(b, l + 1);
    exit_section_(b, l, m, WHILE_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ('yield' 'return' expression ';') | ('yield' 'break' ';')
  public static boolean yield_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<yield statement>");
    r = yield_statement_0(b, l + 1);
    if (!r) r = yield_statement_1(b, l + 1);
    exit_section_(b, l, m, YIELD_STATEMENT, r, false, null);
    return r;
  }

  // 'yield' 'return' expression ';'
  private static boolean yield_statement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_statement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "yield");
    r = r && consumeToken(b, "return");
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'yield' 'break' ';'
  private static boolean yield_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "yield_statement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "yield");
    r = r && consumeToken(b, "break");
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

}
