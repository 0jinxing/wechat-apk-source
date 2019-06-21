package com.tencent.magicbrush.handler.glfont;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import com.tencent.magicbrush.a.a;
import com.tencent.magicbrush.a.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

@SuppressLint({"LongLogTag"})
final class f
{
  g bSX;
  private HashMap<String, j> bSY;
  f.a bSZ;
  private FloatBuffer bTa;
  private List<j> bTb;
  private i bTc;
  private StringBuilder bTd;

  f(d paramd)
  {
    AppMethodBeat.i(115920);
    this.bTd = new StringBuilder();
    this.bSX = new g(paramd, this);
    this.bSY = new HashMap();
    this.bSZ = new f.a();
    this.bTb = new ArrayList();
    AppMethodBeat.o(115920);
  }

  private List<j> bX(String paramString)
  {
    AppMethodBeat.i(115922);
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(115922);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      this.bTb.clear();
      int i = 0;
      while (true)
      {
        if (i >= paramString.length())
          break label123;
        int j = p(paramString, i);
        j localj;
        if (j > 0)
        {
          localj = c(paramString, i, j);
          i += j;
        }
        while (true)
        {
          if (localj != null)
            break label108;
          this.bTb.clear();
          AppMethodBeat.o(115922);
          paramString = null;
          break;
          localj = m(paramString.charAt(i));
          i++;
        }
        label108: this.bTb.add(localj);
      }
      label123: paramString = this.bTb;
      AppMethodBeat.o(115922);
    }
  }

  private j c(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(115924);
    String str = d(paramString, paramInt1, paramInt2);
    j localj = (j)this.bSY.get(str);
    if (localj != null)
    {
      AppMethodBeat.o(115924);
      paramString = localj;
    }
    while (true)
    {
      return paramString;
      if (a.yA() == null)
      {
        paramString = new IllegalStateException("FontDrawableProvider must support");
        AppMethodBeat.o(115924);
        throw paramString;
      }
      paramString = a.yA().o(paramString, paramInt1);
      if (paramString == null)
      {
        paramString = j.bTz;
        AppMethodBeat.o(115924);
      }
      else
      {
        paramInt2 = (int)this.bTc.fontSize;
        paramInt1 = (int)this.bTc.fontSize;
        if ((paramInt2 <= 0) || (paramInt1 <= 0))
        {
          paramString = j.bTz;
          AppMethodBeat.o(115924);
        }
        else
        {
          paramString = this.bSX.a(paramString, paramInt2, paramInt1);
          if (paramString == null)
          {
            paramString = null;
            AppMethodBeat.o(115924);
          }
          else
          {
            this.bSY.put(str, paramString);
            AppMethodBeat.o(115924);
          }
        }
      }
    }
  }

  private String d(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(115926);
    if (paramInt2 <= 0)
    {
      paramString = new IllegalStateException("There is no font drawable");
      AppMethodBeat.o(115926);
      throw paramString;
    }
    this.bTd.setLength(0);
    while (paramInt2 > 0)
    {
      this.bTd.append(paramString.charAt(paramInt1));
      paramInt1++;
      paramInt2--;
    }
    this.bTd.append("|").append(this.bTc.fontSize);
    paramString = this.bTd.toString();
    AppMethodBeat.o(115926);
    return paramString;
  }

  private j m(char paramChar)
  {
    AppMethodBeat.i(115923);
    j localj;
    if (this.bTc == null)
    {
      AppMethodBeat.o(115923);
      localj = null;
    }
    while (true)
    {
      return localj;
      String str = n(paramChar);
      localj = (j)this.bSY.get(str);
      if (localj != null)
      {
        AppMethodBeat.o(115923);
      }
      else
      {
        localj = this.bSX.o(paramChar);
        if (localj == null)
        {
          new StringBuilder("Load glyph failed. glyph == null [").append(paramChar).append("]");
          AppMethodBeat.o(115923);
          localj = null;
        }
        else
        {
          this.bSY.put(str, localj);
          AppMethodBeat.o(115923);
        }
      }
    }
  }

  private String n(char paramChar)
  {
    AppMethodBeat.i(115927);
    if (this.bTc == null)
    {
      localObject = null;
      AppMethodBeat.o(115927);
      return localObject;
    }
    this.bTd.setLength(0);
    StringBuilder localStringBuilder = this.bTd.append(paramChar).append("|").append(this.bTc.fontSize).append("|");
    if (this.bTc.bTq == null);
    for (Object localObject = "null"; ; localObject = Integer.valueOf(this.bTc.bTq.hashCode()))
    {
      localObject = localStringBuilder.append(localObject);
      if (this.bTc.bTr)
        ((StringBuilder)localObject).append("|").append(this.bTc.strokeWidth);
      if (this.bTc.bTs != null)
        ((StringBuilder)localObject).append("|").append(this.bTc.bTs.bTx);
      localObject = ((StringBuilder)localObject).toString();
      AppMethodBeat.o(115927);
      break;
    }
  }

  private static int p(String paramString, int paramInt)
  {
    AppMethodBeat.i(115925);
    if (a.yA() == null)
    {
      paramInt = 0;
      AppMethodBeat.o(115925);
    }
    while (true)
    {
      return paramInt;
      paramInt = a.yA().n(paramString, paramInt);
      AppMethodBeat.o(115925);
    }
  }

  final void a(i parami)
  {
    int i = 0;
    AppMethodBeat.i(115928);
    this.bTc = parami;
    g localg = this.bSX;
    localg.bTi.setTypeface(parami.bTq);
    localg.bTi.setTextSize(parami.fontSize);
    if (parami.bTr)
    {
      localg.bTi.setStyle(Paint.Style.STROKE);
      localg.bTi.setStrokeWidth(parami.strokeWidth);
    }
    while (true)
    {
      localg.bTi.setTextSkewX(0.0F);
      localg.bTi.setFakeBoldText(false);
      if (parami.bTs != null)
      {
        if ((parami.bTq == null) || (parami.bTq.getStyle() != parami.bTs.bTx))
        {
          if ((parami.bTs == i.a.bTv) || (parami.bTs == i.a.bTw))
            localg.bTi.setTextSkewX(-0.25F);
          if ((parami.bTs == i.a.bTu) || (parami.bTs == i.a.bTw))
            localg.bTi.setFakeBoldText(true);
        }
        parami = parami.bTs;
        if ((parami == i.a.bTu) || (parami == i.a.bTw))
          i = 1;
        if (i != 0)
          localg.bTi.setFakeBoldText(true);
      }
      localg.bTi.getFontMetrics(localg.bTm);
      AppMethodBeat.o(115928);
      return;
      localg.bTi.setStyle(Paint.Style.FILL);
    }
  }

  final FloatBuffer bW(String paramString)
  {
    Paint.FontMetrics localFontMetrics = null;
    AppMethodBeat.i(115921);
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(115921);
      paramString = localFontMetrics;
    }
    while (true)
    {
      return paramString;
      List localList = bX(paramString);
      if ((localList == null) || (localList.size() == 0))
      {
        AppMethodBeat.o(115921);
        paramString = localFontMetrics;
      }
      else
      {
        int i = Math.max(paramString.length(), 10) * 36 + 16;
        if ((this.bTa == null) || (this.bTa.capacity() * 4 < i))
          this.bTa = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.bTa.clear();
        paramString = this.bTa;
        float f = g.E(localList);
        localFontMetrics = this.bSX.bTm;
        paramString.put(f).put(localFontMetrics.ascent).put(localFontMetrics.descent).put(localFontMetrics.descent - localFontMetrics.ascent);
        j.a(paramString, localList);
        paramString.flip();
        this.bTb.clear();
        AppMethodBeat.o(115921);
      }
    }
  }

  final float bY(String paramString)
  {
    AppMethodBeat.i(115929);
    float f;
    if ((paramString == null) || (paramString.length() == 0))
    {
      f = 0.0F;
      AppMethodBeat.o(115929);
    }
    while (true)
    {
      return f;
      paramString = bX(paramString);
      if ((paramString == null) || (paramString.size() == 0))
      {
        f = -1.0F;
        AppMethodBeat.o(115929);
      }
      else
      {
        f = g.E(paramString);
        AppMethodBeat.o(115929);
      }
    }
  }

  final void clear()
  {
    AppMethodBeat.i(115930);
    if (this.bSY != null)
    {
      Iterator localIterator = this.bSY.values().iterator();
      while (localIterator.hasNext())
      {
        j localj = (j)localIterator.next();
        this.bSZ.bTe.offer(localj);
      }
      this.bSY.clear();
    }
    AppMethodBeat.o(115930);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.glfont.f
 * JD-Core Version:    0.6.2
 */