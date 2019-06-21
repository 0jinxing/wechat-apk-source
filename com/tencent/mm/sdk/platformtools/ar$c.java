package com.tencent.mm.sdk.platformtools;

import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

final class ar$c
{
  public Set<SharedPreferences.OnSharedPreferenceChangeListener> epg;
  public boolean xAi;
  public List<String> xAj;
  public Map<String, Object> xAk;
  public final CountDownLatch xAl;
  public volatile boolean xAm;

  private ar$c()
  {
    AppMethodBeat.i(93439);
    this.xAi = false;
    this.xAj = null;
    this.epg = null;
    this.xAk = null;
    this.xAl = new CountDownLatch(1);
    this.xAm = false;
    AppMethodBeat.o(93439);
  }

  public final void pj(boolean paramBoolean)
  {
    AppMethodBeat.i(93440);
    this.xAm = paramBoolean;
    this.xAl.countDown();
    AppMethodBeat.o(93440);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ar.c
 * JD-Core Version:    0.6.2
 */