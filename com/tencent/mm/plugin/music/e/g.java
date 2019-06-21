package com.tencent.mm.plugin.music.e;

import com.tencent.mm.aw.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.URL;
import java.util.List;

public abstract class g
  implements a
{
  protected c oLQ;
  protected e oLR;

  public String Th(String paramString)
  {
    return paramString;
  }

  public URL Ti(String paramString)
  {
    return new URL(paramString);
  }

  public void a(e parame, int paramInt)
  {
  }

  public final void a(c paramc)
  {
    this.oLQ = paramc;
  }

  public e bTQ()
  {
    return this.oLR;
  }

  public void d(List<e> paramList, boolean paramBoolean)
  {
  }

  public boolean g(e parame)
  {
    this.oLR = parame;
    return true;
  }

  public e h(e parame)
  {
    return parame;
  }

  public e i(e parame)
  {
    return parame;
  }

  public void init()
  {
  }

  public void j(e parame)
  {
    this.oLR = parame;
  }

  public void k(e parame)
  {
  }

  public void l(e parame)
  {
  }

  public e m(List<e> paramList, int paramInt)
  {
    if ((paramList == null) || (paramList.size() == 0) || (paramInt >= paramList.size()))
      ab.i("MicroMsg.Music.MusicBaseLogic", "music wrapper list error");
    for (paramList = null; ; paramList = this.oLR)
    {
      return paramList;
      this.oLR = ((e)paramList.get(paramInt));
      ab.i("MicroMsg.Music.MusicBaseLogic", "startPlayNewMusicList:%d", new Object[] { Integer.valueOf(paramInt) });
    }
  }

  public void m(e parame)
  {
  }

  public void n(e parame)
  {
  }

  public void o(e parame)
  {
  }

  public boolean zF(int paramInt)
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.e.g
 * JD-Core Version:    0.6.2
 */