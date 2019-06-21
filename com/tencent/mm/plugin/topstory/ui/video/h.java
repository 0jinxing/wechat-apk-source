package com.tencent.mm.plugin.topstory.ui.video;

import android.content.Context;
import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.a.d;

public abstract class h extends RecyclerView.v
  implements a
{
  protected View.OnClickListener pLd = new h.1(this);
  public chw sAX;
  public b sDN;
  private boolean sDO;

  public h(View paramView, b paramb)
  {
    super(paramView);
    this.sDN = paramb;
    ej(paramView);
  }

  protected final void a(b paramb, Context paramContext, f paramf, int paramInt)
  {
    chw localchw = paramb.cGg().FL(paramInt);
    ((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getReporter().a(paramb.cFT(), localchw, paramInt, 5, "");
    if (localchw != null)
    {
      if (this.sDN.cFV().cGZ())
      {
        this.sDN.cFV().cpN();
        this.sDO = true;
      }
      d locald = new d(paramContext, 1, false);
      locald.rBl = new h.2(this);
      locald.rBm = new h.3(this, paramf, paramContext, localchw, paramb, paramInt);
      locald.zQf = new h.4(this);
      locald.cpD();
    }
  }

  public final void c(chw paramchw)
  {
    this.sAX = paramchw;
    ab.i("MicroMsg.TopStory.TopStoryBaseVideoHolder", "onBindItemHolder %s", new Object[] { paramchw.title });
    cGz();
  }

  public void cFN()
  {
    this.sDN.cFN();
  }

  public void cFO()
  {
    this.sDN.cFO();
  }

  public int cFP()
  {
    return kj() - this.sDN.cGa().getHeadersCount();
  }

  public abstract f cGA();

  public boolean cGy()
  {
    return false;
  }

  public abstract void cGz();

  public void ej(View paramView)
  {
  }

  protected void ek(View paramView)
  {
    if (this.sDN.cFY() != cFP())
    {
      this.sDN.cFR().sFo = 2;
      this.sDN.FC(cFP());
      com.tencent.mm.plugin.websearch.api.a.a.kT(4);
      this.sDN.cFR().f(this.sAX);
      ((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getReporter().a(this.sDN.cFT(), this.sAX, cFP(), 2, "");
    }
    while (true)
    {
      return;
      el(paramView);
      if (cGy())
      {
        cFO();
        this.sDN.cFO();
        cFN();
        this.sDN.cFN();
      }
    }
  }

  public void el(View paramView)
  {
  }

  public abstract View getWowView();

  public void mc(boolean paramBoolean)
  {
    this.sDN.cGe();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.h
 * JD-Core Version:    0.6.2
 */