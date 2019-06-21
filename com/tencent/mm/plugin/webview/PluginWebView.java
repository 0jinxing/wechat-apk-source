package com.tencent.mm.plugin.webview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cj.c;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.model.q;
import com.tencent.mm.ui.widget.MMWebView;

public class PluginWebView extends f
{
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(5615);
    if ((paramg.SG()) || (paramg.lQ(":tools")) || (paramg.lQ(":toolsmp")))
      pin(new q(com.tencent.mm.plugin.webview.modeltools.g.class));
    AppMethodBeat.o(5615);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(5614);
    if ((!paramg.SG()) && (!paramg.lQ(":tools")))
      paramg.lQ(":toolsmp");
    if (paramg.lQ(":toolsmp"))
    {
      paramg = new PluginWebView.1(this);
      c.a(MMWebView.zNq, paramg);
    }
    AppMethodBeat.o(5614);
  }

  public String name()
  {
    return "plugin-webview";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.PluginWebView
 * JD-Core Version:    0.6.2
 */