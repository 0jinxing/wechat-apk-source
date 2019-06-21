package com.tencent.mm.kiss.widget.textview.a;

import android.graphics.Typeface;
import android.text.Layout.Alignment;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  public Typeface bTq = null;
  public Layout.Alignment eNC = Layout.Alignment.ALIGN_NORMAL;
  public TextUtils.TruncateAt eND = null;
  public TextDirectionHeuristic eNF = null;
  public float eNG = 0.0F;
  public float eNH = 1.0F;
  public boolean eNI = false;
  public TextPaint eNN = null;
  public int eOf = -1;
  public float eOg = -1.0F;
  public int fontStyle = -1;
  public int gravity = 51;
  public int linkColor = -1;
  public int maxLength = -1;
  public int maxLines = -1;
  public int minLines = -1;
  public int textColor = -1;

  public final int hashCode()
  {
    AppMethodBeat.i(105815);
    int i = this.maxLines * 31 + 0 + this.maxLength * 31;
    int j = i;
    if (this.eNN != null)
      j = i + this.eNN.hashCode() * 31;
    i = j + this.eNC.hashCode() * 31;
    j = i;
    if (this.eND != null)
      j = i + this.eND.hashCode() * 31;
    i = j + this.gravity * 31 + this.eOf * 31;
    j = i;
    if (this.eNF != null)
      j = i + this.eNF.hashCode() * 31;
    i = (int)((int)(j + this.eNG * 31.0F) + this.eNH * 31.0F);
    if (this.eNI);
    for (j = 1; ; j = 0)
    {
      i = j * 31 + i;
      j = i;
      if (this.bTq != null)
        j = i + this.bTq.hashCode() * 31;
      j = (int)(j + this.fontStyle * 31 + this.eOg * 31.0F);
      i = this.textColor;
      int k = this.linkColor;
      AppMethodBeat.o(105815);
      return j + i * 31 + k * 31;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(105814);
    Object localObject = new StringBuilder("");
    ((StringBuilder)localObject).append(String.format("maxLines: %d ", new Object[] { Integer.valueOf(this.maxLines) }));
    ((StringBuilder)localObject).append(String.format("maxLength: %d ", new Object[] { Integer.valueOf(this.maxLength) }));
    ((StringBuilder)localObject).append(String.format("textPaint: %s ", new Object[] { this.eNN }));
    ((StringBuilder)localObject).append(String.format("alignment: %s ", new Object[] { this.eNC }));
    ((StringBuilder)localObject).append(String.format("ellipsize: %s ", new Object[] { this.eND }));
    ((StringBuilder)localObject).append(String.format("gravity: %s ", new Object[] { Integer.valueOf(this.gravity) }));
    ((StringBuilder)localObject).append(String.format("ellipsizeWidth: %s ", new Object[] { Integer.valueOf(this.eOf) }));
    ((StringBuilder)localObject).append(String.format("textDirection: %s ", new Object[] { this.eNF }));
    ((StringBuilder)localObject).append(String.format("spacingAdd: %s spacingMult: %s ", new Object[] { Float.valueOf(this.eNG), Float.valueOf(this.eNH) }));
    ((StringBuilder)localObject).append(String.format("includedPad: %b ", new Object[] { Boolean.valueOf(this.eNI) }));
    ((StringBuilder)localObject).append(String.format("typeface: %s ", new Object[] { this.bTq }));
    ((StringBuilder)localObject).append(String.format("fontStyle: %d ", new Object[] { Integer.valueOf(this.fontStyle) }));
    ((StringBuilder)localObject).append(String.format("textSize: %s ", new Object[] { Float.valueOf(this.eOg) }));
    ((StringBuilder)localObject).append(String.format("textColor: %d", new Object[] { Integer.valueOf(this.textColor) }));
    ((StringBuilder)localObject).append(String.format("linkColor: %d", new Object[] { Integer.valueOf(this.linkColor) }));
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(105814);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kiss.widget.textview.a.a
 * JD-Core Version:    0.6.2
 */