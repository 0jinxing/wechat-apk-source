package com.tencent.ttpic.particle;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class TexturedColoredVertex
{
  public Vector4 color;
  public Vector2 texture;
  public Vector2 vertex;

  public TexturedColoredVertex()
  {
    AppMethodBeat.i(83640);
    this.vertex = new Vector2();
    this.texture = new Vector2();
    this.color = new Vector4();
    AppMethodBeat.o(83640);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.particle.TexturedColoredVertex
 * JD-Core Version:    0.6.2
 */