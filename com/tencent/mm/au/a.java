package com.tencent.mm.au;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;

public final class a
{
  public static int sK(String paramString)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(59950);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      ab.e("Big5Util", "getStrokesCount buffer is empty");
      AppMethodBeat.o(59950);
    }
    while (true)
    {
      return j;
      try
      {
        paramString = paramString.getBytes("big5");
        int k;
        if ((paramString == null) || (paramString.length < 2))
        {
          ab.e("Big5Util", "byteToShort");
          k = 0;
          label60: if ((k < 42048) || (k > 42049))
            break label126;
          j = 1;
        }
        while (true)
        {
          AppMethodBeat.o(59950);
          break;
          j = 0;
          k = 0;
          while (j < 2)
          {
            int m = (short)(k << 8);
            k = paramString[j];
            k = (short)(m | k & 0xFF);
            j++;
          }
          k = 0xFFFF & k;
          break label60;
          label126: if (((k >= 42050) && (k <= 42067)) || ((k >= 51520) && (k <= 51524)))
          {
            j = 2;
          }
          else if (((k >= 42068) && (k <= 42110)) || ((k >= 51525) && (k <= 51532)))
          {
            j = 3;
          }
          else if (((k >= 42145) && (k <= 42237)) || ((k >= 51533) && (k <= 51548)))
          {
            j = 4;
          }
          else if (((k >= 42238) && (k <= 42463)) || ((k >= 51549) && (k <= 51626)))
          {
            j = 5;
          }
          else if (((k >= 42464) && (k <= 42729)) || ((k >= 51627) && (k <= 51545)))
          {
            j = 6;
          }
          else if (((k >= 42730) && (k <= 43202)) || ((k >= 51802) && (k <= 52144)))
          {
            j = 7;
          }
          else if (((k >= 43203) && (k <= 43844)) || ((k >= 52145) && (k <= 52700)))
          {
            j = 8;
          }
          else if (((k >= 43845) && (k <= 44475)) || ((k >= 52701) && (k <= 53447)) || (k == 63962))
          {
            j = 9;
          }
          else if (((k >= 44476) && (k <= 45229)) || ((k >= 53448) && (k <= 54346)))
          {
            j = 10;
          }
          else if (((k >= 45230) && (k <= 46018)) || ((k >= 54347) && (k <= 55376)))
          {
            j = 11;
          }
          else if (((k >= 46019) && (k <= 46787)) || ((k >= 55377) && (k <= 56496)) || (k == 63963))
          {
            j = 12;
          }
          else if (((k >= 46788) && (k <= 47531)) || ((k >= 56497) && (k <= 57583)) || ((k >= 63958) && (k <= 63960)))
          {
            j = 13;
          }
          else if (((k >= 47532) && (k <= 48116)) || ((k >= 57584) && (k <= 58597)))
          {
            j = 14;
          }
          else if (((k >= 48117) && (k <= 48806)) || ((k >= 58598) && (k <= 59635)) || (k == 63964))
          {
            j = 15;
          }
          else if (((k >= 48807) && (k <= 49268)) || ((k >= 59636) && (k <= 60600)) || (k == 63961))
          {
            j = 16;
          }
          else if (((k >= 49269) && (k <= 49742)) || ((k >= 60601) && (k <= 61366)))
          {
            j = 17;
          }
          else if (((k >= 49743) && (k <= 50014)) || ((k >= 61367) && (k <= 61930)))
          {
            j = 18;
          }
          else if (((k >= 50015) && (k <= 50260)) || ((k >= 61931) && (k <= 62460)))
          {
            j = 19;
          }
          else if (((k >= 50261) && (k <= 50390)) || ((k >= 62461) && (k <= 62911)))
          {
            j = 20;
          }
          else if (((k >= 50135) && (k <= 50538)) || ((k >= 62912) && (k <= 63189)))
          {
            j = 21;
          }
          else if (((k >= 50539) && (k <= 50631)) || ((k >= 63190) && (k <= 63439)))
          {
            j = 22;
          }
          else if (((k >= 50632) && (k <= 50672)) || ((k >= 63440) && (k <= 63652)))
          {
            j = 23;
          }
          else if (((k >= 50673) && (k <= 50772)) || ((k >= 63653) && (k <= 63725)))
          {
            j = 24;
          }
          else if (((k >= 50773) && (k <= 50788)) || ((k >= 63721) && (k <= 63850)))
          {
            j = 25;
          }
          else if (((k >= 50789) && (k <= 50795)) || ((k >= 63906) && (k <= 63905)))
          {
            j = 26;
          }
          else if (((k >= 50796) && (k <= 50805)) || ((k >= 63190) && (k <= 63929)))
          {
            j = 27;
          }
          else if (((k >= 50806) && (k <= 50810)) || ((k >= 63930) && (k <= 63941)))
          {
            j = 28;
          }
          else if ((k < 50811) || (k > 50814))
          {
            j = i;
            if (k >= 63942)
            {
              j = i;
              if (k > 63957);
            }
          }
          else
          {
            j = 29;
          }
        }
      }
      catch (UnsupportedEncodingException paramString)
      {
        while (true)
        {
          ab.e("Big5Util", "exception:%s", new Object[] { bo.l(paramString) });
          j = i;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.au.a
 * JD-Core Version:    0.6.2
 */