package com.tencent.util;

import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class j
{
  private static j AIm;
  public static final String DEVICE;
  public static final String MANUFACTURER;
  public static final String MODEL;
  private boolean AIA;
  private boolean AIB;
  private boolean AIl;
  private boolean AIn;
  private boolean AIo;
  private boolean AIp;
  private int AIq;
  private boolean AIr;
  private boolean AIs;
  private boolean AIt;
  private boolean AIu;
  public boolean AIv;
  private boolean AIw;
  private boolean AIx;
  private int AIy;
  private boolean AIz;
  private String cws;

  static
  {
    AppMethodBeat.i(86624);
    AIm = null;
    MODEL = Build.MODEL.toLowerCase();
    DEVICE = Build.DEVICE.toLowerCase();
    MANUFACTURER = Build.MANUFACTURER.toLowerCase();
    AppMethodBeat.o(86624);
  }

  private j()
  {
    AppMethodBeat.i(86623);
    this.AIl = false;
    this.cws = null;
    this.AIn = false;
    this.AIo = false;
    this.AIp = false;
    this.AIq = 0;
    this.AIr = false;
    this.AIs = false;
    this.AIt = false;
    this.AIu = false;
    this.AIv = false;
    this.AIw = false;
    this.AIx = false;
    this.AIy = 0;
    this.AIz = false;
    this.AIA = true;
    this.AIB = false;
    if (this.AIl)
    {
      i.j("PhoneProperty", "******MODEL*****" + Build.MODEL);
      i.j("PhoneProperty", "******BRAND*****" + Build.BRAND);
      i.j("PhoneProperty", "*******DEVICE****" + Build.DEVICE);
      i.j("PhoneProperty", "*****DISPLAY******" + Build.DISPLAY);
      i.j("PhoneProperty", "*****HARDWARE******" + Build.HARDWARE);
      i.j("PhoneProperty", "******MANUFACTURER*****" + Build.MANUFACTURER);
      i.j("PhoneProperty", "*****PRODUCT******" + Build.PRODUCT);
      i.j("PhoneProperty", "******TAGS*****" + Build.TAGS);
      i.j("PhoneProperty", "*****USER******" + Build.USER);
      i.j("PhoneProperty", "****TYPE*******" + Build.TYPE);
    }
    AppMethodBeat.o(86623);
  }

  public static j dSM()
  {
    AppMethodBeat.i(86622);
    if (AIm == null)
      AIm = new j();
    j localj = AIm;
    AppMethodBeat.o(86622);
    return localj;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.util.j
 * JD-Core Version:    0.6.2
 */