package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EllipsizingTextView extends TextView
{
  private int maxLines;
  private final List<Object> nom;
  private boolean non;
  private boolean noo;
  private boolean nop;
  private String noq;
  private float nor;
  private float nos;

  public EllipsizingTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(112403);
    this.nom = new ArrayList();
    this.maxLines = -1;
    this.nor = 1.0F;
    this.nos = 0.0F;
    AppMethodBeat.o(112403);
  }

  public EllipsizingTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(112404);
    this.nom = new ArrayList();
    this.maxLines = -1;
    this.nor = 1.0F;
    this.nos = 0.0F;
    AppMethodBeat.o(112404);
  }

  private Layout Ow(String paramString)
  {
    AppMethodBeat.i(112409);
    paramString = new StaticLayout(paramString, getPaint(), getWidth() - getPaddingLeft() - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.nor, this.nos, false);
    AppMethodBeat.o(112409);
    return paramString;
  }

  public int getMaxLines()
  {
    return this.maxLines;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(112408);
    Object localObject1;
    if (this.noo)
    {
      super.setEllipsize(null);
      int i = getMaxLines();
      localObject1 = this.noq;
      if (i == -1)
        break label312;
      Object localObject2 = Ow((String)localObject1);
      if (((Layout)localObject2).getLineCount() <= i)
        break label312;
      localObject2 = this.noq.substring(0, ((Layout)localObject2).getLineEnd(i - 1)).trim();
      if (((String)localObject2).getBytes().length != ((String)localObject2).length());
      for (int j = 1; j == 0; j = 0)
        while (true)
        {
          localObject1 = localObject2;
          if (Ow((String)localObject2 + "...").getLineCount() <= i)
            break;
          j = ((String)localObject2).lastIndexOf(' ');
          localObject1 = localObject2;
          if (j == -1)
            break;
          localObject2 = ((String)localObject2).substring(0, j);
        }
      localObject1 = localObject2;
      if (((String)localObject2).length() >= 2)
        localObject1 = ((String)localObject2).substring(0, ((String)localObject2).length() - 1 - 1);
      localObject1 = (String)localObject1 + "...";
    }
    label312: for (boolean bool = true; ; bool = false)
    {
      if (!((String)localObject1).equals(getText()))
        this.nop = true;
      try
      {
        setText((CharSequence)localObject1);
        this.nop = false;
        this.noo = false;
        if (bool != this.non)
        {
          this.non = bool;
          localObject1 = this.nom.iterator();
          if (((Iterator)localObject1).hasNext())
            ((Iterator)localObject1).next();
        }
      }
      finally
      {
        this.nop = false;
        AppMethodBeat.o(112408);
      }
      return;
    }
  }

  protected void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(112407);
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    if (!this.nop)
    {
      this.noq = paramCharSequence.toString();
      this.noo = true;
    }
    AppMethodBeat.o(112407);
  }

  public void setEllipsize(TextUtils.TruncateAt paramTruncateAt)
  {
  }

  public void setLineSpacing(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(112406);
    this.nos = paramFloat1;
    this.nor = paramFloat2;
    super.setLineSpacing(paramFloat1, paramFloat2);
    AppMethodBeat.o(112406);
  }

  public void setMaxLines(int paramInt)
  {
    AppMethodBeat.i(112405);
    super.setMaxLines(paramInt);
    this.maxLines = paramInt;
    this.noo = true;
    AppMethodBeat.o(112405);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.widget.EllipsizingTextView
 * JD-Core Version:    0.6.2
 */