package com.tencent.mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Locale;
import org.a.a;

public enum aj
{
  static final Class jha;

  static
  {
    AppMethodBeat.i(123857);
    jhb = new aj[0];
    Object localObject = null;
    try
    {
      Class localClass = Class.forName("android.view.inputmethod.ComposingText");
      localObject = localClass;
      jha = localObject;
      AppMethodBeat.o(123857);
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
        ab.e("MicroMsg.AppBrand.InputUtil", "class for ComposingText e = %s", new Object[] { localClassNotFoundException });
    }
  }

  static Spannable C(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(123850);
    if (paramCharSequence == null)
      paramCharSequence = "";
    while (true)
    {
      if ((paramCharSequence instanceof Spannable))
      {
        paramCharSequence = (Spannable)paramCharSequence;
        AppMethodBeat.o(123850);
      }
      while (true)
      {
        return paramCharSequence;
        paramCharSequence = new SpannableStringBuilder(paramCharSequence);
        AppMethodBeat.o(123850);
      }
    }
  }

  public static boolean D(CharSequence paramCharSequence)
  {
    boolean bool = false;
    AppMethodBeat.i(123851);
    if ((paramCharSequence instanceof Spanned))
    {
      paramCharSequence = (Spanned)paramCharSequence;
      paramCharSequence = paramCharSequence.getSpans(0, paramCharSequence.length(), jha);
      if ((paramCharSequence != null) && (paramCharSequence.length > 0))
      {
        bool = true;
        AppMethodBeat.o(123851);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(123851);
      continue;
      AppMethodBeat.o(123851);
    }
  }

  static boolean bM(Object paramObject)
  {
    AppMethodBeat.i(123852);
    boolean bool = jha.isInstance(paramObject);
    AppMethodBeat.o(123852);
    return bool;
  }

  public static InputMethodManager cS(View paramView)
  {
    AppMethodBeat.i(123853);
    if (paramView != null)
    {
      Context localContext = paramView.getContext();
      paramView = localContext;
      if (localContext != null);
    }
    else
    {
      paramView = ah.getContext();
    }
    paramView = (InputMethodManager)paramView.getSystemService("input_method");
    AppMethodBeat.o(123853);
    return paramView;
  }

  public static void cT(View paramView)
  {
    AppMethodBeat.i(123854);
    Object localObject = cS(paramView);
    if (localObject == null);
    for (paramView = "NULL Imm"; ; paramView = String.format(Locale.US, "mServedView=%s, mNextServedView=%s", new Object[] { paramView, localObject }))
    {
      ab.i("MicroMsg.AppBrand.InputUtil", "dumpImmDebugInfo: %s", new Object[] { paramView });
      AppMethodBeat.o(123854);
      return;
      paramView = (View)a.ep(localObject).get("mServedView");
      localObject = (View)a.ep(localObject).get("mNextServedView");
    }
  }

  public static boolean f(View paramView1, View paramView2)
  {
    boolean bool = false;
    AppMethodBeat.i(123855);
    if ((paramView1 == null) || (paramView2 == null))
      AppMethodBeat.o(123855);
    while (true)
    {
      return bool;
      paramView2 = paramView2.getParent();
      ViewParent localViewParent;
      do
      {
        if (paramView1 == paramView2)
        {
          bool = true;
          AppMethodBeat.o(123855);
          break;
        }
        localViewParent = paramView2.getParent();
        paramView2 = localViewParent;
      }
      while (localViewParent != null);
      AppMethodBeat.o(123855);
    }
  }

  public static boolean g(Boolean paramBoolean)
  {
    AppMethodBeat.i(123856);
    boolean bool;
    if ((paramBoolean != null) && (paramBoolean.booleanValue()))
    {
      bool = true;
      AppMethodBeat.o(123856);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(123856);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.aj
 * JD-Core Version:    0.6.2
 */