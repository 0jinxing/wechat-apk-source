package com.tencent.mm.plugin.brandservice.b;

import android.content.Context;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.fts.a.a.e;
import com.tencent.mm.plugin.fts.a.f;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.protobuf.uz;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import java.util.List;

public final class a
{
  private static ak feP;

  static
  {
    AppMethodBeat.i(13825);
    feP = new ak(Looper.getMainLooper());
    AppMethodBeat.o(13825);
  }

  public static com.tencent.mm.aj.d a(com.tencent.mm.aj.d paramd, uz paramuz)
  {
    if (paramuz != null)
    {
      paramd.field_brandFlag = paramuz.gvb;
      paramd.field_brandIconURL = paramuz.gve;
      paramd.field_brandInfo = paramuz.gvd;
      paramd.field_extInfo = paramuz.gvc;
    }
    return paramd;
  }

  public static void a(ImageView paramImageView, ad paramad, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(13824);
    if ((!paramBoolean) && (com.tencent.mm.n.a.jh(paramad.field_type)))
    {
      a.b.r(paramImageView, paramad.field_username);
      AppMethodBeat.o(13824);
    }
    while (true)
    {
      return;
      paramad = new c.a();
      paramad.ePV = 2130837985;
      paramad.ePG = true;
      paramad.eQf = true;
      o.ahp().a(paramString, paramImageView, paramad.ahG());
      AppMethodBeat.o(13824);
    }
  }

  public static Spanned b(Context paramContext, String paramString, List<String> paramList)
  {
    AppMethodBeat.i(13822);
    if (bo.isNullOrNil(paramString))
    {
      paramContext = null;
      AppMethodBeat.o(13822);
    }
    while (true)
    {
      return paramContext;
      if ((paramContext == null) || (paramList == null))
      {
        paramContext = new SpannableString(paramString);
        AppMethodBeat.o(13822);
      }
      else
      {
        paramContext = f.a(com.tencent.mm.plugin.fts.a.a.d.a(paramString, paramList));
        if ((paramContext.mDR instanceof Spannable))
        {
          paramContext = (Spannable)paramContext.mDR;
          AppMethodBeat.o(13822);
        }
        else
        {
          paramContext = new SpannableString(paramContext.mDR);
          AppMethodBeat.o(13822);
        }
      }
    }
  }

  public static boolean b(TextView paramTextView, CharSequence paramCharSequence)
  {
    boolean bool = false;
    AppMethodBeat.i(13823);
    if (paramTextView == null)
      AppMethodBeat.o(13823);
    while (true)
    {
      return bool;
      if ((paramCharSequence == null) || (paramCharSequence.length() == 0))
      {
        paramTextView.setVisibility(8);
        AppMethodBeat.o(13823);
      }
      else
      {
        paramTextView.setVisibility(0);
        paramTextView.setText(paramCharSequence);
        bool = true;
        AppMethodBeat.o(13823);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.b.a
 * JD-Core Version:    0.6.2
 */