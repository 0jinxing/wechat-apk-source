package com.tencent.magicbrush.handler.glfont;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.FloatBuffer;
import java.util.Iterator;
import java.util.List;

final class j
{
  static final j bTz;
  float bTA;
  float bTB;
  float bTC;
  float bTD;
  float bTE;
  float bTF;
  boolean bTG;
  float height;
  float width;

  static
  {
    AppMethodBeat.i(115955);
    j localj = new j();
    bTz = localj;
    localj.height = 0.0F;
    localj.width = 0.0F;
    localj.bTB = 0.0F;
    localj.bTA = 0.0F;
    localj.bTF = 0.0F;
    localj.bTE = 0.0F;
    localj.bTD = 0.0F;
    localj.bTC = 0.0F;
    AppMethodBeat.o(115955);
  }

  static void a(FloatBuffer paramFloatBuffer, List<j> paramList)
  {
    AppMethodBeat.i(115953);
    if ((paramList == null) || (paramList.isEmpty()))
      AppMethodBeat.o(115953);
    while (true)
    {
      return;
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        j localj = (j)paramList.next();
        if (localj != null)
        {
          FloatBuffer localFloatBuffer = paramFloatBuffer.put(localj.bTA).put(localj.bTB).put(localj.width).put(localj.height).put(localj.bTC).put(localj.bTD).put(localj.bTE).put(localj.bTF);
          if (localj.bTG);
          for (float f = 1.0F; ; f = 0.0F)
          {
            localFloatBuffer.put(f);
            break;
          }
        }
      }
      AppMethodBeat.o(115953);
    }
  }

  public final void f(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.bTC = paramFloat1;
    this.bTD = paramFloat2;
    this.bTE = paramFloat3;
    this.bTF = paramFloat4;
  }

  public final String toString()
  {
    AppMethodBeat.i(115954);
    String str = "glyph(" + this.bTA + ", " + this.bTB + ", [" + this.width + ", " + this.height + "], [" + this.bTC + ", " + this.bTD + ", " + this.bTE + ", " + this.bTF + ", " + this.bTG + "])";
    AppMethodBeat.o(115954);
    return str;
  }

  public final void z(float paramFloat1, float paramFloat2)
  {
    this.width = paramFloat1;
    this.height = paramFloat2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.glfont.j
 * JD-Core Version:    0.6.2
 */