package com.tencent.mm.modelgeo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class d
  implements b
{
  public static d fwu;
  double bDJ;
  List<WeakReference<b.a>> bkF;
  public boolean fBD;
  h fBE;
  long fBF;
  long fBG;
  boolean fBH;
  boolean fBI;
  double fBJ;
  double fBK;
  int fBL;
  double fBM;
  double fBN;
  String fBO;
  String fBP;
  int fBQ;
  private boolean fBR;
  private boolean fBS;
  private f fBT;
  private g fBU;
  private ak fbD;
  private Context mContext;

  private d(Context paramContext)
  {
    AppMethodBeat.i(78131);
    this.fBD = false;
    this.bkF = new ArrayList();
    this.fBF = 0L;
    this.fBG = 0L;
    this.fBH = false;
    this.fBI = false;
    this.fBJ = 23.0D;
    this.fBK = 100.0D;
    this.fBL = 0;
    this.fBM = 0.0D;
    this.fBN = 0.0D;
    this.bDJ = 0.0D;
    this.fBR = false;
    this.fBS = false;
    this.fbD = new ak(Looper.getMainLooper());
    this.fBT = new d.1(this);
    this.fBU = new d.2(this);
    this.mContext = paramContext;
    this.fBE = h.bY(paramContext);
    AppMethodBeat.o(78131);
  }

  public static boolean agA()
  {
    AppMethodBeat.i(78137);
    try
    {
      bool = ((LocationManager)ah.getContext().getSystemService("location")).isProviderEnabled("gps");
      AppMethodBeat.o(78137);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.LocationGeo", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(78137);
        boolean bool = false;
      }
    }
  }

  public static boolean agB()
  {
    AppMethodBeat.i(78139);
    try
    {
      bool = ((LocationManager)ah.getContext().getSystemService("location")).isProviderEnabled("network");
      AppMethodBeat.o(78139);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.LocationGeo", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(78139);
        boolean bool = false;
      }
    }
  }

  public static d agz()
  {
    AppMethodBeat.i(78130);
    if (fwu == null)
      fwu = new d(ah.getContext());
    d locald = fwu;
    AppMethodBeat.o(78130);
    return locald;
  }

  public static void bX(Context paramContext)
  {
    AppMethodBeat.i(78138);
    Intent localIntent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
    if ((paramContext instanceof Activity))
    {
      ((Activity)paramContext).startActivityForResult(localIntent, -1);
      AppMethodBeat.o(78138);
    }
    while (true)
    {
      return;
      localIntent.addFlags(268435456);
      paramContext.startActivity(localIntent);
      AppMethodBeat.o(78138);
    }
  }

  public final void a(b.a parama)
  {
    AppMethodBeat.i(78134);
    b(parama, true);
    AppMethodBeat.o(78134);
  }

  public final void a(b.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(78132);
    ab.i("MicroMsg.LocationGeo", "startWgs84 %s userCache %s delay %d", new Object[] { parama, Boolean.valueOf(paramBoolean), Integer.valueOf(0) });
    if ((this.fBD) && (this.bkF.size() > 0));
    try
    {
      this.fBF = System.currentTimeMillis();
      this.fBR = false;
      this.fBS = false;
      h.agE();
      h.a(this.fBU, 0, Looper.getMainLooper());
      this.fBD = false;
      Iterator localIterator = this.bkF.iterator();
      WeakReference localWeakReference;
      do
      {
        if (!localIterator.hasNext())
          break;
        localWeakReference = (WeakReference)localIterator.next();
      }
      while ((localWeakReference == null) || (localWeakReference.get() == null) || (!((b.a)localWeakReference.get()).equals(parama)));
      i = 0;
      if (i != 0)
        this.bkF.add(new WeakReference(parama));
      ab.i("MicroMsg.LocationGeo", "add listeners size %d", new Object[] { Integer.valueOf(this.bkF.size()) });
      if ((this.bkF.size() != 1) || (i == 0));
    }
    catch (h.a locala)
    {
      while (true)
      {
        try
        {
          this.fBF = System.currentTimeMillis();
          this.fBR = false;
          this.fBS = false;
          h.a(this.fBU, 0, Looper.getMainLooper());
          if ((paramBoolean) && (this.fBI) && (System.currentTimeMillis() - this.fBG < 60000L))
            this.fBU.a(true, this.fBJ, this.fBK, this.fBL, this.fBM, this.fBN, this.bDJ, this.fBO, this.fBP, this.fBQ);
          AppMethodBeat.o(78132);
          return;
          locala = locala;
          ab.d("MicroMsg.LocationGeo", locala.toString());
        }
        catch (h.a parama)
        {
          ab.d("MicroMsg.LocationGeo", parama.toString());
          continue;
        }
        int i = 1;
      }
    }
  }

  public final boolean agC()
  {
    AppMethodBeat.i(78140);
    boolean bool;
    if ((this.fBG > 0L) && (this.fBI) && (System.currentTimeMillis() - this.fBG < 600000L))
    {
      bool = true;
      AppMethodBeat.o(78140);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(78140);
    }
  }

  public final void b(b.a parama)
  {
    AppMethodBeat.i(138577);
    a(parama, true);
    AppMethodBeat.o(138577);
  }

  public final void b(b.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(78135);
    if ((!this.fBD) && (this.bkF.size() > 0));
    try
    {
      this.fBF = System.currentTimeMillis();
      this.fBR = false;
      this.fBS = false;
      h.agE();
      h.a(this.fBT, 1, Looper.getMainLooper());
      this.fBD = true;
      Iterator localIterator = this.bkF.iterator();
      WeakReference localWeakReference;
      do
      {
        if (!localIterator.hasNext())
          break;
        localWeakReference = (WeakReference)localIterator.next();
      }
      while ((localWeakReference == null) || (localWeakReference.get() == null) || (!((b.a)localWeakReference.get()).equals(parama)));
      i = 0;
      if (i != 0)
        this.bkF.add(new WeakReference(parama));
      ab.i("MicroMsg.LocationGeo", "add listeners size %d", new Object[] { Integer.valueOf(this.bkF.size()) });
      if ((this.bkF.size() != 1) || (i == 0));
    }
    catch (h.a locala)
    {
      while (true)
      {
        try
        {
          this.fBF = System.currentTimeMillis();
          this.fBR = false;
          this.fBS = false;
          h.a(this.fBT, 1, Looper.getMainLooper());
          if ((paramBoolean) && (this.fBH) && (System.currentTimeMillis() - this.fBG < 60000L))
            this.fBT.a(true, this.fBJ, this.fBK, this.fBL, this.fBM, this.fBN, this.bDJ, this.fBO, this.fBP, this.fBQ);
          AppMethodBeat.o(78135);
          return;
          locala = locala;
          ab.d("MicroMsg.LocationGeo", locala.toString());
        }
        catch (h.a parama)
        {
          ab.d("MicroMsg.LocationGeo", parama.toString());
          continue;
        }
        int i = 1;
      }
    }
  }

  public final void c(b.a parama)
  {
    AppMethodBeat.i(78136);
    new ak().post(new d.3(this, parama));
    AppMethodBeat.o(78136);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelgeo.d
 * JD-Core Version:    0.6.2
 */