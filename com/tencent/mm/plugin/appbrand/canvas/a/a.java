package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.l;
import java.io.Serializable;

public final class a extends Paint
  implements Serializable
{
  public a.a hdH;
  private float hdI;
  private String hdJ;
  private int hdK;
  private float hdL;
  private int hdM;
  private int mColor;

  public a()
  {
    AppMethodBeat.i(103653);
    this.hdH = a.a.hdN;
    this.hdL = 3.4028235E+38F;
    this.hdM = 2147483647;
    init();
    AppMethodBeat.o(103653);
  }

  private void init()
  {
    AppMethodBeat.i(103654);
    this.hdI = 0.0F;
    this.mColor = 0;
    this.hdJ = null;
    this.hdK = 0;
    if (this.hdL == 3.4028235E+38F)
    {
      this.hdI = (getAlpha() / 255.0F);
      this.hdL = this.hdI;
      if (this.hdM != 2147483647)
        break label97;
      this.mColor = getColor();
      this.hdM = this.mColor;
      AppMethodBeat.o(103654);
    }
    while (true)
    {
      return;
      this.hdI = this.hdL;
      break;
      label97: this.mColor = this.hdM;
      AppMethodBeat.o(103654);
    }
  }

  public final void ai(float paramFloat)
  {
    AppMethodBeat.i(103658);
    this.hdI = paramFloat;
    setColor(this.mColor);
    AppMethodBeat.o(103658);
  }

  public final a ayq()
  {
    AppMethodBeat.i(103656);
    a locala = new a();
    locala.setColor(getColor());
    locala.setFlags(getFlags());
    locala.setDither(isDither());
    Shader localShader = getShader();
    if (localShader != null)
    {
      Object localObject = l.a(Shader.class, "copy", localShader, new Class[0], new Object[0]);
      if ((localObject == null) || (!(localObject instanceof Shader)))
        break label165;
      localShader = (Shader)localObject;
    }
    label165: 
    while (true)
    {
      locala.setShader(localShader);
      locala.setStrokeJoin(getStrokeJoin());
      locala.setStrokeMiter(getStrokeMiter());
      locala.setStrokeWidth(getStrokeWidth());
      locala.setStrokeCap(getStrokeCap());
      locala.setStyle(getStyle());
      locala.setTextSize(getTextSize());
      locala.setTextAlign(getTextAlign());
      locala.setTypeface(getTypeface());
      locala.hdH = this.hdH;
      AppMethodBeat.o(103656);
      return locala;
    }
  }

  public final a b(a parama)
  {
    AppMethodBeat.i(103657);
    parama.setColor(getColor());
    parama.setFlags(getFlags());
    parama.setDither(isDither());
    Shader localShader = getShader();
    if (localShader != null)
    {
      Object localObject = l.a(Shader.class, "copy", localShader, new Class[0], new Object[0]);
      if ((localObject == null) || (!(localObject instanceof Shader)))
        break label157;
      localShader = (Shader)localObject;
    }
    label157: 
    while (true)
    {
      parama.setShader(localShader);
      parama.setStrokeJoin(getStrokeJoin());
      parama.setStrokeMiter(getStrokeMiter());
      parama.setStrokeWidth(getStrokeWidth());
      parama.setStrokeCap(getStrokeCap());
      parama.setStyle(getStyle());
      parama.setTextSize(getTextSize());
      parama.setTextAlign(getTextAlign());
      parama.setTypeface(getTypeface());
      parama.hdH = this.hdH;
      AppMethodBeat.o(103657);
      return parama;
    }
  }

  protected final Object clone()
  {
    AppMethodBeat.i(103655);
    Object localObject = super.clone();
    AppMethodBeat.o(103655);
    return localObject;
  }

  public final void nE(int paramInt)
  {
    AppMethodBeat.i(103663);
    this.hdK = paramInt;
    setTypeface(Typeface.create(this.hdJ, paramInt));
    AppMethodBeat.o(103663);
  }

  public final void release()
  {
    AppMethodBeat.i(103661);
    reset();
    init();
    AppMethodBeat.o(103661);
  }

  public final void reset()
  {
    AppMethodBeat.i(103660);
    super.reset();
    this.hdH = a.a.hdN;
    AppMethodBeat.o(103660);
  }

  public final void setColor(int paramInt)
  {
    AppMethodBeat.i(103659);
    this.mColor = paramInt;
    super.setColor(((int)(Color.alpha(paramInt) * this.hdI) & 0xFF) << 24 | 0xFFFFFF & paramInt);
    AppMethodBeat.o(103659);
  }

  public final void yB(String paramString)
  {
    AppMethodBeat.i(103662);
    this.hdJ = paramString;
    setTypeface(Typeface.create(paramString, this.hdK));
    AppMethodBeat.o(103662);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.a.a
 * JD-Core Version:    0.6.2
 */