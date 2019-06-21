package com.tencent.mm.plugin.mmsight.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$b
{
  public boolean eVT;
  public int efs;
  public int oxA;
  public boolean oxB;
  public int oxC;
  public int oxD;
  public int oxx;
  public int oxy;
  public int oxz;
  public int scene;
  public int textColor;

  public a$b(int paramInt)
  {
    AppMethodBeat.i(54955);
    if (paramInt == 1)
    {
      this.scene = 2;
      AppMethodBeat.o(54955);
    }
    while (true)
    {
      return;
      if (paramInt == 2)
      {
        this.scene = 4;
        AppMethodBeat.o(54955);
      }
      else if (paramInt == 512)
      {
        this.scene = 3;
        AppMethodBeat.o(54955);
      }
      else
      {
        if (paramInt == 4)
          this.scene = 8;
        AppMethodBeat.o(54955);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(54956);
    String str = "VideoEditDetailData{scene=" + this.scene + ", isCancel=" + this.eVT + ", rawDuration=" + this.oxx + ", cropDuration=" + this.oxy + ", emojiItemCount=" + this.oxz + ", textItemCount=" + this.oxA + ", isCrop=" + this.oxB + ", undoCount=" + this.efs + ", doodleCount=" + this.oxC + ", penColors=" + this.oxD + ", textColor=" + this.textColor + '}';
    AppMethodBeat.o(54956);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.a.a.b
 * JD-Core Version:    0.6.2
 */