package com.tencent.mm.plugin.brandservice.ui.timeline.video.a;

import a.f.b.j;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.r;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.BizVideoDetailUI;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.b;
import com.tencent.mm.protocal.protobuf.jz;
import com.tencent.mm.ui.widget.a.d;
import java.lang.ref.WeakReference;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/util/MpMenuHelper;", "", "()V", "MENU_ID_CANCEL_HAO_KAN", "", "MENU_ID_COPY_LINK", "MENU_ID_EXPOSE", "MENU_ID_FAV", "MENU_ID_HAO_KAN", "MENU_ID_SEND_TO_FRIEND", "MENU_ID_SHARE_TO_TIMELINE", "MENU_ID_SHOW_BIZ", "TAG", "", "appMsgStat", "Lcom/tencent/mm/protocal/protobuf/BizAppMsgStat;", "controller", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoController;", "mmBottomSheet", "Lcom/tencent/mm/ui/widget/dialog/MMBottomSheet;", "msgInfo", "Lcom/tencent/mm/message/MPMsgInfo;", "ui", "Ljava/lang/ref/WeakReference;", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoDetailUI;", "getUi$plugin_brandservice_release", "()Ljava/lang/ref/WeakReference;", "setUi$plugin_brandservice_release", "(Ljava/lang/ref/WeakReference;)V", "context", "copyLink", "", "doExpose", "fav", "goProfile", "hasShowMenuPermission", "", "id", "init", "isFinished", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "setAppMsgStat", "shareToTimeline", "shouldDisableMenuItem", "showMenu", "plugin-brandservice_release"})
public final class g
{
  public final String TAG = "MicroMsg.MpMenuHelper";
  public WeakReference<BizVideoDetailUI> hiC;
  public d iHZ;
  public r jVG;
  public b jWx;
  public jz jXv;
  final int jYN;
  final int jYO = 1;
  final int jYP = 2;
  final int jYQ = 3;
  final int jYR = 4;
  final int jYS = 5;
  final int jYT = 6;
  final int jYU = 7;

  public final BizVideoDetailUI aYo()
  {
    AppMethodBeat.i(15340);
    Object localObject = this.hiC;
    if (localObject == null)
      j.avw("ui");
    if (((WeakReference)localObject).get() == null)
    {
      localObject = null;
      AppMethodBeat.o(15340);
    }
    while (true)
    {
      return localObject;
      localObject = this.hiC;
      if (localObject == null)
        j.avw("ui");
      localObject = ((WeakReference)localObject).get();
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.video.BizVideoDetailUI");
        AppMethodBeat.o(15340);
        throw ((Throwable)localObject);
      }
      localObject = (BizVideoDetailUI)localObject;
      AppMethodBeat.o(15340);
    }
  }

  public final boolean isFinished()
  {
    AppMethodBeat.i(15341);
    Object localObject = this.hiC;
    if (localObject == null)
      j.avw("ui");
    boolean bool;
    if (((WeakReference)localObject).get() != null)
    {
      localObject = this.hiC;
      if (localObject == null)
        j.avw("ui");
      localObject = ((WeakReference)localObject).get();
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.video.BizVideoDetailUI");
        AppMethodBeat.o(15341);
        throw ((Throwable)localObject);
      }
      if (!((BizVideoDetailUI)localObject).isFinishing());
    }
    else
    {
      bool = true;
      AppMethodBeat.o(15341);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(15341);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.a.g
 * JD-Core Version:    0.6.2
 */