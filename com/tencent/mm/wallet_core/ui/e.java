package com.tencent.mm.wallet_core.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.se;
import com.tencent.mm.kernel.b;
import com.tencent.mm.model.bk;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class e
{
  private static final com.tencent.mm.sdk.platformtools.ae<Integer, Typeface> AhE;
  private static SimpleDateFormat kIy;
  private static final String[] tGn;
  protected static final Pattern vrO;

  static
  {
    AppMethodBeat.i(49328);
    vrO = Pattern.compile("((?:(http|https|Http|Https):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?((?:(?:[a-zA-Z0-9][a-zA-Z0-9\\-\\_]{0,64}\\.)+(?:(?:aero|arpa|asia|a[cdefgilmnoqrstuwxz])|(?:biz|b[abdefghijmnorstvwyz])|(?:cat|com|coop|c[acdfghiklmnoruvxyz])|d[ejkmoz]|(?:edu|e[cegrstu])|f[ijkmor]|(?:gov|g[abdefghilmnpqrstuwy])|h[kmnrtu]|(?:info|int|i[delmnoqrst])|(?:jobs|j[emop])|k[eghimnrwyz]|l[abcikrstuvy]|(?:mil|mobi|museum|m[acdeghklmnopqrstuvwxyz])|(?:name|net|n[acefgilopruz])|(?:org|om)|(?:pro|p[aefghklmnrstwy])|qa|r[eouw]|s[abcdeghijklmnortuvyz]|(?:tel|travel|t[cdfghjklmnoprtvwz])|u[agkmsyz]|v[aceginu]|w[fs]|y[etu]|z[amw]))|(?:(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?");
    tGn = new String[] { "ABC_DEBIT", "ABC_CREDIT", "CITIC_CREDIT", "CMBC_DEBIT", "COMM_DEBIT", "HSBC_DEBIT" };
    AhE = new com.tencent.mm.sdk.platformtools.ae(4);
    kIy = null;
    AppMethodBeat.o(49328);
  }

  public static String F(double paramDouble)
  {
    AppMethodBeat.i(49270);
    String str = String.format("%.2f", new Object[] { Double.valueOf(paramDouble) });
    AppMethodBeat.o(49270);
    return str;
  }

  public static String G(double paramDouble)
  {
    AppMethodBeat.i(49269);
    String str = e(paramDouble, "");
    AppMethodBeat.o(49269);
    return str;
  }

  public static long H(double paramDouble)
  {
    AppMethodBeat.i(49292);
    long l = Math.round(100.0D * paramDouble);
    AppMethodBeat.o(49292);
    return l;
  }

  public static Bitmap J(Bitmap paramBitmap)
  {
    boolean bool = true;
    AppMethodBeat.i(49300);
    Object localObject = new Matrix();
    ((Matrix)localObject).reset();
    ((Matrix)localObject).setRotate(90.0F, paramBitmap.getWidth() / 2, paramBitmap.getHeight() / 2);
    paramBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
    localObject = new StringBuilder("resultBmp is null: ");
    if (paramBitmap == null);
    while (true)
    {
      ab.d("MicroMsg.WalletBaseUtil ", bool + "  degree:90.0");
      AppMethodBeat.o(49300);
      return paramBitmap;
      bool = false;
    }
  }

  public static void K(Bitmap paramBitmap)
  {
    AppMethodBeat.i(49299);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
      paramBitmap.recycle();
    AppMethodBeat.o(49299);
  }

  public static String QQ(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = "fonts/WeChatSansSS-Medium.ttf";
    case 0:
    case 2:
    case 1:
    case 3:
    case 4:
    case 6:
    case 5:
    case 7:
    }
    while (true)
    {
      return str;
      str = "fonts/WeChatSansSS-Medium.ttf";
      continue;
      str = "fonts/WeChatSansSS-Light.ttf";
      continue;
      str = "fonts/WeChatSansSS-Bold.ttf";
      continue;
      str = "fonts/WeChatSansSS-Regular.ttf";
      continue;
      str = "fonts/WeChatSansStd-Medium.ttf";
      continue;
      str = "fonts/WeChatSansStd-Light.ttf";
      continue;
      str = "fonts/WeChatSansStd-Bold.ttf";
      continue;
      str = "fonts/WeChatSansStd-Regular.ttf";
    }
  }

  public static String QR(int paramInt)
  {
    AppMethodBeat.i(49273);
    String str = a(paramInt, new SimpleDateFormat("MM-dd HH:mm"), new SimpleDateFormat("yyyy-MM-dd HH:mm"));
    AppMethodBeat.o(49273);
    return str;
  }

  public static void QS(int paramInt)
  {
    AppMethodBeat.i(49304);
    com.tencent.mm.plugin.report.service.h.pYm.e(12719, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(1) });
    AppMethodBeat.o(49304);
  }

  public static long a(String paramString1, String paramString2, RoundingMode paramRoundingMode)
  {
    AppMethodBeat.i(49312);
    long l = a(paramString1, paramString2, 0, paramRoundingMode).longValue();
    AppMethodBeat.o(49312);
    return l;
  }

  public static String a(int paramInt, SimpleDateFormat paramSimpleDateFormat1, SimpleDateFormat paramSimpleDateFormat2)
  {
    AppMethodBeat.i(49274);
    long l = paramInt * 1000L;
    GregorianCalendar localGregorianCalendar1 = new GregorianCalendar();
    GregorianCalendar localGregorianCalendar2 = new GregorianCalendar();
    localGregorianCalendar2.setTimeInMillis(l);
    if (localGregorianCalendar1.get(1) == localGregorianCalendar2.get(1))
    {
      paramSimpleDateFormat1 = paramSimpleDateFormat1.format(new Date(l));
      AppMethodBeat.o(49274);
    }
    while (true)
    {
      return paramSimpleDateFormat1;
      paramSimpleDateFormat1 = paramSimpleDateFormat2.format(new Date(l));
      AppMethodBeat.o(49274);
    }
  }

  public static BigDecimal a(String paramString1, String paramString2, int paramInt, RoundingMode paramRoundingMode)
  {
    AppMethodBeat.i(49314);
    try
    {
      double d = bo.getDouble(paramString1, 0.0D);
      BigDecimal localBigDecimal = new java/math/BigDecimal;
      if (d == 0.0D);
      for (paramString1 = "0"; ; paramString1 = paramString1.trim())
      {
        localBigDecimal.<init>(paramString1);
        paramString1 = new java/math/BigDecimal;
        paramString1.<init>(paramString2.trim());
        paramString1 = localBigDecimal.divide(paramString1, paramInt, paramRoundingMode);
        AppMethodBeat.o(49314);
        return paramString1;
      }
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WalletBaseUtil ", paramString1, "", new Object[0]);
        paramString1 = new BigDecimal(0);
        AppMethodBeat.o(49314);
      }
    }
  }

  public static void a(int paramInt1, long paramLong, int paramInt2)
  {
    AppMethodBeat.i(49307);
    com.tencent.mm.plugin.report.service.h.pYm.e(13375, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(1), Long.valueOf(paramLong), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(49307);
  }

  public static void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(49288);
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    localLinkedList1.add(paramContext.getString(2131304629));
    localLinkedList2.add(Integer.valueOf(0));
    if ((paramString1 != null) && (paramBoolean2))
    {
      localLinkedList1.add(paramContext.getString(2131304627));
      localLinkedList2.add(Integer.valueOf(1));
    }
    if ((paramBoolean1) && (!bo.isNullOrNil(paramString2)))
    {
      localLinkedList1.add(paramContext.getString(2131304630, new Object[] { paramString2 }));
      localLinkedList2.add(Integer.valueOf(2));
      localLinkedList1.add(paramContext.getString(2131304631, new Object[] { paramString2 }));
      localLinkedList2.add(Integer.valueOf(3));
    }
    com.tencent.mm.ui.base.h.a(paramContext, "", localLinkedList1, localLinkedList2, "", new e.1(paramContext, paramString1));
    AppMethodBeat.o(49288);
  }

  public static void a(Context paramContext, String paramString, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(49277);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", paramBoolean);
    com.tencent.mm.bp.d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent, paramInt);
    AppMethodBeat.o(49277);
  }

  public static void a(TextView paramTextView, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(49305);
    if (paramTextView == null)
    {
      ab.e("MicroMsg.WalletBaseUtil ", "hy: text view is null.");
      AppMethodBeat.o(49305);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramString2))
      {
        ab.w("MicroMsg.WalletBaseUtil ", "hy: msg is null. set text view to gone");
        paramTextView.setVisibility(8);
        AppMethodBeat.o(49305);
      }
      else
      {
        paramTextView.setVisibility(0);
        paramTextView.setText(paramString2);
        com.tencent.mm.protocal.g.gu(atz(paramString1), 0);
        if (!bo.isNullOrNil(paramString3))
          paramTextView.setOnClickListener(new e.6(paramString3, paramTextView, paramString1));
        AppMethodBeat.o(49305);
      }
    }
  }

  public static void a(String paramString, e.b paramb)
  {
    AppMethodBeat.i(49294);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(new bk(new e.3(paramString, paramb)), 0);
    AppMethodBeat.o(49294);
  }

  public static void a(e.c[] paramArrayOfc)
  {
    AppMethodBeat.i(49293);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(new bk(new e.2(paramArrayOfc)), 0);
    AppMethodBeat.o(49293);
  }

  public static void a(String[] paramArrayOfString, e.a parama)
  {
    AppMethodBeat.i(49303);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(new bk(new e.5(paramArrayOfString, parama)), 0);
    AppMethodBeat.o(49303);
  }

  public static Typeface aA(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(49265);
    Object localObject;
    if (paramInt == 8)
    {
      localObject = Typeface.DEFAULT;
      AppMethodBeat.o(49265);
    }
    while (true)
    {
      return localObject;
      if (Build.VERSION.SDK_INT > 23)
      {
        localObject = Typeface.createFromAsset(paramContext.getAssets(), QQ(paramInt));
        AppMethodBeat.o(49265);
      }
      else
      {
        Typeface localTypeface = (Typeface)AhE.get(Integer.valueOf(paramInt));
        localObject = localTypeface;
        if (localTypeface == null)
        {
          localObject = Typeface.createFromAsset(paramContext.getAssets(), QQ(paramInt));
          AhE.put(Integer.valueOf(paramInt), localObject);
        }
        AppMethodBeat.o(49265);
      }
    }
  }

  public static void aA(View paramView, int paramInt)
  {
    AppMethodBeat.i(49320);
    View localView = (View)paramView.getParent();
    localView.post(new e.7(paramView, paramInt, localView));
    AppMethodBeat.o(49320);
  }

  public static void ae(Context paramContext, String paramString)
  {
    AppMethodBeat.i(49278);
    if (TextUtils.isEmpty(paramString))
    {
      ab.v("MicroMsg.WalletBaseUtil ", "username is null");
      AppMethodBeat.o(49278);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.putExtra("Contact_User", paramString);
      localIntent.putExtra("force_get_contact", true);
      com.tencent.mm.bp.d.b(paramContext, "profile", ".ui.ContactInfoUI", localIntent);
      AppMethodBeat.o(49278);
    }
  }

  public static void af(Context paramContext, String paramString)
  {
    AppMethodBeat.i(49275);
    if (TextUtils.isEmpty(paramString))
    {
      ab.v("MicroMsg.WalletBaseUtil ", "username is null");
      AppMethodBeat.o(49275);
    }
    while (true)
    {
      return;
      if (t.mY(paramString))
      {
        ag(paramContext, paramString);
        AppMethodBeat.o(49275);
      }
      else
      {
        ae(paramContext, paramString);
        AppMethodBeat.o(49275);
      }
    }
  }

  public static void ag(Context paramContext, String paramString)
  {
    AppMethodBeat.i(49280);
    if (TextUtils.isEmpty(paramString))
    {
      ab.v("MicroMsg.WalletBaseUtil ", "username is null");
      AppMethodBeat.o(49280);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.putExtra("Chat_User", paramString);
      localIntent.putExtra("finish_direct", true);
      com.tencent.mm.bp.d.f(paramContext, ".ui.chatting.ChattingUI", localIntent);
      AppMethodBeat.o(49280);
    }
  }

  public static void aj(Context paramContext, String paramString)
  {
    AppMethodBeat.i(49323);
    String str = paramString;
    if (bo.isNullOrNil(paramString))
      str = ah.getContext().getString(2131305389);
    com.tencent.mm.ui.base.h.b(paramContext, str, "", true);
    AppMethodBeat.o(49323);
  }

  public static void ar(ArrayList<Bitmap> paramArrayList)
  {
    AppMethodBeat.i(49298);
    if ((paramArrayList != null) && (paramArrayList.size() > 0))
      for (int i = paramArrayList.size() - 1; i > 0; i--)
        K((Bitmap)paramArrayList.remove(i));
    AppMethodBeat.o(49298);
  }

  public static String atA(String paramString)
  {
    AppMethodBeat.i(49308);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(49308);
    while (true)
    {
      return paramString;
      if (paramString.length() > 14)
      {
        paramString = paramString.substring(0, 14) + "...";
        AppMethodBeat.o(49308);
      }
      else
      {
        AppMethodBeat.o(49308);
      }
    }
  }

  public static int atB(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(49321);
    if ((bo.isNullOrNil(paramString)) || (paramString.length() < 2))
    {
      ab.w("MicroMsg.WalletBaseUtil ", "illegal reqkey: %s", new Object[] { paramString });
      AppMethodBeat.o(49321);
    }
    while (true)
    {
      return i;
      com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll("100456");
      if (!localc.isValid())
      {
        ab.w("MicroMsg.WalletBaseUtil ", "invalid abtest value");
        AppMethodBeat.o(49321);
      }
      else
      {
        if (bo.getInt((String)localc.dru().get("open"), 0) != 0)
          break;
        ab.i("MicroMsg.WalletBaseUtil ", "abtest unopened");
        AppMethodBeat.o(49321);
      }
    }
    if ((paramString.startsWith("ts_wx")) || (paramString.startsWith("offline_wx")) || (paramString.startsWith("up_wx")) || (paramString.startsWith("wx")));
    for (i = bo.getInt(paramString.substring(paramString.length() - 2), 0); ; i = 0)
    {
      ab.d("MicroMsg.WalletBaseUtil ", "parse group id: %s, reqKey: %s", new Object[] { Integer.valueOf(i), paramString });
      AppMethodBeat.o(49321);
      break;
    }
  }

  public static void atC(String paramString)
  {
    AppMethodBeat.i(49322);
    String str = paramString;
    if (bo.isNullOrNil(paramString))
      str = ah.getContext().getString(2131305389);
    Toast.makeText(ah.getContext(), str, 1).show();
    AppMethodBeat.o(49322);
  }

  public static String atq(String paramString)
  {
    AppMethodBeat.i(49268);
    if ("CNY".equals(paramString))
    {
      paramString = "¥";
      AppMethodBeat.o(49268);
    }
    while (true)
    {
      return paramString;
      if ("ZAR".equals(paramString))
      {
        paramString = "R";
        AppMethodBeat.o(49268);
      }
      else if (("1".equals(paramString)) || (bo.isNullOrNil(paramString)))
      {
        paramString = com.tencent.mm.wallet_core.c.ae.dOd();
        AppMethodBeat.o(49268);
      }
      else
      {
        AppMethodBeat.o(49268);
      }
    }
  }

  public static String atr(String paramString)
  {
    AppMethodBeat.i(49271);
    if (("CNY".equals(paramString)) || ("1".equals(paramString)) || (bo.isNullOrNil(paramString)))
    {
      paramString = "¥";
      AppMethodBeat.o(49271);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(49271);
    }
  }

  public static boolean ats(String paramString)
  {
    AppMethodBeat.i(49281);
    boolean bool;
    if (!vrO.matcher(paramString).matches())
    {
      bool = false;
      AppMethodBeat.o(49281);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(49281);
    }
  }

  public static String att(String paramString)
  {
    AppMethodBeat.i(49282);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(49282);
    while (true)
    {
      return paramString;
      String str = "";
      for (int i = 0; i < paramString.length() - 1; i++)
        str = str + "*";
      paramString = str + paramString.substring(paramString.length() - 1, paramString.length());
      AppMethodBeat.o(49282);
    }
  }

  public static String atu(String paramString)
  {
    AppMethodBeat.i(49285);
    if ((paramString != null) && (paramString.length() > 8))
    {
      int i = paramString.length();
      String str = paramString.substring(0, i - 8);
      paramString = paramString.substring(i - 4);
      paramString = str + "****" + paramString;
      AppMethodBeat.o(49285);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(49285);
    }
  }

  public static String atv(String paramString)
  {
    AppMethodBeat.i(49286);
    if ((paramString != null) && (paramString.length() > 0))
    {
      String str = paramString.substring(1, paramString.length());
      ab.d("MicroMsg.WalletBaseUtil ", "tail : ".concat(String.valueOf(str)));
      paramString = paramString.substring(0, 1);
      ab.d("MicroMsg.WalletBaseUtil ", "head : ".concat(String.valueOf(paramString)));
      ab.d("MicroMsg.WalletBaseUtil ", "after : ".concat(String.valueOf(paramString)));
      paramString = "*".concat(String.valueOf(str));
      AppMethodBeat.o(49286);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(49286);
    }
  }

  public static String atw(String paramString)
  {
    AppMethodBeat.i(49287);
    if ((paramString != null) && (paramString.length() >= 2))
    {
      paramString = "**".concat(String.valueOf(paramString.substring(paramString.length() - 1, paramString.length())));
      AppMethodBeat.o(49287);
    }
    while (true)
    {
      return paramString;
      paramString = atv(paramString);
      AppMethodBeat.o(49287);
    }
  }

  public static String atx(String paramString)
  {
    AppMethodBeat.i(49296);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = "";
      AppMethodBeat.o(49296);
    }
    while (true)
    {
      return paramString;
      StringBuilder localStringBuilder = new StringBuilder();
      int i = paramString.length() / 4;
      for (int j = 0; j < i + 1; j++)
      {
        int k = Math.min((j + 1) * 4, paramString.length());
        localStringBuilder.append(ix(paramString.substring(j * 4, k), ""));
        if (k - j * 4 == 4)
          for (k = 0; k < 4; k++)
            localStringBuilder.append(" ");
      }
      paramString = localStringBuilder.toString();
      AppMethodBeat.o(49296);
    }
  }

  public static String aty(String paramString)
  {
    AppMethodBeat.i(49297);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = "";
      AppMethodBeat.o(49297);
    }
    while (true)
    {
      return paramString;
      StringBuilder localStringBuilder = new StringBuilder();
      int i = paramString.length() / 4;
      for (int j = 0; j < i; j++)
      {
        int k = Math.min((j + 1) * 4, paramString.length());
        int m = k;
        if (k + 4 > paramString.length())
          m = paramString.length();
        localStringBuilder.append(ix(paramString.substring(j * 4, m), " "));
        if (m - j * 4 == 4)
          for (m = 0; m < 6; m++)
            localStringBuilder.append(" ");
      }
      paramString = localStringBuilder.toString();
      AppMethodBeat.o(49297);
    }
  }

  private static int atz(String paramString)
  {
    AppMethodBeat.i(49306);
    int i;
    if ("1".equals(paramString))
    {
      i = 0;
      AppMethodBeat.o(49306);
    }
    while (true)
    {
      return i;
      if ("2".equals(paramString))
      {
        i = 4;
        AppMethodBeat.o(49306);
      }
      else if ("3".equals(paramString))
      {
        i = 12;
        AppMethodBeat.o(49306);
      }
      else if ("4".equals(paramString))
      {
        i = 2;
        AppMethodBeat.o(49306);
      }
      else if ("5".equals(paramString))
      {
        i = 8;
        AppMethodBeat.o(49306);
      }
      else if ("6".equals(paramString))
      {
        i = 14;
        AppMethodBeat.o(49306);
      }
      else if ("7".equals(paramString))
      {
        i = 16;
        AppMethodBeat.o(49306);
      }
      else if ("8".equals(paramString))
      {
        i = 10;
        AppMethodBeat.o(49306);
      }
      else
      {
        i = -1;
        AppMethodBeat.o(49306);
      }
    }
  }

  public static double b(String paramString1, String paramString2, RoundingMode paramRoundingMode)
  {
    AppMethodBeat.i(49313);
    double d = a(paramString1, paramString2, 2, paramRoundingMode).doubleValue();
    AppMethodBeat.o(49313);
    return d;
  }

  public static BigDecimal b(String paramString1, String paramString2, int paramInt, RoundingMode paramRoundingMode)
  {
    AppMethodBeat.i(49318);
    try
    {
      double d1 = bo.getDouble(paramString1, 0.0D);
      double d2 = bo.getDouble(paramString2, 0.0D);
      BigDecimal localBigDecimal1 = new java/math/BigDecimal;
      BigDecimal localBigDecimal2;
      if (d1 == 0.0D)
      {
        paramString1 = "0";
        localBigDecimal1.<init>(paramString1);
        localBigDecimal2 = new java/math/BigDecimal;
        if (d2 != 0.0D)
          break label93;
      }
      label93: for (paramString1 = "0"; ; paramString1 = paramString2.trim())
      {
        localBigDecimal2.<init>(paramString1);
        paramString1 = localBigDecimal1.multiply(localBigDecimal2).setScale(paramInt, paramRoundingMode);
        AppMethodBeat.o(49318);
        return paramString1;
        paramString1 = paramString1.trim();
        break;
      }
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.WalletBaseUtil ", paramString1, "", new Object[0]);
        paramString1 = new BigDecimal(0);
        AppMethodBeat.o(49318);
      }
    }
  }

  public static Typeface bT(Context paramContext, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(49264);
    int j = -1;
    switch (paramString.hashCode())
    {
    default:
      switch (j)
      {
      default:
      case 0:
      case 1:
      }
      break;
    case 1865844108:
    case 2006592631:
    }
    for (i = 8; ; i = 4)
    {
      paramContext = aA(paramContext, i);
      AppMethodBeat.o(49264);
      return paramContext;
      if (!paramString.equals("sans_ss"))
        break;
      j = 0;
      break;
      if (!paramString.equals("sans_std"))
        break;
      j = 1;
      break;
    }
  }

  public static void bU(Context paramContext, String paramString)
  {
    AppMethodBeat.i(49291);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(49291);
    while (true)
    {
      return;
      paramString = new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(String.valueOf(paramString))));
      paramString.addFlags(268435456);
      paramContext.startActivity(paramString);
      AppMethodBeat.o(49291);
    }
  }

  public static void bV(Context paramContext, String paramString)
  {
    AppMethodBeat.i(49302);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("pay_channel", 1);
    com.tencent.mm.bp.d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(49302);
  }

  public static double c(String paramString1, String paramString2, RoundingMode paramRoundingMode)
  {
    AppMethodBeat.i(49315);
    double d = b(paramString1, paramString2, 2, paramRoundingMode).doubleValue();
    AppMethodBeat.o(49315);
    return d;
  }

  public static void d(TextView paramTextView, String paramString)
  {
    AppMethodBeat.i(49311);
    paramString = eL(paramString, 10);
    paramTextView.setText(com.tencent.mm.pluginsdk.ui.e.j.b(paramTextView.getContext(), paramString, paramTextView.getTextSize()));
    AppMethodBeat.o(49311);
  }

  public static void d(MMActivity paramMMActivity, String paramString)
  {
    AppMethodBeat.i(49289);
    Intent localIntent = new Intent();
    localIntent.putExtra("BaseScanUI_select_scan_mode", 7);
    localIntent.putExtra("bank_card_owner", paramString);
    com.tencent.mm.bp.d.b(paramMMActivity, "scanner", ".ui.BaseScanUI", localIntent);
    AppMethodBeat.o(49289);
  }

  public static void dOJ()
  {
  }

  public static void dOK()
  {
    AppMethodBeat.i(49295);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(new bk(new e.4()), 0);
    AppMethodBeat.o(49295);
  }

  public static boolean dOL()
  {
    AppMethodBeat.i(49319);
    l locall = (l)com.tencent.mm.kernel.g.K(l.class);
    boolean bool1;
    if (locall == null)
    {
      ab.w("MicroMsg.WalletBaseUtil ", "bio no finger mgr!");
      AppMethodBeat.o(49319);
      bool1 = false;
    }
    while (true)
    {
      return bool1;
      bool1 = locall.bxo();
      boolean bool2 = locall.bxB();
      ab.i("MicroMsg.WalletBaseUtil ", "has fp: %s, has faceid: %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((bool1) || (bool2))
      {
        AppMethodBeat.o(49319);
        bool1 = true;
      }
      else
      {
        AppMethodBeat.o(49319);
        bool1 = false;
      }
    }
  }

  public static String e(double paramDouble, String paramString)
  {
    AppMethodBeat.i(49267);
    if ("CNY".equals(paramString))
    {
      paramString = String.format("¥%.2f", new Object[] { Double.valueOf(paramDouble) });
      AppMethodBeat.o(49267);
    }
    while (true)
    {
      return paramString;
      if ("ZAR".equals(paramString))
      {
        paramString = String.format("R%.2f", new Object[] { Double.valueOf(paramDouble) });
        AppMethodBeat.o(49267);
      }
      else if (("1".equals(paramString)) || (bo.isNullOrNil(paramString)))
      {
        paramString = String.format(com.tencent.mm.wallet_core.c.ae.dOd() + "%.2f", new Object[] { Double.valueOf(paramDouble) });
        AppMethodBeat.o(49267);
      }
      else
      {
        paramString = String.format(paramString + "%.2f", new Object[] { Double.valueOf(paramDouble) });
        AppMethodBeat.o(49267);
      }
    }
  }

  public static String eK(String paramString, int paramInt)
  {
    AppMethodBeat.i(49309);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(49309);
    while (true)
    {
      return paramString;
      if (paramString.length() > paramInt)
      {
        paramString = paramString.substring(0, paramInt) + "...";
        AppMethodBeat.o(49309);
      }
      else
      {
        AppMethodBeat.o(49309);
      }
    }
  }

  public static String eL(String paramString, int paramInt)
  {
    AppMethodBeat.i(49310);
    paramString = eK(mJ(paramString), paramInt);
    AppMethodBeat.o(49310);
    return paramString;
  }

  public static Typeface ex(Context paramContext)
  {
    AppMethodBeat.i(49263);
    paramContext = aA(paramContext, 4);
    AppMethodBeat.o(49263);
    return paramContext;
  }

  public static String getUsername()
  {
    AppMethodBeat.i(49284);
    com.tencent.mm.kernel.g.RN().QU();
    String str = r.Yz();
    AppMethodBeat.o(49284);
    return str;
  }

  public static void iu(Context paramContext)
  {
    AppMethodBeat.i(49279);
    if (paramContext == null)
    {
      ab.e("MicroMsg.WalletBaseUtil ", "hy: jump to preference error. context is null");
      AppMethodBeat.o(49279);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.addFlags(67108864);
      localIntent.putExtra("preferred_tab", 3);
      com.tencent.mm.bp.d.f(paramContext, "com.tencent.mm.ui.LauncherUI", localIntent);
      AppMethodBeat.o(49279);
    }
  }

  private static String ix(String paramString1, String paramString2)
  {
    AppMethodBeat.i(49301);
    if (TextUtils.isEmpty(paramString1))
    {
      paramString1 = "";
      AppMethodBeat.o(49301);
    }
    while (true)
    {
      return paramString1;
      StringBuilder localStringBuilder = new StringBuilder();
      for (int i = 0; i < paramString1.length(); i++)
      {
        localStringBuilder.append(paramString1.substring(i, i + 1));
        if (i != paramString1.length() - 1)
          localStringBuilder.append(paramString2);
      }
      paramString1 = localStringBuilder.toString();
      AppMethodBeat.o(49301);
    }
  }

  public static int iy(String paramString1, String paramString2)
  {
    AppMethodBeat.i(49316);
    int i = b(paramString1, paramString2, 0, RoundingMode.HALF_UP).intValue();
    AppMethodBeat.o(49316);
    return i;
  }

  public static long iz(String paramString1, String paramString2)
  {
    AppMethodBeat.i(49317);
    long l = b(paramString1, paramString2, 0, RoundingMode.HALF_UP).longValue();
    AppMethodBeat.o(49317);
    return l;
  }

  public static String kC(int paramInt)
  {
    AppMethodBeat.i(49272);
    if (kIy == null)
      kIy = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String str = kIy.format(new Date(paramInt * 1000L));
    AppMethodBeat.o(49272);
    return str;
  }

  public static String mJ(String paramString)
  {
    AppMethodBeat.i(49290);
    com.tencent.mm.kernel.g.RQ();
    Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoN(paramString);
    if (localObject != null);
    for (localObject = ((com.tencent.mm.n.a)localObject).Oj(); ; localObject = null)
    {
      if (bo.isNullOrNil((String)localObject));
      while (true)
      {
        AppMethodBeat.o(49290);
        return paramString;
        paramString = (String)localObject;
      }
    }
  }

  public static void n(Context paramContext, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(49276);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", paramBoolean);
    com.tencent.mm.bp.d.b(paramContext, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(49276);
  }

  public static boolean n(JSONObject paramJSONObject, String paramString)
  {
    AppMethodBeat.i(49283);
    boolean bool = "1".equals(paramJSONObject.optString(paramString, "0"));
    AppMethodBeat.o(49283);
    return bool;
  }

  public static void p(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(49324);
    se localse = new se();
    localse.cOf.userName = paramString1;
    localse.cOf.cOh = bo.bc(paramString2, "");
    localse.cOf.axy = paramInt1;
    localse.cOf.scene = paramInt2;
    localse.cOf.cOi = 0;
    com.tencent.mm.sdk.b.a.xxA.m(localse);
    AppMethodBeat.o(49324);
  }

  public static void setNoSystemInputOnEditText(EditText paramEditText)
  {
    AppMethodBeat.i(49266);
    if (Build.VERSION.SDK_INT < 11)
    {
      paramEditText.setInputType(0);
      AppMethodBeat.o(49266);
    }
    while (true)
    {
      return;
      try
      {
        Method localMethod1 = EditText.class.getMethod("setShowSoftInputOnFocus", new Class[] { Boolean.TYPE });
        localMethod1.setAccessible(false);
        localMethod1.invoke(paramEditText, new Object[] { Boolean.FALSE });
        AppMethodBeat.o(49266);
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        ab.e("erik", "setShowSoftInputOnFocus exception!");
        try
        {
          Method localMethod2 = EditText.class.getMethod("setSoftInputShownOnFocus", new Class[] { Boolean.TYPE });
          localMethod2.setAccessible(false);
          localMethod2.invoke(paramEditText, new Object[] { Boolean.FALSE });
          AppMethodBeat.o(49266);
        }
        catch (Exception localException)
        {
          paramEditText.setInputType(0);
          ab.printErrStackTrace("MicroMsg.WalletBaseUtil ", localException, "", new Object[0]);
          AppMethodBeat.o(49266);
        }
      }
      catch (Exception paramEditText)
      {
        ab.printErrStackTrace("MicroMsg.WalletBaseUtil ", paramEditText, "", new Object[0]);
        AppMethodBeat.o(49266);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.e
 * JD-Core Version:    0.6.2
 */