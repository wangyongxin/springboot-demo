/*
package com.example.demo;
import io.sentry.CustomSamplingContext;
import io.sentry.SentryOptions.TracesSamplerCallback;
import io.sentry.SamplingContext;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

@Component
class CustomTracesSamplerCallback implements TracesSamplerCallback {
    @Override
    public Double sample(SamplingContext context) {
        CustomSamplingContext customSamplingContext = context.getCustomSamplingContext();
        if (customSamplingContext != null) {
            HttpServletRequest request = (HttpServletRequest) customSamplingContext.get("request");
            // return a number between 0 and 1 or null (to fallback to configured value)
        } else {
            // return a number between 0 and 1 or null (to fallback to configured value)
        }
        return 1.0;
    }
}*/
