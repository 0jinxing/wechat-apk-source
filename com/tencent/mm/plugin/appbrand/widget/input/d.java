package com.tencent.mm.plugin.appbrand.widget.input;

import android.graphics.Rect;
import android.view.View;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.input.d.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.Map;

final class d extends c<s>
{
  int jdr;
  s jds;
  v jdt;
  com.tencent.mm.plugin.appbrand.widget.input.d.h jdu;
  boolean jdv;
  boolean jdw;

  d(String paramString, u paramu, e parame)
  {
    super(paramString, paramu, parame.jdk);
    AppMethodBeat.i(123583);
    this.jdr = 0;
    this.jds = new s(paramu.mContext);
    this.jdr = bo.a((Integer)o.jeS.get(paramString), 0);
    AppMethodBeat.o(123583);
  }

  private v aQu()
  {
    AppMethodBeat.i(123594);
    v localv;
    if (this.jdt != null)
    {
      localv = this.jdt;
      AppMethodBeat.o(123594);
    }
    while (true)
    {
      return localv;
      localv = (v)this.jds.getInputPanel();
      this.jdt = localv;
      AppMethodBeat.o(123594);
    }
  }

  private boolean isFocused()
  {
    boolean bool = false;
    AppMethodBeat.i(123592);
    if (this.jds == null)
      AppMethodBeat.o(123592);
    while (true)
    {
      return bool;
      if (this.jds.isFocused())
      {
        AppMethodBeat.o(123592);
        bool = true;
      }
      else if (aQu() == null)
      {
        AppMethodBeat.o(123592);
      }
      else if (!aQu().isShown())
      {
        AppMethodBeat.o(123592);
      }
      else if (this.jdt.getAttachedEditText() == this.jds)
      {
        AppMethodBeat.o(123592);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(123592);
      }
    }
  }

  public final boolean EG(String paramString)
  {
    AppMethodBeat.i(123589);
    boolean bool;
    if (this.jds == null)
    {
      bool = false;
      AppMethodBeat.o(123589);
    }
    while (true)
    {
      return bool;
      this.jds.B(paramString);
      bool = true;
      AppMethodBeat.o(123589);
    }
  }

  final Rect aQm()
  {
    AppMethodBeat.i(123587);
    Rect localRect = new Rect(this.jdu.jjs.intValue(), this.jdu.jjr.intValue(), this.jdu.jjs.intValue() + this.jdu.jjp.intValue(), this.jdu.jjr.intValue() + this.jdu.jjq.intValue());
    AppMethodBeat.o(123587);
    return localRect;
  }

  public final boolean aQr()
  {
    AppMethodBeat.i(123585);
    boolean bool;
    if ((this.jdu != null) && (aj.g(this.jdu.jjM)))
    {
      bool = true;
      AppMethodBeat.o(123585);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(123585);
    }
  }

  public final int aQs()
  {
    AppMethodBeat.i(123586);
    int i;
    if ((this.jdu == null) || (this.jdu.jjJ == null))
    {
      i = 0;
      AppMethodBeat.o(123586);
    }
    while (true)
    {
      return i;
      i = this.jdu.jjJ.intValue();
      AppMethodBeat.o(123586);
    }
  }

  public final boolean aQt()
  {
    boolean bool = false;
    AppMethodBeat.i(123591);
    if (aQu() == null)
      AppMethodBeat.o(123591);
    while (true)
    {
      return bool;
      if (isFocused())
      {
        Object localObject = this.jdt;
        ((v)localObject).setVisibility(8);
        ((v)localObject).aQW();
        ab.d("MicroMsg.AppBrandInputComponentAsNumber", "[input_switch] disableInputFocus %s", new Object[] { this.jds });
        if (this.jds != null)
        {
          this.jds.setFocusable(false);
          this.jds.setFocusableInTouchMode(false);
          this.jds.setEnabled(false);
        }
        localObject = (u)this.jdm.get();
        if ((localObject != null) && (((u)localObject).aJz() != null))
          h.aQx().d(((u)localObject).aJz());
        k.a(this.jdm).qB(this.jdk);
        AppMethodBeat.o(123591);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(123591);
      }
    }
  }

  public final com.tencent.mm.plugin.appbrand.widget.input.d.h b(com.tencent.mm.plugin.appbrand.widget.input.d.h paramh)
  {
    AppMethodBeat.i(123588);
    if (this.jdu == null)
    {
      this.jdu = paramh;
      if ((aj.g(paramh.jjU)) && (this.jds != null))
        this.jds.setPasswordMode(true);
      if (this.jds != null)
        break label69;
      paramh = null;
      AppMethodBeat.o(123588);
    }
    while (true)
    {
      return paramh;
      this.jdu.a(paramh);
      break;
      label69: b.a(this.jds, this.jdu);
      paramh = this.jdu;
      AppMethodBeat.o(123588);
    }
  }

  public final boolean dr(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(123590);
    boolean bool;
    if (this.jds == null)
    {
      AppMethodBeat.o(123590);
      bool = false;
    }
    while (true)
    {
      return bool;
      this.jdt = v.cM(((u)this.jdm.get()).getContentView());
      if (this.jdt == null)
      {
        AppMethodBeat.o(123590);
        bool = false;
      }
      else
      {
        this.jdw = true;
        Object localObject = (u)this.jdm.get();
        if ((localObject != null) && (((u)localObject).aJz() != null))
          h.aQx().c(((u)localObject).aJz());
        this.jdt.setXMode(this.jdr);
        v localv = this.jdt;
        localObject = this.jds;
        if (localObject != null)
        {
          if (localv.tc != localObject)
            localv.aQW();
          localv.setInputEditText((EditText)localObject);
          localv.setVisibility(0);
        }
        this.jdt.setOnDoneListener(new v.a()
        {
          public final void onDone()
          {
            AppMethodBeat.i(123582);
            d.this.a(d.this.aQq());
            d.this.fb(false);
            AppMethodBeat.o(123582);
          }
        });
        dq(paramInt1, paramInt2);
        k.a(this.jdm).qA(this.jdk);
        this.jdw = false;
        AppMethodBeat.o(123590);
        bool = true;
      }
    }
  }

  protected final boolean fb(boolean paramBoolean)
  {
    AppMethodBeat.i(123593);
    ab.d("MicroMsg.AppBrandInputComponentAsNumber", "[input_switch] onFocusChanged hasFocus %b, isFocused %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(isFocused()) });
    if (!paramBoolean)
    {
      if (this.jdv)
        AppMethodBeat.o(123593);
      while (true)
      {
        return true;
        if (isFocused())
          break;
        AppMethodBeat.o(123593);
      }
      this.jdv = true;
      a(aQq());
      aQt();
      aQp();
      this.jdv = false;
      this.jds = null;
    }
    while (true)
    {
      AppMethodBeat.o(123593);
      break;
      if (this.jdw)
      {
        AppMethodBeat.o(123593);
        break;
      }
      if (isFocused())
      {
        AppMethodBeat.o(123593);
        break;
      }
      this.jdw = true;
      dr(-2, -2);
      this.jdw = false;
    }
  }

  public final View getInputPanel()
  {
    AppMethodBeat.i(123584);
    aQu();
    v localv = this.jdt;
    AppMethodBeat.o(123584);
    return localv;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.d
 * JD-Core Version:    0.6.2
 */