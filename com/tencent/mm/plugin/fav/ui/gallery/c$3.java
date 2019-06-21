package com.tencent.mm.plugin.fav.ui.gallery;

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

final class c$3 extends RecyclerView.m
{
  private Runnable kvR;

  c$3(c paramc)
  {
    AppMethodBeat.i(74543);
    this.kvR = new c.3.1(this);
    AppMethodBeat.o(74543);
  }

  private void fQ(boolean paramBoolean)
  {
    AppMethodBeat.i(74544);
    if (paramBoolean)
    {
      this.mnT.mnJ.removeCallbacks(this.kvR);
      if (this.mnT.mnJ.getVisibility() == 0)
        break label121;
      this.mnT.mnJ.clearAnimation();
      Animation localAnimation = AnimationUtils.loadAnimation(this.mnT.czX, 2131034180);
      this.mnT.mnJ.setVisibility(0);
      this.mnT.mnJ.startAnimation(localAnimation);
      AppMethodBeat.o(74544);
    }
    while (true)
    {
      return;
      this.mnT.mnJ.removeCallbacks(this.kvR);
      this.mnT.mnJ.postDelayed(this.kvR, 256L);
      label121: AppMethodBeat.o(74544);
    }
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(74545);
    super.a(paramRecyclerView, paramInt1, paramInt2);
    Object localObject = (LinearLayoutManager)this.mnT.mnI.bfC();
    paramRecyclerView = (f)this.mnT.mnI.bwx();
    localObject = paramRecyclerView.vG(((LinearLayoutManager)localObject).iQ());
    if (localObject == null)
      AppMethodBeat.o(74545);
    while (true)
    {
      return;
      paramRecyclerView = paramRecyclerView.ha(((f.c)localObject).timeStamp);
      this.mnT.mnJ.setText(bo.bc(paramRecyclerView, ""));
      AppMethodBeat.o(74545);
    }
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(74546);
    int m;
    if (1 == paramInt)
    {
      fQ(true);
      WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcMediaGalleryScrollEnable, this.mnT.ehv);
      c localc = this.mnT;
      boolean bool = WXHardCoderJNI.hcMediaGalleryScrollEnable;
      int i = WXHardCoderJNI.hcMediaGalleryScrollDelay;
      int j = WXHardCoderJNI.hcMediaGalleryScrollCPU;
      int k = WXHardCoderJNI.hcMediaGalleryScrollIO;
      if (WXHardCoderJNI.hcMediaGalleryScrollThr)
      {
        m = Process.myTid();
        localc.ehv = WXHardCoderJNI.startPerformance(bool, i, j, k, m, WXHardCoderJNI.hcMediaGalleryScrollTimeout, 703, WXHardCoderJNI.hcMediaGalleryScrollAction, "MicroMsg.MediaHistoryGalleryUI");
      }
    }
    while (true)
    {
      if ((paramRecyclerView.getLayoutManager() instanceof LinearLayoutManager))
      {
        if ((((LinearLayoutManager)paramRecyclerView.getLayoutManager()).iQ() == 0) && (!this.mnT.kvO))
          this.mnT.mnI.s(false, -1);
        this.mnT.kvO = false;
        o.ahp().cm(paramInt);
      }
      AppMethodBeat.o(74546);
      return;
      m = 0;
      break;
      if (paramInt == 0)
        fQ(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.c.3
 * JD-Core Version:    0.6.2
 */