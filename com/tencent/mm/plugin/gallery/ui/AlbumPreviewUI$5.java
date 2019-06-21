package com.tencent.mm.plugin.gallery.ui;

import android.os.Process;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.GridView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class AlbumPreviewUI$5
  implements AbsListView.OnScrollListener
{
  private Runnable kvR;

  AlbumPreviewUI$5(AlbumPreviewUI paramAlbumPreviewUI)
  {
    AppMethodBeat.i(21393);
    this.kvR = new AlbumPreviewUI.5.1(this);
    AppMethodBeat.o(21393);
  }

  private String bCC()
  {
    AppMethodBeat.i(21394);
    String str = AlbumPreviewUI.a(this.mPO).wt(AlbumPreviewUI.D(this.mPO).getFirstVisiblePosition());
    if ((!bo.isNullOrNil(str)) && (str.equals("album_business_bubble_media_by_coordinate")))
    {
      str = AlbumPreviewUI.E(this.mPO) + "附近的照片和视频";
      AppMethodBeat.o(21394);
    }
    while (true)
    {
      return str;
      AppMethodBeat.o(21394);
    }
  }

  private void hD(boolean paramBoolean)
  {
    AppMethodBeat.i(21395);
    if (paramBoolean)
    {
      AlbumPreviewUI.C(this.mPO).removeCallbacks(this.kvR);
      if (AlbumPreviewUI.C(this.mPO).getVisibility() == 0)
        break label153;
      AlbumPreviewUI.D(this.mPO).getFirstVisiblePosition();
      Object localObject = bCC();
      AlbumPreviewUI.C(this.mPO).setText((CharSequence)localObject);
      AlbumPreviewUI.C(this.mPO).clearAnimation();
      localObject = AnimationUtils.loadAnimation(this.mPO.mController.ylL, 2131034180);
      AlbumPreviewUI.C(this.mPO).setVisibility(0);
      AlbumPreviewUI.C(this.mPO).startAnimation((Animation)localObject);
      AppMethodBeat.o(21395);
    }
    while (true)
    {
      return;
      AlbumPreviewUI.C(this.mPO).removeCallbacks(this.kvR);
      AlbumPreviewUI.C(this.mPO).postDelayed(this.kvR, 256L);
      label153: AppMethodBeat.o(21395);
    }
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(21397);
    paramAbsListView = bCC();
    AlbumPreviewUI.C(this.mPO).setText(paramAbsListView);
    AppMethodBeat.o(21397);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(21396);
    ab.d("MicroMsg.AlbumPreviewUI", "scroll state[%d]", new Object[] { Integer.valueOf(paramInt) });
    if (1 == paramInt)
    {
      hD(true);
      AlbumPreviewUI.F(this.mPO).setVisibility(8);
    }
    while (true)
    {
      if (2 == paramInt)
      {
        WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcAlbumScrollEnable, AlbumPreviewUI.G(this.mPO));
        paramAbsListView = this.mPO;
        boolean bool = WXHardCoderJNI.hcAlbumScrollEnable;
        int j = WXHardCoderJNI.hcAlbumScrollDelay;
        int k = WXHardCoderJNI.hcAlbumScrollCPU;
        int m = WXHardCoderJNI.hcAlbumScrollIO;
        paramInt = i;
        if (WXHardCoderJNI.hcAlbumScrollThr)
          paramInt = Process.myTid();
        AlbumPreviewUI.c(paramAbsListView, WXHardCoderJNI.startPerformance(bool, j, k, m, paramInt, WXHardCoderJNI.hcAlbumScrollTimeout, 702, WXHardCoderJNI.hcAlbumScrollAction, "MicroMsg.AlbumPreviewUI"));
      }
      AppMethodBeat.o(21396);
      return;
      if (paramInt == 0)
        hD(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.5
 * JD-Core Version:    0.6.2
 */