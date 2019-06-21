package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class g
{
  public int sOC = 0;

  public static byte[] F(InputStream paramInputStream)
  {
    int i = 0;
    AppMethodBeat.i(4355);
    Object localObject = new ByteArrayOutputStream();
    paramInputStream = new j(paramInputStream, (OutputStream)localObject);
    paramInputStream.FY(8);
    paramInputStream.FY(8);
    paramInputStream.FY(8);
    paramInputStream.FY(8);
    paramInputStream.FY(8);
    int j = (int)paramInputStream.cIx();
    paramInputStream.FY(8);
    paramInputStream.cIx();
    paramInputStream.cIB();
    if ((j == 100) || (j == 110) || (j == 122) || (j == 144))
    {
      if (paramInputStream.cIA() == 3)
        paramInputStream.FY(1);
      paramInputStream.cIB();
      paramInputStream.cIB();
      paramInputStream.FY(1);
      if (paramInputStream.ml(true))
      {
        j = 0;
        if (j < 8)
        {
          if (paramInputStream.ml(true))
          {
            if (j >= 6)
              break label170;
            paramInputStream.FZ(16);
          }
          while (true)
          {
            j++;
            break;
            label170: paramInputStream.FZ(64);
          }
        }
      }
    }
    paramInputStream.cIB();
    j = paramInputStream.cIA();
    if (j == 0)
    {
      paramInputStream.cIB();
      paramInputStream.cIB();
      paramInputStream.FY(1);
      paramInputStream.cIB();
      paramInputStream.cIB();
      if (!paramInputStream.ml(true))
        paramInputStream.FY(1);
      paramInputStream.FY(1);
      if (paramInputStream.ml(true))
      {
        paramInputStream.cIB();
        paramInputStream.cIB();
        paramInputStream.cIB();
        paramInputStream.cIB();
      }
      if (!paramInputStream.ml(false))
        break label725;
      ab.d("[H264SPSModifier]", "vui_parameters_present_flag exist!! modify max_dec_frame_buffering");
      paramInputStream.mn(true);
      if ((paramInputStream.ml(true)) && ((int)paramInputStream.cIx() == 255))
      {
        paramInputStream.FY(16);
        paramInputStream.FY(16);
      }
      if (paramInputStream.ml(true))
        paramInputStream.FY(1);
      if (paramInputStream.ml(true))
      {
        paramInputStream.FY(3);
        paramInputStream.FY(1);
        if (paramInputStream.ml(true))
        {
          paramInputStream.FY(8);
          paramInputStream.FY(8);
          paramInputStream.FY(8);
        }
      }
      if (paramInputStream.ml(true))
      {
        paramInputStream.cIB();
        paramInputStream.cIB();
      }
      if (paramInputStream.ml(true))
      {
        paramInputStream.FY(32);
        paramInputStream.FY(32);
        paramInputStream.FY(1);
      }
      boolean bool1 = paramInputStream.ml(true);
      if (bool1)
        a(paramInputStream);
      boolean bool2 = paramInputStream.ml(true);
      if (bool2)
        a(paramInputStream);
      if ((bool1) || (bool2))
        paramInputStream.FY(1);
      paramInputStream.FY(1);
      if (!paramInputStream.ml(false))
        break label673;
      ab.d("TAG", "steve:VUI has bs restriction!!");
      paramInputStream.mn(true);
      paramInputStream.ml(true);
      paramInputStream.cIB();
      paramInputStream.cIB();
      paramInputStream.cIB();
      paramInputStream.cIB();
      paramInputStream.cIB();
      paramInputStream.Gc(1);
    }
    byte[] arrayOfByte;
    while (true)
    {
      paramInputStream.Ga(1);
      paramInputStream.G(0L, 8 - paramInputStream.sOK);
      paramInputStream.flush();
      arrayOfByte = ((ByteArrayOutputStream)localObject).toByteArray();
      paramInputStream = "";
      for (j = i; j < arrayOfByte.length; j++)
      {
        String str = Integer.toHexString(arrayOfByte[j] & 0xFF);
        localObject = str;
        if (str.length() == 1)
          localObject = "0".concat(String.valueOf(str));
        paramInputStream = paramInputStream + " " + (String)localObject;
      }
      if (j != 1)
        break;
      paramInputStream.FY(1);
      paramInputStream.cIB();
      paramInputStream.cIB();
      int k = paramInputStream.cIA();
      for (j = 0; j < k; j++)
      {
        new StringBuilder("SPS: offsetForRefFrame [").append(j).append("]");
        paramInputStream.cIB();
      }
      break;
      label673: ab.d("TAG", "steve:VUI has NO bs restriction!!");
      paramInputStream.mn(true);
      paramInputStream.mn(true);
      paramInputStream.Gc(0);
      paramInputStream.Gc(0);
      paramInputStream.Gc(10);
      paramInputStream.Gc(10);
      paramInputStream.Gc(0);
      paramInputStream.Gc(1);
      continue;
      label725: ab.d("[H264SPSModifier]", "vui_parameters_present_flag NOT exist!! add max_dec_frame_buffering");
      paramInputStream.mn(true);
      paramInputStream.mn(false);
      paramInputStream.mn(false);
      paramInputStream.mn(false);
      paramInputStream.mn(false);
      paramInputStream.mn(false);
      paramInputStream.mn(false);
      paramInputStream.mn(false);
      paramInputStream.mn(false);
      paramInputStream.mn(true);
      paramInputStream.mn(true);
      paramInputStream.Gc(0);
      paramInputStream.Gc(0);
      paramInputStream.Gc(10);
      paramInputStream.Gc(10);
      paramInputStream.Gc(0);
      paramInputStream.Gc(1);
    }
    ab.d("TAG", "new SPS:".concat(String.valueOf(paramInputStream)));
    AppMethodBeat.o(4355);
    return arrayOfByte;
  }

  private static void a(j paramj)
  {
    AppMethodBeat.i(4357);
    int i = paramj.cIA();
    paramj.FX(4);
    paramj.FX(4);
    for (int j = 0; j <= i; j++)
    {
      paramj.cIz();
      paramj.cIz();
      paramj.FX(1);
    }
    paramj.FX(5);
    paramj.FX(5);
    paramj.FX(5);
    paramj.FX(5);
    AppMethodBeat.o(4357);
  }

  public final boolean G(InputStream paramInputStream)
  {
    boolean bool1 = false;
    AppMethodBeat.i(4356);
    paramInputStream = new j(paramInputStream);
    paramInputStream.FX(8);
    paramInputStream.FX(8);
    paramInputStream.FX(8);
    paramInputStream.FX(8);
    paramInputStream.FX(8);
    int i = (int)paramInputStream.cIx();
    if (i == 66)
    {
      this.sOC |= 1;
      AppMethodBeat.o(4356);
    }
    while (true)
    {
      return bool1;
      paramInputStream.FX(8);
      paramInputStream.cIx();
      paramInputStream.cIz();
      if ((i == 100) || (i == 110) || (i == 122) || (i == 144))
      {
        if (paramInputStream.cIA() == 3)
          paramInputStream.FX(1);
        paramInputStream.cIz();
        paramInputStream.cIz();
        paramInputStream.FX(1);
        if (paramInputStream.ml(true))
        {
          i = 0;
          if (i < 8)
          {
            if (paramInputStream.ml(true))
            {
              if (i >= 6)
                break label185;
              paramInputStream.FZ(16);
            }
            while (true)
            {
              i++;
              break;
              label185: paramInputStream.FZ(64);
            }
          }
        }
      }
      paramInputStream.cIz();
      i = paramInputStream.cIA();
      if (i == 0)
        paramInputStream.cIz();
      while (true)
      {
        if (paramInputStream.cIA() >= 2)
          this.sOC |= 2;
        paramInputStream.FY(1);
        paramInputStream.cIB();
        paramInputStream.cIB();
        if (!paramInputStream.ml(true))
          paramInputStream.FY(1);
        paramInputStream.FY(1);
        if (paramInputStream.ml(true))
        {
          paramInputStream.cIB();
          paramInputStream.cIB();
          paramInputStream.cIB();
          paramInputStream.cIB();
        }
        if (!paramInputStream.ml(true))
          break label639;
        ab.d("[H264SPSModifier]", "vui_parameters_present_flag exist!! read num_reorder_frames");
        if ((paramInputStream.ml(true)) && ((int)paramInputStream.cIx() == 255))
        {
          paramInputStream.FY(16);
          paramInputStream.FY(16);
        }
        if (paramInputStream.ml(true))
          paramInputStream.FY(1);
        if (paramInputStream.ml(true))
        {
          paramInputStream.FY(3);
          paramInputStream.FY(1);
          if (paramInputStream.ml(true))
          {
            paramInputStream.FY(8);
            paramInputStream.FY(8);
            paramInputStream.FY(8);
          }
        }
        if (paramInputStream.ml(true))
        {
          paramInputStream.cIB();
          paramInputStream.cIB();
        }
        if (paramInputStream.ml(true))
        {
          paramInputStream.FY(32);
          paramInputStream.FY(32);
          paramInputStream.FY(1);
        }
        boolean bool2 = paramInputStream.ml(true);
        if (bool2)
          a(paramInputStream);
        boolean bool3 = paramInputStream.ml(true);
        if (bool3)
          a(paramInputStream);
        if ((bool2) || (bool3))
          paramInputStream.FY(1);
        paramInputStream.FY(1);
        if (!paramInputStream.ml(true))
          break label639;
        paramInputStream.ml(true);
        paramInputStream.cIB();
        paramInputStream.cIB();
        paramInputStream.cIB();
        paramInputStream.cIB();
        int j = paramInputStream.cIA();
        i = paramInputStream.cIA();
        if (j == 0)
          break label639;
        ab.d("[H264SPSModifier]", "steve: reorder_frame =" + j + ", mac_dec_buffering=" + i);
        this.sOC |= 4;
        AppMethodBeat.o(4356);
        bool1 = true;
        break;
        if (i == 1)
        {
          paramInputStream.FX(1);
          paramInputStream.cIz();
          paramInputStream.cIz();
          j = paramInputStream.cIA();
          for (i = 0; i < j; i++)
          {
            new StringBuilder("SPS: offsetForRefFrame [").append(i).append("]");
            paramInputStream.cIB();
          }
        }
      }
      label639: AppMethodBeat.o(4356);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.g
 * JD-Core Version:    0.6.2
 */