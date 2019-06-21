package com.tencent.mm.plugin.topstory.ui.video;

import android.graphics.Point;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.am;
import android.view.View;
import com.tencent.mm.protocal.protobuf.bzs;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.ui.MMActivity;
import java.util.List;

public abstract interface b
{
  public abstract boolean DX();

  public abstract boolean FC(int paramInt);

  public abstract void FD(int paramInt);

  public abstract void FE(int paramInt);

  public abstract void a(bzs parambzs);

  public abstract void a(chw paramchw);

  public abstract void abH(String paramString);

  public abstract void abI(String paramString);

  public abstract void ad(View paramView, int paramInt);

  public abstract MMActivity bKU();

  public abstract void cFN();

  public abstract void cFO();

  public abstract l cFQ();

  public abstract o cFR();

  public abstract String cFS();

  public abstract chv cFT();

  public abstract m cFU();

  public abstract r cFV();

  public abstract Point cFW();

  public abstract am cFX();

  public abstract int cFY();

  public abstract boolean cFZ();

  public abstract e cGa();

  public abstract boolean cGb();

  public abstract void cGc();

  public abstract int cGd();

  public abstract void cGe();

  public abstract void cGf();

  public abstract n cGg();

  public abstract String cGh();

  public abstract int cGi();

  public abstract void cGj();

  public abstract int cGk();

  public abstract boolean fS(int paramInt1, int paramInt2);

  public abstract RecyclerView.i getLayoutManager();

  public abstract RecyclerView getRecyclerView();

  public abstract int getVideoHeight();

  public abstract int getVideoWidth();

  public abstract void i(List<chw> paramList, boolean paramBoolean);

  public abstract boolean isFullscreenMode();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.b
 * JD-Core Version:    0.6.2
 */