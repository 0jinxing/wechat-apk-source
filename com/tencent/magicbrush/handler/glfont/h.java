package com.tencent.magicbrush.handler.glfont;

import android.graphics.Bitmap;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.tencent.magicbrush.a.c.c;
import com.tencent.magicbrush.a.d.a;
import com.tencent.magicbrush.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.FloatBuffer;
import java.util.HashMap;

public final class h
  implements IMBFontHandler
{
  public b bSW;
  private f bTf;
  private d bTg;
  public e bTn;
  private i bTo;
  private boolean bTp = false;

  private void clear()
  {
    AppMethodBeat.i(115945);
    c.c.i("MicroMsg.MBFontManagerImpl", "FontManager clear", new Object[0]);
    if (this.bTg != null)
      this.bTg.clear();
    if (this.bTf != null)
      this.bTf.clear();
    this.bTp = true;
    AppMethodBeat.o(115945);
  }

  public final boolean checkAndFlushClearSignal()
  {
    boolean bool = this.bTp;
    this.bTp = false;
    return bool;
  }

  public final int[] checkAndFlushDirtySignal()
  {
    int[] arrayOfInt = null;
    AppMethodBeat.i(115944);
    d locald;
    int i;
    if (this.bTg != null)
    {
      locald = this.bTg;
      if (!locald.bST.isEmpty())
      {
        i = 1;
        if (i != 0)
          break label47;
        AppMethodBeat.o(115944);
      }
    }
    while (true)
    {
      return arrayOfInt;
      i = 0;
      break;
      label47: locald.bSU[0] = locald.bST.left;
      locald.bSU[1] = locald.bST.top;
      locald.bSU[2] = locald.bST.right;
      locald.bSU[3] = locald.bST.bottom;
      locald.bST.setEmpty();
      arrayOfInt = locald.bSU;
      AppMethodBeat.o(115944);
      continue;
      AppMethodBeat.o(115944);
    }
  }

  public final FloatBuffer drawText(String paramString)
  {
    AppMethodBeat.i(115943);
    this.bTf.a(this.bTo);
    FloatBuffer localFloatBuffer1 = this.bTf.bW(paramString);
    FloatBuffer localFloatBuffer2 = localFloatBuffer1;
    if (localFloatBuffer1 == null)
    {
      c.c.i("MicroMsg.MBFontManagerImpl", "drawText() load result is null. atlas may be full. first time, clear and retry; text = [%s]; mCurrentState = [%s]", new Object[] { paramString, this.bTo });
      clear();
      localFloatBuffer2 = this.bTf.bW(paramString);
    }
    if (localFloatBuffer2 == null)
    {
      c.c.i("MicroMsg.MBFontManagerImpl", "drawText() load result is null. atlas may be full. second time, just returned; text = [%s]; mCurrentState = [%s]", new Object[] { paramString, this.bTo });
      localFloatBuffer2 = null;
      AppMethodBeat.o(115943);
    }
    while (true)
    {
      return localFloatBuffer2;
      AppMethodBeat.o(115943);
    }
  }

  public final void enableStroke(boolean paramBoolean)
  {
    this.bTo.bTr = paramBoolean;
  }

  public final Bitmap getBitmapAtlas()
  {
    if (this.bTg != null);
    for (Bitmap localBitmap = this.bTg.bSR; ; localBitmap = null)
      return localBitmap;
  }

  public final float getTextLineHeight(String paramString)
  {
    float f = 0.0F;
    AppMethodBeat.i(115948);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(115948);
    while (true)
    {
      return f;
      if ((this.bTn == null) || (this.bTf == null))
      {
        AppMethodBeat.o(115948);
      }
      else
      {
        this.bTf.a(this.bTo);
        paramString = this.bTf.bSX;
        if (paramString.bTm == null)
        {
          AppMethodBeat.o(115948);
        }
        else
        {
          f = paramString.bTm.descent - paramString.bTm.ascent + 1.0F;
          AppMethodBeat.o(115948);
        }
      }
    }
  }

  public final void init(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(115940);
    c.c.i("MicroMsg.MBFontManagerImpl", "init() called with: m_atlasWidth = [" + paramInt1 + "], m_atlasHeight = [" + paramInt2 + "]", new Object[0]);
    this.bTg = new d(paramInt1, paramInt2);
    this.bTn = new e(this.bSW);
    this.bTf = new f(this.bTg);
    this.bTo = new i(i.a.bTt);
    AppMethodBeat.o(115940);
  }

  public final String loadFont(String paramString)
  {
    String str = null;
    AppMethodBeat.i(115941);
    e locale = this.bTn;
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(115941);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      if (locale.bSW == null)
      {
        c.c.i("MicroMsg.MBFont", "[MBFontHandler] FaceProvider is null", new Object[0]);
        AppMethodBeat.o(115941);
        paramString = str;
      }
      else
      {
        paramString = locale.bSW.bU(paramString);
        Typeface localTypeface = locale.bSW.bT(paramString);
        if (localTypeface == null)
        {
          AppMethodBeat.o(115941);
          paramString = str;
        }
        else
        {
          str = e.bV(paramString);
          paramString = str;
          if (c.isNullOrNil(str))
          {
            if (a.yF() != null)
              a.yF().fR(0);
            paramString = "font" + localTypeface.hashCode();
          }
          c.c.i("MicroMsg.MBFont", "familyName:".concat(String.valueOf(paramString)), new Object[0]);
          locale.bSV.put(paramString, localTypeface);
          AppMethodBeat.o(115941);
        }
      }
    }
  }

  public final float measureText(String paramString)
  {
    AppMethodBeat.i(115946);
    this.bTf.a(this.bTo);
    float f1 = this.bTf.bY(paramString);
    float f2 = f1;
    if (f1 == -1.0F)
    {
      c.c.i("MicroMsg.MBFontManagerImpl", "measure() load result is null. atlas may be full. first time, clear and retry; text = [%s]; mCurrentState = [%s]", new Object[] { paramString, this.bTo });
      clear();
      f2 = this.bTf.bY(paramString);
    }
    if (f2 == -1.0F)
    {
      c.c.i("MicroMsg.MBFontManagerImpl", "measure() load result is null. atlas may be full. second time, just returned; text = [%s]; mCurrentState = [%s]", new Object[] { paramString, this.bTo });
      f2 = 0.0F;
      AppMethodBeat.o(115946);
    }
    while (true)
    {
      return f2;
      AppMethodBeat.o(115946);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(115947);
    Object localObject;
    if (this.bTg != null)
    {
      localObject = this.bTg;
      if (((d)localObject).bSR != null)
        ((d)localObject).bSR.recycle();
      this.bTg = null;
    }
    if (this.bTn != null)
    {
      localObject = this.bTn;
      if (((e)localObject).bSV != null)
      {
        ((e)localObject).bSV.clear();
        ((e)localObject).bSV = null;
      }
      this.bTn = null;
    }
    if (this.bTf != null)
    {
      localObject = this.bTf;
      if (((f)localObject).bSX != null)
        ((f)localObject).bSX = null;
      this.bTf = null;
    }
    AppMethodBeat.o(115947);
  }

  public final void setStrokeWidth(float paramFloat)
  {
    this.bTo.strokeWidth = paramFloat;
  }

  public final void useFont(String paramString, float paramFloat, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(115942);
    i.a locala1 = i.a.i(paramBoolean1, paramBoolean2);
    i locali = this.bTo;
    Object localObject = this.bTn;
    if (locala1 == null);
    for (i.a locala2 = i.a.bTt; ; locala2 = locala1)
    {
      if ((paramString == null) || (paramString.length() == 0))
        paramString = Typeface.create(null, locala2.bTx);
      while (true)
      {
        locali.bTq = paramString;
        this.bTo.fontSize = paramFloat;
        this.bTo.bTs = locala1;
        AppMethodBeat.o(115942);
        return;
        localObject = (Typeface)((e)localObject).bSV.get(paramString);
        if (localObject != null)
        {
          paramString = (String)localObject;
          if (((Typeface)localObject).getStyle() != locala2.bTx)
            paramString = Typeface.create((Typeface)localObject, locala2.bTx);
        }
        else
        {
          paramString = Typeface.create(paramString, locala2.bTx);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.glfont.h
 * JD-Core Version:    0.6.2
 */