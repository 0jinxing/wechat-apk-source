package com.google.android.gms.stats.internal;

import com.google.android.gms.common.config.GservicesValue;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.TimeUnit;

public final class G
{
  public static final class netStats
  {
    public static final GservicesValue<Long> dataSourcePollIntervalMillis;
    public static final GservicesValue<Boolean> enabled;
    public static final GservicesValue<Long> recordIntervalSecs;

    static
    {
      AppMethodBeat.i(113977);
      enabled = GservicesValue.value("gms:stats:netstats:enabled", true);
      recordIntervalSecs = GservicesValue.value("gms:stats:netstats:record_interval_secs", Long.valueOf(TimeUnit.DAYS.toSeconds(1L)));
      dataSourcePollIntervalMillis = GservicesValue.value("gms:stats:netstats:data_source_poll_millis", Long.valueOf(TimeUnit.MINUTES.toMillis(30L)));
      AppMethodBeat.o(113977);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.stats.internal.G
 * JD-Core Version:    0.6.2
 */