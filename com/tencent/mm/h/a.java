package com.tencent.mm.h;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.9;
import com.tencent.mm.ui.widget.a.c.a;

public final class a
{
  public String Title;
  public String desc;
  private c eeT;
  public int showType;
  public String url;

  public static a jY(String paramString)
  {
    AppMethodBeat.i(77627);
    c localc = c.ka(paramString);
    if (localc != null)
    {
      paramString = new a();
      paramString.eeT = localc;
      paramString.url = localc.url;
      paramString.desc = localc.desc;
      paramString.showType = localc.showType;
      paramString.Title = localc.Title;
      AppMethodBeat.o(77627);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(77627);
    }
  }

  public final boolean a(Context paramContext, DialogInterface.OnClickListener paramOnClickListener1, DialogInterface.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(77628);
    String str3;
    String str4;
    int i;
    label103: boolean bool;
    if ((this.showType == 3) || (this.showType == 4))
    {
      String str1 = this.eeT.eff;
      String str2 = this.eeT.efg;
      str3 = str1;
      str4 = str2;
      if (bo.isNullOrNil(str1))
      {
        str3 = str1;
        str4 = str2;
        if (bo.isNullOrNil(str2))
        {
          if (this.showType != 3)
            break label178;
          i = 2131297088;
          str3 = paramContext.getString(i);
          if (this.showType != 3)
            break label185;
          i = 2131296990;
          str4 = paramContext.getString(i);
        }
      }
      if ((bo.isNullOrNil(str3)) || (bo.isNullOrNil(str4)))
      {
        str2 = this.desc;
        str1 = this.Title;
        if (bo.isNullOrNil(str3))
        {
          label147: if (!bo.isNullOrNil(str3))
            break label199;
          label155: h.a(paramContext, str2, str1, str4, paramOnClickListener2);
          label167: AppMethodBeat.o(77628);
          bool = true;
        }
      }
    }
    while (true)
    {
      return bool;
      label178: i = 2131296994;
      break;
      label185: i = 2131296868;
      break label103;
      str4 = str3;
      break label147;
      label199: paramOnClickListener2 = paramOnClickListener1;
      break label155;
      h.d(paramContext, this.desc, this.Title, str3, str4, paramOnClickListener1, paramOnClickListener2);
      break label167;
      if (this.showType == 1)
      {
        h.b(paramContext, this.desc, this.Title, true);
        AppMethodBeat.o(77628);
        bool = true;
      }
      else if (this.showType == 5)
      {
        h.b(paramContext, this.desc, this.Title, true);
        AppMethodBeat.o(77628);
        bool = true;
      }
      else
      {
        bool = false;
        AppMethodBeat.o(77628);
      }
    }
  }

  public final boolean a(Context paramContext, DialogInterface.OnDismissListener paramOnDismissListener)
  {
    AppMethodBeat.i(77629);
    String str1 = this.desc;
    String str2 = this.Title;
    if (!((Activity)paramContext).isFinishing())
    {
      c.a locala = new c.a(paramContext);
      locala.asD(str2);
      locala.asE(str1);
      locala.a(paramOnDismissListener);
      locala.rc(false);
      locala.Qc(2131296994).a(new h.9());
      paramOnDismissListener = locala.aMb();
      paramOnDismissListener.show();
      h.a(paramContext, paramOnDismissListener);
    }
    AppMethodBeat.o(77629);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.h.a
 * JD-Core Version:    0.6.2
 */