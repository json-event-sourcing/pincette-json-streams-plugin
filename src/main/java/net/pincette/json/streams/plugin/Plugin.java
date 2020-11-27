package net.pincette.json.streams.plugin;

import com.schibsted.spt.data.jslt.Function;
import java.util.Collection;
import java.util.Map;
import net.pincette.mongo.Operator;
import net.pincette.mongo.QueryOperator;
import net.pincette.mongo.streams.Stage;

/**
 * Implement this interface in a module if you want to add extensions to the JSON Streams runtime.
 *
 * @author Werner Donn\u00e9
 */
public interface Plugin {
  /** @return The MongoDB expression language operators. It may be <code>null</code>. */
  Map<String, Operator> expressionExtensions();

  /** @return The JSLT custom functions. It may be <code>null</code>. */
  Collection<Function> jsltFunctions();

  /** @return The MongoDB query language operators. It may be <code>null</code>. */
  Map<String, QueryOperator> matchExtensions();

  /** @return The MongoDB aggregation pipeline stages. It may be <code>null</code>. */
  Map<String, Stage> stageExtensions();
}
