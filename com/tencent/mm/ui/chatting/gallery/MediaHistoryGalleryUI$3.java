package com.tencent.mm.ui.chatting.gallery;

import android.os.Process;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.m;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.o;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.chatting.a.b;
import com.tencent.mm.ui.chatting.a.b.c;
import com.tencent.mm.ui.chatting.e.a.a;
import com.tencent.mm.ui.q;

final class MediaHistoryGalleryUI$3 extends RecyclerView.m
{
  private Runnable kvR;

  MediaHistoryGalleryUI$3(MediaHistoryGalleryUI paramMediaHistoryGalleryUI)
  {
    AppMethodBeat.i(32408);
    this.kvR = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(32407);
        Animation localAnimation = AnimationUtils.loadAnimation(MediaHistoryGalleryUI.3.this.yXS.mController.ylL, 2131034181);
        MediaHistoryGalleryUI.b(MediaHistoryGalleryUI.3.this.yXS).startAnimation(localAnimation);
        MediaHistoryGalleryUI.b(MediaHistoryGalleryUI.3.this.yXS).setVisibility(8);
        AppMethodBeat.o(32407);
      }
    };
    AppMethodBeat.o(32408);
  }

  private void fQ(boolean paramBoolean)
  {
    AppMethodBeat.i(32409);
    if (paramBoolean)
    {
      MediaHistoryGalleryUI.b(this.yXS).removeCallbacks(this.kvR);
      if (MediaHistoryGalleryUI.b(this.yXS).getVisibility() == 0)
        break label126;
      MediaHistoryGalleryUI.b(this.yXS).clearAnimation();
      Animation localAnimation = AnimationUtils.loadAnimation(this.yXS.mController.ylL, 2131034180);
      MediaHistoryGalleryUI.b(this.yXS).setVisibility(0);
      MediaHistoryGalleryUI.b(this.yXS).startAnimation(localAnimation);
      AppMethodBeat.o(32409);
    }
    while (true)
    {
      return;
      MediaHistoryGalleryUI.b(this.yXS).removeCallbacks(this.kvR);
      MediaHistoryGalleryUI.b(this.yXS).postDelayed(this.kvR, 256L);
      label126: AppMethodBeat.o(32409);
    }
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(32410);
    super.a(paramRecyclerView, paramInt1, paramInt2);
    Object localObject = (LinearLayoutManager)MediaHistoryGalleryUI.c(this.yXS).bfC();
    paramRecyclerView = (b)MediaHistoryGalleryUI.c(this.yXS).bwx();
    localObject = paramRecyclerView.Ox(((LinearLayoutManager)localObject).iQ());
    if (localObject == null)
      AppMethodBeat.o(32410);
    while (true)
    {
      return;
      paramRecyclerView = paramRecyclerView.ha(((b.c)localObject).timeStamp);
      MediaHistoryGalleryUI.b(this.yXS).setText(bo.bc(paramRecyclerView, ""));
      AppMethodBeat.o(32410);
    }
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(32411);
    int m;
    if (1 == paramInt)
    {
      fQ(true);
      WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcMediaGalleryScrollEnable, MediaHistoryGalleryUI.d(this.yXS));
      MediaHistoryGalleryUI localMediaHistoryGalleryUI = this.yXS;
      boolean bool = WXHardCoderJNI.hcMediaGalleryScrollEnable;
      int i = WXHardCoderJNI.hcMediaGalleryScrollDelay;
      int j = WXHardCoderJNI.hcMediaGalleryScrollCPU;
      int k = WXHardCoderJNI.hcMediaGalleryScrollIO;
      if (WXHardCoderJNI.hcMediaGalleryScrollThr)
      {
        m = Process.myTid();
        MediaHistoryGalleryUI.a(localMediaHistoryGalleryUI, WXHardCoderJNI.startPerformance(bool, i, j, k, m, WXHardCoderJNI.hcMediaGalleryScrollTimeout, 703, WXHardCoderJNI.hcMediaGalleryScrollAction, "MicroMsg.MediaHistoryGalleryUI"));
      }
    }
    while (true)
    {
      if ((paramRecyclerView.getLayoutManager() instanceof LinearLayoutManager))
      {
        if ((((LinearLayoutManager)paramRecyclerView.getLayoutManager()).iQ() == 0) && (!MediaHistoryGalleryUI.e(this.yXS)) && (MediaHistoryGalleryUI.c(this.yXS) != null))
          MediaHistoryGalleryUI.c(this.yXS).s(false, -1);
        MediaHistoryGalleryUI.f(this.yXS);
        o.ahp().cm(paramInt);
      }
      AppMethodBeat.o(32411);
      return;
      m = 0;
      break;
      if (paramInt == 0)
        fQ(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.MediaHistoryGalleryUI.3
 * JD-Core Version:    0.6.2
 */