package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.f;

public final class e
{
  private f udN;

  public e(f paramf)
  {
    this.udN = paramf;
  }

  public final void ai(Bundle paramBundle)
  {
    AppMethodBeat.i(8628);
    paramBundle = (String)paramBundle.get("widgetId");
    this.udN.adD(paramBundle);
    AppMethodBeat.o(8628);
  }

  public final void aj(Bundle paramBundle)
  {
    AppMethodBeat.i(8629);
    paramBundle = paramBundle.getString("fts_key_widget_view_cache_key");
    this.udN.adE(paramBundle);
    AppMethodBeat.o(8629);
  }

  public final void ak(Bundle paramBundle)
  {
    AppMethodBeat.i(8630);
    String str = paramBundle.getString("fts_key_json_data");
    paramBundle = paramBundle.getString("fts_key_widget_view_cache_key");
    this.udN.gR(str, paramBundle);
    AppMethodBeat.o(8630);
  }

  public final void al(Bundle paramBundle)
  {
    AppMethodBeat.i(8632);
    int i = paramBundle.getInt("x", -1);
    int j = paramBundle.getInt("y", -1);
    String str = paramBundle.getString("widgetId");
    paramBundle = paramBundle.getString("eventId");
    this.udN.f(i, j, str, paramBundle);
    AppMethodBeat.o(8632);
  }

  public final void b(Bundle paramBundle, int paramInt)
  {
    AppMethodBeat.i(8627);
    String str1 = paramBundle.getString("fts_key_json_data");
    String str2 = paramBundle.getString("fts_key_widget_view_cache_key");
    this.udN.m(str1, str2, paramBundle.getInt("websearch_is_test_draw_json"), paramInt);
    AppMethodBeat.o(8627);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(8631);
    this.udN.onDestroy();
    AppMethodBeat.o(8631);
  }

  public final void onPause()
  {
    AppMethodBeat.i(8626);
    this.udN.onPause();
    AppMethodBeat.o(8626);
  }

  public final void onResume()
  {
    AppMethodBeat.i(8625);
    this.udN.onResume();
    AppMethodBeat.o(8625);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.e
 * JD-Core Version:    0.6.2
 */