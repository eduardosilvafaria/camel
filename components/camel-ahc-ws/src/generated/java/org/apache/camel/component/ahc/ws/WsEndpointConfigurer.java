/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ahc.ws;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.ahc.AhcEndpointConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class WsEndpointConfigurer extends AhcEndpointConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        WsEndpoint target = (WsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "sendmessageonerror":
        case "sendMessageOnError": target.setSendMessageOnError(property(camelContext, boolean.class, value)); return true;
        case "usestreaming":
        case "useStreaming": target.setUseStreaming(property(camelContext, boolean.class, value)); return true;
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "sendmessageonerror":
        case "sendMessageOnError": return boolean.class;
        case "usestreaming":
        case "useStreaming": return boolean.class;
        default: return super.getOptionType(name, ignoreCase);
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        WsEndpoint target = (WsEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "sendmessageonerror":
        case "sendMessageOnError": return target.isSendMessageOnError();
        case "usestreaming":
        case "useStreaming": return target.isUseStreaming();
        default: return super.getOptionValue(obj, name, ignoreCase);
        }
    }
}

