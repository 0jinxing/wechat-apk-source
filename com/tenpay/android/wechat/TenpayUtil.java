package com.tenpay.android.wechat;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tenpay.ndk.Encrypt;
import java.lang.reflect.Field;
import java.security.MessageDigest;

public class TenpayUtil
{
  public static final int getResourceDeclareStyleableIndex(Context paramContext, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(49512);
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      for (localStringBuilder : Class.forName(paramContext.getPackageName() + ".R$styleable").getFields())
        if (localStringBuilder.getName().equals(paramString))
        {
          ??? = localStringBuilder.getInt(null);
          AppMethodBeat.o(49512);
          return ???;
        }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(49512);
        ??? = i;
      }
    }
  }

  public static final int[] getResourceDeclareStyleableIntArray(Context paramContext, String paramString)
  {
    AppMethodBeat.i(49511);
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      for (localStringBuilder : Class.forName(paramContext.getPackageName() + ".R$styleable").getFields())
        if (localStringBuilder.getName().equals(paramString))
        {
          paramContext = (int[])localStringBuilder.get(null);
          AppMethodBeat.o(49511);
          return paramContext;
        }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(49511);
        paramContext = null;
        continue;
        AppMethodBeat.o(49511);
        paramContext = null;
      }
    }
  }

  public static boolean invalidateID(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(49513);
    if (paramString == null)
      AppMethodBeat.o(49513);
    while (true)
    {
      return bool;
      if (paramString.length() != 18)
      {
        AppMethodBeat.o(49513);
      }
      else
      {
        int i = 0;
        int j = 0;
        try
        {
          while (i < paramString.length() - 1)
          {
            int k = bo.ank(paramString.substring(i, i + 1));
            int m = new int[] { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2 }[i];
            j += k * m;
            i++;
          }
        }
        catch (NumberFormatException paramString)
        {
          AppMethodBeat.o(49513);
        }
        continue;
        j %= 11;
        i = paramString.charAt(17);
        if (j == 2)
        {
          if ((i != 88) && (i != 120))
            AppMethodBeat.o(49513);
        }
        else if (i != new char[] { 49, 48, 88, 57, 56, 55, 54, 53, 52, 51, 50 }[j])
        {
          AppMethodBeat.o(49513);
        }
        else
        {
          bool = true;
          AppMethodBeat.o(49513);
        }
      }
    }
  }

  public static String md5HexDigest(String paramString)
  {
    AppMethodBeat.i(49510);
    char[] arrayOfChar = new char[16];
    char[] tmp11_10 = arrayOfChar;
    tmp11_10[0] = 48;
    char[] tmp16_11 = tmp11_10;
    tmp16_11[1] = 49;
    char[] tmp21_16 = tmp16_11;
    tmp21_16[2] = 50;
    char[] tmp26_21 = tmp21_16;
    tmp26_21[3] = 51;
    char[] tmp31_26 = tmp26_21;
    tmp31_26[4] = 52;
    char[] tmp36_31 = tmp31_26;
    tmp36_31[5] = 53;
    char[] tmp41_36 = tmp36_31;
    tmp41_36[6] = 54;
    char[] tmp47_41 = tmp41_36;
    tmp47_41[7] = 55;
    char[] tmp53_47 = tmp47_41;
    tmp53_47[8] = 56;
    char[] tmp59_53 = tmp53_47;
    tmp59_53[9] = 57;
    char[] tmp65_59 = tmp59_53;
    tmp65_59[10] = 65;
    char[] tmp71_65 = tmp65_59;
    tmp71_65[11] = 66;
    char[] tmp77_71 = tmp71_65;
    tmp77_71[12] = 67;
    char[] tmp83_77 = tmp77_71;
    tmp83_77[13] = 68;
    char[] tmp89_83 = tmp83_77;
    tmp89_83[14] = 69;
    char[] tmp95_89 = tmp89_83;
    tmp95_89[15] = 70;
    tmp95_89;
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramString.getBytes());
      paramString = ((MessageDigest)localObject).digest();
      localObject = new char[32];
      int i = 0;
      int m;
      for (int j = 0; i < 16; j = m + 1)
      {
        int k = paramString[i];
        m = j + 1;
        localObject[j] = ((char)arrayOfChar[(k >>> 4 & 0xF)]);
        localObject[m] = ((char)arrayOfChar[(k & 0xF)]);
        i++;
      }
      paramString = new java/lang/String;
      paramString.<init>((char[])localObject);
      AppMethodBeat.o(49510);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
        paramString = null;
    }
  }

  public static String signWith3Des(String paramString)
  {
    AppMethodBeat.i(49509);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(49509);
    }
    while (true)
    {
      return paramString;
      paramString = md5HexDigest(paramString);
      paramString = new Encrypt().desedeEncode(paramString);
      AppMethodBeat.o(49509);
    }
  }

  public static byte[] sm4DecryptCBC(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    AppMethodBeat.i(49508);
    if (paramArrayOfByte1 == null)
    {
      paramArrayOfByte1 = null;
      AppMethodBeat.o(49508);
    }
    while (true)
    {
      return paramArrayOfByte1;
      paramArrayOfByte1 = new Encrypt().sm4BCDDecryptCBC(paramArrayOfByte1, paramArrayOfByte2, paramArrayOfByte3);
      AppMethodBeat.o(49508);
    }
  }

  public static byte[] sm4EncryptCBC(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    AppMethodBeat.i(49507);
    if (paramArrayOfByte1 == null)
    {
      paramArrayOfByte1 = null;
      AppMethodBeat.o(49507);
    }
    while (true)
    {
      return paramArrayOfByte1;
      paramArrayOfByte1 = new Encrypt().sm4BCDEncryptCBC(paramArrayOfByte1, paramArrayOfByte2, paramArrayOfByte3);
      AppMethodBeat.o(49507);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tenpay.android.wechat.TenpayUtil
 * JD-Core Version:    0.6.2
 */