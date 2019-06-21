package com.tencent.mm.ui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView.BufferType;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.neattextview.textview.view.NeatTextView.b;

public class MMNeat7extView extends NeatTextView
{
  private static boolean RP;
  public static boolean zMr;
  private static final String zMs;
  private GestureDetector iay;
  private View.OnLongClickListener zMt;
  private a zMu;
  private b zMv;

  static
  {
    AppMethodBeat.i(107897);
    zMr = false;
    zMs = "^[\\u0001-\\u00b7\\u4E00-\\u9FA5\\ue001-\\ue537\\u2005-\\u2027\\u3001-\\u3011\\uff01-\\uffe5\\u2100-\\u2900[\\ud83c\\udc00-\\ud83c\\udfff]|[\\ud83d\\udc00-\\ud83d\\udfff]]+$".substring(1, 149);
    RP = true;
    AppMethodBeat.o(107897);
  }

  public MMNeat7extView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107887);
    this.iay = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener()
    {
      public final boolean onDoubleTap(MotionEvent paramAnonymousMotionEvent)
      {
        AppMethodBeat.i(107885);
        boolean bool;
        if (MMNeat7extView.this.getOnDoubleClickListener() == null)
        {
          bool = false;
          AppMethodBeat.o(107885);
        }
        while (true)
        {
          return bool;
          bool = MMNeat7extView.this.getOnDoubleClickListener().fi(MMNeat7extView.this);
          AppMethodBeat.o(107885);
        }
      }
    });
    AppMethodBeat.o(107887);
  }

  public final void a(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    AppMethodBeat.i(107894);
    try
    {
      super.a(paramCharSequence, paramBufferType);
      if ((this.AkW) && (this.zMv != null))
        paramCharSequence.toString();
      if (this.zMu != null)
        this.zMu.ag(paramCharSequence);
      AppMethodBeat.o(107894);
      return;
    }
    catch (Exception paramBufferType)
    {
      while (true)
      {
        String str = dPr().toString().replaceAll(zMs, "*");
        ab.e("MicroMsg.MMNeat7extView", "[_setText] replaceContent:%s exception:%s", new Object[] { str, paramBufferType });
        if (this.zMv == null)
          break;
        this.zMv.a(paramBufferType, str, "_setText");
      }
      AppMethodBeat.o(107894);
    }
    throw paramBufferType;
  }

  public final void ah(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(107893);
    while (true)
    {
      try
      {
        super.ah(paramCharSequence);
        if ((this.AkW) && (this.zMv != null))
          paramCharSequence.toString();
        if (this.zMu != null)
        {
          localObject = this.zMu;
          if ((paramCharSequence instanceof Spannable))
          {
            TextView.BufferType localBufferType1 = TextView.BufferType.SPANNABLE;
            ((a)localObject).ag(paramCharSequence);
          }
        }
        else
        {
          AppMethodBeat.o(107893);
          return;
        }
      }
      catch (Exception localException)
      {
        Object localObject = dPr().toString().replaceAll(zMs, "*");
        ab.e("MicroMsg.MMNeat7extView", "[_setText] replaceContent:%s exception:%s", new Object[] { localObject, localException });
        if (this.zMv != null)
        {
          this.zMv.a(localException, (String)localObject, "_setText");
          continue;
        }
        AppMethodBeat.o(107893);
        throw localException;
      }
      TextView.BufferType localBufferType2 = TextView.BufferType.NORMAL;
    }
  }

  public final boolean dKA()
  {
    return RP;
  }

  @SuppressLint({"GetContentDescriptionOverride"})
  public CharSequence getContentDescription()
  {
    AppMethodBeat.i(107889);
    ab.d("MicroMsg.MMNeat7extView", "[isOpen] %s", new Object[] { Boolean.FALSE });
    Object localObject = (AccessibilityManager)getContext().getSystemService("accessibility");
    boolean bool1 = ((AccessibilityManager)localObject).isEnabled();
    boolean bool2 = ((AccessibilityManager)localObject).isTouchExplorationEnabled();
    int i;
    if ((bool1) && (bool2))
    {
      i = 1;
      if ((i == 0) && (!b.dnO()))
        break label85;
      localObject = super.dPr();
      AppMethodBeat.o(107889);
    }
    while (true)
    {
      return localObject;
      i = 0;
      break;
      label85: localObject = "";
      AppMethodBeat.o(107889);
    }
  }

  public float getVerticalOffset()
  {
    AppMethodBeat.i(107888);
    float f;
    if (zMr)
    {
      f = super.getVerticalOffset();
      getMeasuredHeight();
      AppMethodBeat.o(107888);
    }
    while (true)
    {
      return f;
      f = super.getVerticalOffset();
      AppMethodBeat.o(107888);
    }
  }

  public void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(107891);
    try
    {
      super.onDraw(paramCanvas);
      AppMethodBeat.o(107891);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        paramCanvas = dPr().toString().replaceAll(zMs, "*");
        ab.e("MicroMsg.MMNeat7extView", "[onDraw] replaceContent:%s exception:%s", new Object[] { paramCanvas, localException });
        if (this.zMv == null)
          break;
        this.zMv.a(localException, paramCanvas, "onDraw");
        AppMethodBeat.o(107891);
      }
      AppMethodBeat.o(107891);
      throw localException;
    }
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107892);
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      AppMethodBeat.o(107892);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        String str = dPr().toString().replaceAll(zMs, "*");
        ab.e("MicroMsg.MMNeat7extView", "[onMeasure] replaceContent:%s exception:%s", new Object[] { str, localException });
        if (this.zMv == null)
          break;
        this.zMv.a(localException, str, "onMeasure");
        AppMethodBeat.o(107892);
      }
      AppMethodBeat.o(107892);
      throw localException;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(107890);
    if ((!RP) || ((this.AkW) && (this.iay != null)))
      this.iay.onTouchEvent(paramMotionEvent);
    boolean bool = super.onTouchEvent(paramMotionEvent);
    AppMethodBeat.o(107890);
    return bool;
  }

  public void setIsOpen(boolean paramBoolean)
  {
    RP = paramBoolean;
  }

  public void setOnLongClickListener(View.OnLongClickListener paramOnLongClickListener)
  {
    AppMethodBeat.i(107895);
    this.zMt = paramOnLongClickListener;
    super.setOnLongClickListener(new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        AppMethodBeat.i(107886);
        if (MMNeat7extView.zMr)
          Toast.makeText(MMNeat7extView.this.getContext(), MMNeat7extView.asC(MMNeat7extView.this.dPr().toString()), 1).show();
        boolean bool;
        if (MMNeat7extView.a(MMNeat7extView.this) != null)
        {
          bool = MMNeat7extView.a(MMNeat7extView.this).onLongClick(paramAnonymousView);
          AppMethodBeat.o(107886);
        }
        while (true)
        {
          return bool;
          bool = false;
          AppMethodBeat.o(107886);
        }
      }
    });
    AppMethodBeat.o(107895);
  }

  public void setTextCrashListener(b paramb)
  {
    this.zMv = paramb;
  }

  public void setTextListener(a parama)
  {
    this.zMu = parama;
  }

  public static abstract interface a
  {
    public abstract void ag(CharSequence paramCharSequence);
  }

  public static abstract interface b
  {
    public abstract void a(Exception paramException, String paramString1, String paramString2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.MMNeat7extView
 * JD-Core Version:    0.6.2
 */