package com.tencent.mm.plugin.story.ui;

import a.l;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.plugin.sns.ui.aq;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.ui.base.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class StorySettingsUI$o
  implements View.OnClickListener
{
  StorySettingsUI$o(StorySettingsUI paramStorySettingsUI)
  {
  }

  public final void onClick(View paramView)
  {
    int i = 0;
    AppMethodBeat.i(110063);
    switch (aq.ruz)
    {
    default:
      boolean bool = CdnLogic.getSnsImagePrivateProtocolAvalible();
      if (1 == g.Nu().getInt("SnsGroupImageDownloadSwitch", 0))
        i = 1;
      if (((bool) && (i != 0)) || (((!f.IS_FLAVOR_RED) && (!f.DEBUG)) || ((-1 == aq.ruz) || (1 == aq.ruA))))
      {
        h.J((Context)this.sfc.dxU(), "套图下载", "");
        AppMethodBeat.o(110063);
      }
      break;
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      h.J((Context)this.sfc.dxU(), "套图下载", "");
      AppMethodBeat.o(110063);
      continue;
      h.J((Context)this.sfc.dxU(), "单图下载", "");
      AppMethodBeat.o(110063);
      continue;
      h.J((Context)this.sfc.dxU(), "单图下载", "");
      AppMethodBeat.o(110063);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StorySettingsUI.o
 * JD-Core Version:    0.6.2
 */