package com.tencent.mm.plugin.emojicapture.ui.editor.a;

import a.f.b.j;
import a.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.fontdecode.PathExtractor;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/editor/text/PathTextDrawer;", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/text/TextDrawer;", "fontPaths", "", "", "textSize", "", "([Ljava/lang/String;I)V", "currFont", "dataMap", "", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/text/PathTextDrawer$TextPathData;", "defaultDrawer", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/text/DefaultTextDrawer;", "text", "", "drawLine", "", "canvas", "Landroid/graphics/Canvas;", "lineStart", "lineEnd", "x", "", "y", "paint", "Landroid/graphics/Paint;", "withEllipsis", "", "refresh", "setText", "switchFont", "fontPath", "TextPathData", "plugin-emojicapture_release"})
public final class b
  implements c
{
  private String loB;
  private Map<String, b.a> loC;
  private final a loD;
  private CharSequence text;

  public b(String[] paramArrayOfString, int paramInt)
  {
    AppMethodBeat.i(3139);
    this.loB = "";
    this.loC = ((Map)new HashMap());
    this.loD = new a();
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str = paramArrayOfString[j];
      b.a locala = new b.a(str, paramInt);
      if (locala.loE.isValid())
        this.loC.put(str, locala);
    }
    AppMethodBeat.o(3139);
  }

  public final void Kd(String paramString)
  {
    AppMethodBeat.i(3137);
    j.p(paramString, "fontPath");
    this.loB = paramString;
    AppMethodBeat.o(3137);
  }

  public final void a(Canvas paramCanvas, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, Paint paramPaint, boolean paramBoolean)
  {
    AppMethodBeat.i(3138);
    j.p(paramCanvas, "canvas");
    j.p(paramPaint, "paint");
    if (bo.ac(this.text))
      AppMethodBeat.o(3138);
    while (true)
    {
      return;
      b.a locala = (b.a)this.loC.get(this.loB);
      if (locala == null)
      {
        this.loD.a(paramCanvas, paramInt1, paramInt2, paramFloat1, paramFloat2, paramPaint, paramBoolean);
        AppMethodBeat.o(3138);
      }
      else
      {
        paramCanvas.save();
        paramCanvas.translate(paramFloat1, paramFloat2);
        int i = -1;
        if (paramInt1 < paramInt2)
        {
          if (locala.loF.get(paramInt1) != null)
          {
            paramCanvas.drawPath((Path)locala.loF.get(paramInt1), paramPaint);
            paramFloat1 = paramPaint.measureText(this.text, paramInt1, paramInt1 + 1);
          }
          while (true)
          {
            paramCanvas.translate(paramFloat1, 0.0F);
            int j = i;
            CharSequence localCharSequence;
            label217: 
            do
            {
              while (true)
              {
                paramInt1++;
                i = j;
                break;
                localCharSequence = this.text;
                if (localCharSequence == null)
                  j.dWJ();
                if ((!a.k.a.isSurrogate(localCharSequence.charAt(paramInt1))) || (i != -1))
                  break label217;
                j = paramInt1;
              }
              if (i == -1)
                break label332;
              localCharSequence = this.text;
              if (localCharSequence == null)
                j.dWJ();
              if (paramInt1 >= localCharSequence.length() - 1)
                break label284;
              localCharSequence = this.text;
              if (localCharSequence == null)
                j.dWJ();
              j = i;
            }
            while (a.k.a.isSurrogate(localCharSequence.charAt(paramInt1 + 1)));
            label284: paramCanvas.save();
            paramCanvas.drawText(this.text, i, paramInt1 + 1, 0.0F, 0.0F, paramPaint);
            paramCanvas.restore();
            paramFloat1 = paramPaint.measureText(this.text, i, paramInt1 + 1);
            i = -1;
            continue;
            label332: paramCanvas.drawText(this.text, paramInt1, paramInt1 + 1, 0.0F, 0.0F, paramPaint);
            paramFloat1 = paramPaint.measureText(this.text, paramInt1, paramInt1 + 1);
          }
        }
        if (paramBoolean)
          paramCanvas.drawText(c.a.boe(), 0.0F, 0.0F, paramPaint);
        paramCanvas.restore();
        AppMethodBeat.o(3138);
      }
    }
  }

  public final void refresh()
  {
    AppMethodBeat.i(3136);
    Iterator localIterator = this.loC.values().iterator();
    while (localIterator.hasNext())
    {
      b.a locala = (b.a)localIterator.next();
      CharSequence localCharSequence = this.text;
      locala.loF.clear();
      locala.loG.clear();
      if (localCharSequence != null)
      {
        int i = 0;
        label70: if (i < localCharSequence.length())
        {
          char c = localCharSequence.charAt(i);
          Path localPath = new Path();
          RectF localRectF = new RectF();
          if (!locala.loE.a(c, localPath, localRectF))
            break label155;
          locala.loF.add(localPath);
          locala.loG.add(localRectF);
        }
        while (true)
        {
          i++;
          break label70;
          break;
          label155: locala.loF.add(null);
          locala.loG.add(null);
        }
      }
    }
    AppMethodBeat.o(3136);
  }

  public final void setText(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(3135);
    j.p(paramCharSequence, "text");
    this.text = paramCharSequence;
    this.loD.setText(paramCharSequence);
    AppMethodBeat.o(3135);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.a.b
 * JD-Core Version:    0.6.2
 */