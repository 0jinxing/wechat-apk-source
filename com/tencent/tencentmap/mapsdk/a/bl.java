package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.ic;

public class bl
{
  private final String a = "marker_default.png";
  private int b = -1;
  private int c = -1;
  private String d = "";
  private String e = "";
  private String f = "";
  private float g = -1.0F;
  private Bitmap h = null;
  private String i = null;

  public bl(int paramInt)
  {
    this.b = paramInt;
  }

  private String a(float paramFloat)
  {
    String str = null;
    if (paramFloat < 30.0F)
      str = "RED.png";
    while (true)
    {
      return str;
      if ((paramFloat >= 30.0F) && (paramFloat < 60.0F))
        str = "ORANGE.png";
      else if ((paramFloat >= 60.0F) && (paramFloat < 120.0F))
        str = "YELLOW.png";
      else if ((paramFloat >= 120.0F) && (paramFloat < 180.0F))
        str = "GREEN.png";
      else if ((paramFloat >= 180.0F) && (paramFloat < 210.0F))
        str = "CYAN.png";
      else if ((paramFloat >= 210.0F) && (paramFloat < 240.0F))
        str = "AZURE.png";
      else if ((paramFloat >= 240.0F) && (paramFloat < 270.0F))
        str = "BLUE.png";
      else if ((paramFloat >= 270.0F) && (paramFloat < 300.0F))
        str = "VIOLET.png";
      else if ((paramFloat >= 300.0F) && (paramFloat < 330.0F))
        str = "MAGENTAV.png";
      else if (paramFloat >= 330.0F)
        str = "ROSE.png";
    }
  }

  private String b(Bitmap paramBitmap)
  {
    AppMethodBeat.i(100839);
    String str1 = paramBitmap.toString();
    String str2 = str1;
    if (str1 == null)
      str2 = "";
    str2 = str2.replace("android.graphics.Bitmap", "");
    int j = paramBitmap.getWidth();
    int k = paramBitmap.getHeight();
    str2 = str2 + "@" + paramBitmap.hashCode() + "@" + j + "@" + k + "@" + paramBitmap.getRowBytes();
    paramBitmap = str2 + "@" + paramBitmap.getPixel(j / 2, k / 2);
    AppMethodBeat.o(100839);
    return paramBitmap;
  }

  public Bitmap a(Context paramContext)
  {
    AppMethodBeat.i(100840);
    if ((this.h != null) && (this.i != null))
    {
      paramContext = this.h;
      AppMethodBeat.o(100840);
    }
    while (true)
    {
      return paramContext;
      if (paramContext != null)
        break;
      paramContext = null;
      AppMethodBeat.o(100840);
    }
    switch (this.b)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      paramContext = this.h;
      AppMethodBeat.o(100840);
      break;
      this.i = ("res_" + this.c);
      if (ic.t != null)
        this.h = ic.t.a(this.i);
      if (this.h == null)
      {
        this.h = ic.a(paramContext, this.c);
        if ((ic.t != null) && (this.h != null))
        {
          ic.t.a(this.i, this.h);
          continue;
          this.i = ("asset_" + this.d);
          if (ic.t != null)
            this.h = ic.t.a(this.i);
          if (this.h == null)
          {
            this.h = ic.c(paramContext, this.d);
            if (this.h == null)
            {
              this.h = ic.b(paramContext, this.d);
              if ((this.h != null) && (this.d != "color_texture_flat_style.png"))
                this.h = ic.b(this.h);
            }
            if ((ic.t != null) && (this.h != null))
            {
              ic.t.a(this.i, this.h);
              continue;
              this.i = ("file_" + this.e);
              if (ic.t != null)
                this.h = ic.t.a(this.i);
              if (this.h == null)
              {
                this.h = ic.a(paramContext, this.e);
                continue;
                this.i = ("path_" + this.f);
                if (ic.t != null)
                  this.h = ic.t.a(this.i);
                if (this.h == null)
                {
                  this.h = ic.b(this.f);
                  if ((ic.t != null) && (this.h != null))
                  {
                    ic.t.a(this.i, this.h);
                    continue;
                    this.i = "asset_marker_default.png";
                    if (ic.t != null)
                      this.h = ic.t.a(this.i);
                    if (this.h == null)
                    {
                      this.h = ic.b(paramContext, "marker_default.png");
                      if ((ic.t != null) && (this.h != null))
                      {
                        ic.t.a(this.i, this.h);
                        continue;
                        String str = a(this.g);
                        if (str != null)
                        {
                          this.i = "asset_".concat(String.valueOf(str));
                          if (ic.t != null)
                            this.h = ic.t.a(this.i);
                          if (this.h == null)
                          {
                            this.h = ic.b(paramContext, str);
                            if ((ic.t != null) && (this.h != null))
                            {
                              ic.t.a(this.i, this.h);
                              continue;
                              if (this.h != null)
                              {
                                this.i = ("bitmap_" + b(this.h));
                                if ((ic.t != null) && (this.h != null))
                                  ic.t.a(this.i, this.h);
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public String a()
  {
    return this.i;
  }

  public void a(Bitmap paramBitmap)
  {
    this.h = paramBitmap;
  }

  public void a(String paramString)
  {
    this.d = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.bl
 * JD-Core Version:    0.6.2
 */