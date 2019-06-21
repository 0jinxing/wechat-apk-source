package com.google.android.exoplayer2.i;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.exoplayer2.h.f;
import com.google.android.exoplayer2.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class v
{
  public static final String DEVICE;
  public static final String MANUFACTURER;
  public static final String MODEL;
  public static final int SDK_INT;
  public static final String brM;
  private static final Pattern brN;
  private static final Pattern brO;
  private static final Pattern brP;
  private static final int[] brQ;

  static
  {
    AppMethodBeat.i(95975);
    if ((Build.VERSION.SDK_INT == 25) && (Build.VERSION.CODENAME.charAt(0) == 'O'));
    for (int i = 26; ; i = Build.VERSION.SDK_INT)
    {
      SDK_INT = i;
      DEVICE = Build.DEVICE;
      MANUFACTURER = Build.MANUFACTURER;
      MODEL = Build.MODEL;
      brM = DEVICE + ", " + MODEL + ", " + MANUFACTURER + ", " + SDK_INT;
      brN = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
      brO = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
      brP = Pattern.compile("%([A-Fa-f0-9]{2})");
      brQ = new int[] { 0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108 };
      AppMethodBeat.o(95975);
      return;
    }
  }

  public static <T> int a(List<? extends Comparable<? super T>> paramList, T paramT, boolean paramBoolean)
  {
    AppMethodBeat.i(95966);
    int i = Collections.binarySearch(paramList, paramT);
    int j = i;
    if (i < 0)
    {
      j = -(i + 2);
      if (!paramBoolean)
        break label80;
      j = Math.max(0, j);
      AppMethodBeat.o(95966);
    }
    while (true)
    {
      return j;
      do
        j--;
      while ((j >= 0) && (((Comparable)paramList.get(j)).compareTo(paramT) == 0));
      j++;
      break;
      label80: AppMethodBeat.o(95966);
    }
  }

  public static int a(long[] paramArrayOfLong, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(95964);
    int i = Arrays.binarySearch(paramArrayOfLong, paramLong);
    int j = i;
    if (i < 0)
    {
      j = -(i + 2);
      if (!paramBoolean)
        break label83;
      j = Math.max(0, j);
      AppMethodBeat.o(95964);
    }
    while (true)
    {
      return j;
      do
      {
        i = j - 1;
        if (i < 0)
          break;
        j = i;
      }
      while (paramArrayOfLong[i] == paramLong);
      j = i + 1;
      break;
      label83: AppMethodBeat.o(95964);
    }
  }

  public static int a(long[] paramArrayOfLong, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(95965);
    int i = Arrays.binarySearch(paramArrayOfLong, paramLong);
    int j = i;
    if (i < 0)
    {
      j = i ^ 0xFFFFFFFF;
      if (!paramBoolean2)
        break label96;
      j = Math.min(paramArrayOfLong.length - 1, j);
      AppMethodBeat.o(95965);
    }
    while (true)
    {
      return j;
      do
      {
        i = j + 1;
        if (i >= paramArrayOfLong.length)
          break;
        j = i;
      }
      while (paramArrayOfLong[i] == paramLong);
      j = i;
      if (!paramBoolean1)
        break;
      j = i - 1;
      break;
      label96: AppMethodBeat.o(95965);
    }
  }

  public static void a(f paramf)
  {
    AppMethodBeat.i(95956);
    if (paramf != null);
    try
    {
      paramf.close();
      AppMethodBeat.o(95956);
      return;
    }
    catch (IOException paramf)
    {
      while (true)
        AppMethodBeat.o(95956);
    }
  }

  public static void a(long[] paramArrayOfLong, long paramLong)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    if ((paramLong >= 1000000L) && (paramLong % 1000000L == 0L))
      paramLong /= 1000000L;
    while (k < paramArrayOfLong.length)
    {
      paramArrayOfLong[k] /= paramLong;
      k++;
      continue;
      if ((paramLong < 1000000L) && (1000000L % paramLong == 0L))
      {
        paramLong = 1000000L / paramLong;
        k = i;
      }
      while (k < paramArrayOfLong.length)
      {
        paramArrayOfLong[k] *= paramLong;
        k++;
        continue;
        double d = 1000000.0D / paramLong;
        for (k = j; k < paramArrayOfLong.length; k++)
          paramArrayOfLong[k] = (()(paramArrayOfLong[k] * d));
      }
    }
  }

  public static ExecutorService aO(String paramString)
  {
    AppMethodBeat.i(95955);
    paramString = Executors.newSingleThreadExecutor(new v.1(paramString));
    AppMethodBeat.o(95955);
    return paramString;
  }

  public static String aP(String paramString)
  {
    AppMethodBeat.i(95958);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(95958);
    }
    while (true)
    {
      return paramString;
      paramString = new Locale(paramString).getLanguage();
      AppMethodBeat.o(95958);
    }
  }

  public static byte[] aQ(String paramString)
  {
    AppMethodBeat.i(95959);
    paramString = paramString.getBytes(Charset.forName("UTF-8"));
    AppMethodBeat.o(95959);
    return paramString;
  }

  public static String aR(String paramString)
  {
    AppMethodBeat.i(95960);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(95960);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.toLowerCase(Locale.US);
      AppMethodBeat.o(95960);
    }
  }

  public static long aS(String paramString)
  {
    AppMethodBeat.i(95967);
    Matcher localMatcher = brN.matcher(paramString);
    if (!localMatcher.matches())
    {
      paramString = new o("Invalid date/time format: ".concat(String.valueOf(paramString)));
      AppMethodBeat.o(95967);
      throw paramString;
    }
    int i;
    if (localMatcher.group(9) == null)
      i = 0;
    while (true)
    {
      paramString = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
      paramString.clear();
      paramString.set(Integer.parseInt(localMatcher.group(1)), Integer.parseInt(localMatcher.group(2)) - 1, Integer.parseInt(localMatcher.group(3)), Integer.parseInt(localMatcher.group(4)), Integer.parseInt(localMatcher.group(5)), Integer.parseInt(localMatcher.group(6)));
      if (!TextUtils.isEmpty(localMatcher.group(8)))
        paramString.set(14, new BigDecimal("0." + localMatcher.group(8)).movePointRight(3).intValue());
      long l1 = paramString.getTimeInMillis();
      long l2 = l1;
      if (i != 0)
        l2 = l1 - 60000 * i;
      AppMethodBeat.o(95967);
      return l2;
      if (localMatcher.group(9).equalsIgnoreCase("Z"))
      {
        i = 0;
      }
      else
      {
        i = Integer.parseInt(localMatcher.group(12)) * 60 + Integer.parseInt(localMatcher.group(13));
        if (localMatcher.group(11).equals("-"))
          i *= -1;
      }
    }
  }

  public static int aT(String paramString)
  {
    AppMethodBeat.i(95969);
    int i = paramString.length();
    if (i <= 4);
    int k;
    for (boolean bool = true; ; bool = false)
    {
      a.checkArgument(bool);
      int j = 0;
      k = 0;
      while (j < i)
      {
        k = paramString.charAt(j) | k << 8;
        j++;
      }
    }
    AppMethodBeat.o(95969);
    return k;
  }

  public static byte[] aU(String paramString)
  {
    AppMethodBeat.i(95970);
    byte[] arrayOfByte = new byte[paramString.length() / 2];
    for (int i = 0; i < arrayOfByte.length; i++)
    {
      int j = i * 2;
      int k = Character.digit(paramString.charAt(j), 16);
      arrayOfByte[i] = ((byte)(byte)(Character.digit(paramString.charAt(j + 1), 16) + (k << 4)));
    }
    AppMethodBeat.o(95970);
    return arrayOfByte;
  }

  public static long b(long paramLong1, long paramLong2, long paramLong3)
  {
    if ((paramLong3 >= paramLong2) && (paramLong3 % paramLong2 == 0L))
      paramLong1 /= paramLong3 / paramLong2;
    while (true)
    {
      return paramLong1;
      if ((paramLong3 < paramLong2) && (paramLong2 % paramLong3 == 0L))
        paramLong1 = paramLong2 / paramLong3 * paramLong1;
      else
        paramLong1 = ()(paramLong2 / paramLong3 * paramLong1);
    }
  }

  public static int bi(int paramInt1, int paramInt2)
  {
    return (paramInt1 + paramInt2 - 1) / paramInt2;
  }

  public static int bj(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95973);
    switch (paramInt1)
    {
    default:
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException();
      AppMethodBeat.o(95973);
      throw localIllegalArgumentException;
    case 3:
      AppMethodBeat.o(95973);
    case 2:
    case -2147483648:
    case 1073741824:
    }
    while (true)
    {
      return paramInt2;
      paramInt2 *= 2;
      AppMethodBeat.o(95973);
      continue;
      paramInt2 *= 3;
      AppMethodBeat.o(95973);
      continue;
      paramInt2 *= 4;
      AppMethodBeat.o(95973);
    }
  }

  public static void closeQuietly(Closeable paramCloseable)
  {
    AppMethodBeat.i(95957);
    try
    {
      paramCloseable.close();
      AppMethodBeat.o(95957);
      return;
    }
    catch (IOException paramCloseable)
    {
      while (true)
        AppMethodBeat.o(95957);
    }
  }

  public static String d(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(95971);
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramArrayOfObject.length; i++)
    {
      localStringBuilder.append(paramArrayOfObject[i].getClass().getSimpleName());
      if (i < paramArrayOfObject.length - 1)
        localStringBuilder.append(", ");
    }
    paramArrayOfObject = localStringBuilder.toString();
    AppMethodBeat.o(95971);
    return paramArrayOfObject;
  }

  public static boolean eQ(int paramInt)
  {
    if ((paramInt == 10) || (paramInt == 13));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static int eR(int paramInt)
  {
    switch (paramInt)
    {
    default:
      paramInt = 0;
    case 8:
    case 16:
    case 24:
    case 32:
    }
    while (true)
    {
      return paramInt;
      paramInt = 3;
      continue;
      paramInt = 2;
      continue;
      paramInt = -2147483648;
      continue;
      paramInt = 1073741824;
    }
  }

  public static int eS(int paramInt)
  {
    int i = 3;
    int j = i;
    switch (paramInt)
    {
    default:
      j = i;
    case 1:
    case 11:
    case 12:
    case 14:
    case 13:
    case 2:
    case 3:
    case 4:
    case 6:
    case 5:
    case 7:
    case 8:
    case 9:
    case 10:
    }
    while (true)
    {
      return j;
      j = 1;
      continue;
      j = 0;
      continue;
      j = 8;
      continue;
      j = 4;
      continue;
      j = 2;
      continue;
      j = 5;
    }
  }

  public static int eT(int paramInt)
  {
    int i = 131072;
    AppMethodBeat.i(95974);
    switch (paramInt)
    {
    default:
      IllegalStateException localIllegalStateException = new IllegalStateException();
      AppMethodBeat.o(95974);
      throw localIllegalStateException;
    case 0:
      paramInt = 16777216;
      AppMethodBeat.o(95974);
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return paramInt;
      paramInt = 3538944;
      AppMethodBeat.o(95974);
      continue;
      paramInt = 13107200;
      AppMethodBeat.o(95974);
      continue;
      AppMethodBeat.o(95974);
      paramInt = i;
      continue;
      AppMethodBeat.o(95974);
      paramInt = i;
    }
  }

  public static float h(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    AppMethodBeat.i(95963);
    paramFloat1 = Math.max(paramFloat2, Math.min(paramFloat1, paramFloat3));
    AppMethodBeat.o(95963);
    return paramFloat1;
  }

  public static String i(Context paramContext, String paramString)
  {
    AppMethodBeat.i(95972);
    try
    {
      String str = paramContext.getPackageName();
      paramContext = paramContext.getPackageManager().getPackageInfo(str, 0).versionName;
      paramContext = paramString + "/" + paramContext + " (Linux;Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.5.4";
      AppMethodBeat.o(95972);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      while (true)
        paramContext = "?";
    }
  }

  public static boolean j(Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(95954);
    boolean bool;
    if (paramObject1 == null)
      if (paramObject2 == null)
      {
        bool = true;
        AppMethodBeat.o(95954);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(95954);
      continue;
      bool = paramObject1.equals(paramObject2);
      AppMethodBeat.o(95954);
    }
  }

  public static long l(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(95962);
    paramLong1 = Math.max(0L, Math.min(paramLong1, paramLong2));
    AppMethodBeat.o(95962);
    return paramLong1;
  }

  public static int m(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    for (int i = 0; i < paramInt1; i++)
      paramInt2 = paramInt2 << 8 ^ brQ[((paramInt2 >>> 24 ^ paramArrayOfByte[i] & 0xFF) & 0xFF)];
    return paramInt2;
  }

  public static boolean o(Uri paramUri)
  {
    AppMethodBeat.i(95953);
    paramUri = paramUri.getScheme();
    boolean bool;
    if ((TextUtils.isEmpty(paramUri)) || (paramUri.equals("file")))
    {
      bool = true;
      AppMethodBeat.o(95953);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(95953);
    }
  }

  public static int u(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(95961);
    paramInt1 = Math.max(paramInt2, Math.min(paramInt1, paramInt3));
    AppMethodBeat.o(95961);
    return paramInt1;
  }

  public static int[] z(List<Integer> paramList)
  {
    AppMethodBeat.i(95968);
    if (paramList == null)
    {
      paramList = null;
      AppMethodBeat.o(95968);
    }
    while (true)
    {
      return paramList;
      int i = paramList.size();
      int[] arrayOfInt = new int[i];
      for (int j = 0; j < i; j++)
        arrayOfInt[j] = ((Integer)paramList.get(j)).intValue();
      AppMethodBeat.o(95968);
      paramList = arrayOfInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.i.v
 * JD-Core Version:    0.6.2
 */