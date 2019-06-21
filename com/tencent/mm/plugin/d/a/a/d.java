package com.tencent.mm.plugin.d.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Vector;
import junit.framework.Assert;

public final class d
{
  private final HashMap<c, Vector<Integer>> cS;
  private b jEM;

  public d(b paramb)
  {
    AppMethodBeat.i(18328);
    this.cS = new HashMap();
    this.jEM = null;
    this.jEM = paramb;
    AppMethodBeat.o(18328);
  }

  private void a(Vector<Integer> paramVector, c paramc)
  {
    AppMethodBeat.i(18330);
    ab.i("MicroMsg.exdevie.IBeaconManager", "calDistance");
    Object localObject = new int[paramVector.size()];
    for (int i = 0; i < localObject.length; i++)
      localObject[i] = ((Integer)paramVector.elementAt(i)).intValue();
    paramVector = new a((int[])localObject);
    if (1 == paramVector.jEI.length)
    {
      ab.d("MicroMsg.exdevice.GaussianFilter", "data group length = 1, no need to filter, just return");
      paramVector = paramVector.jEI;
    }
    while ((paramVector == null) || (paramVector.length == 0))
    {
      paramVector = new NullPointerException("null == ret || 0 == ret.length");
      AppMethodBeat.o(18330);
      throw paramVector;
      localObject = new StringBuilder("");
      ((StringBuilder)localObject).append("Data Before GaussianFilter \r\n");
      for (i = 0; i < paramVector.jEI.length; i++)
        ((StringBuilder)localObject).append(" " + paramVector.jEI[i]);
      ab.d("MicroMsg.exdevice.GaussianFilter", ((StringBuilder)localObject).toString());
      d1 = i.p(paramVector.jEI);
      double d2 = i.q(paramVector.jEI);
      d3 = i.i(0.15D, d2).add(new BigDecimal(d1)).doubleValue();
      d4 = i.i(3.09D, d2).add(new BigDecimal(d1)).doubleValue();
      ab.d("MicroMsg.exdevice.GaussianFilter", "Mean = " + d1 + "SD = " + d2 + "LowerLimit = " + d3 + " UpperLimit = " + d4);
      i = 0;
      localObject = new int[paramVector.jEI.length];
      int j = 0;
      int k;
      while (j < paramVector.jEI.length)
      {
        k = i;
        if (paramVector.jEI[j] >= d3)
        {
          k = i;
          if (paramVector.jEI[j] <= d4)
          {
            localObject[i] = paramVector.jEI[j];
            k = i + 1;
          }
        }
        j++;
        i = k;
      }
      if (i != 0);
      for (boolean bool = true; ; bool = false)
      {
        Assert.assertTrue(bool);
        paramVector = new int[i];
        for (k = 0; k < i; k++)
          paramVector[k] = localObject[k];
      }
      localObject = new StringBuilder("");
      ((StringBuilder)localObject).append("Data After GaussianFilter \r\n");
      for (i = 0; i < paramVector.length; i++)
        ((StringBuilder)localObject).append(" " + paramVector[i]);
      ab.d("MicroMsg.exdevice.GaussianFilter", ((StringBuilder)localObject).toString());
    }
    double d1 = i.p(paramVector);
    paramc.jEL = new BigDecimal(d1).divide(new BigDecimal(1), 3, 4).doubleValue();
    double d3 = paramc.jEK.jEO.jFs;
    double d4 = 1.0D * d1 / d3;
    if (d4 < 1.0D);
    for (d4 = Math.pow(d4, 10.0D); ; d4 = Math.pow(d4, 9.9476D) * 0.92093D + 0.54992D)
    {
      ab.i("MicroMsg.exdevie.IBeaconManager", "txPower = %f , rssi = %f,distance = %f", new Object[] { Double.valueOf(d3), Double.valueOf(d1), Double.valueOf(d4) });
      this.jEM.a(d4, paramc);
      AppMethodBeat.o(18330);
      return;
    }
  }

  public final void a(int paramInt, String paramString, e parame)
  {
    AppMethodBeat.i(18329);
    ab.i("MicroMsg.exdevie.IBeaconManager", "advertismentProcess, brand = %s, rssi = %d", new Object[] { null, Integer.valueOf(paramInt) });
    if (parame == null)
    {
      ab.e("MicroMsg.exdevie.IBeaconManager", "null == aProtocal");
      AppMethodBeat.o(18329);
    }
    while (true)
    {
      return;
      c localc = new c();
      localc.jEJ = null;
      localc.jEK = parame;
      localc.cbq = paramString;
      if (!this.cS.containsKey(localc))
      {
        paramString = new Vector();
        paramString.add(Integer.valueOf(paramInt));
        this.cS.put(localc, paramString);
        AppMethodBeat.o(18329);
      }
      else
      {
        paramString = (Vector)this.cS.get(localc);
        paramString.add(Integer.valueOf(paramInt));
        if (1 <= paramString.size())
          try
          {
            a(paramString, localc);
            paramString.clear();
            AppMethodBeat.o(18329);
            continue;
          }
          catch (Exception parame)
          {
            ab.e("MicroMsg.exdevie.IBeaconManager", "calDistance failed!!!, %s", new Object[] { parame.getMessage() });
            paramString.clear();
            AppMethodBeat.o(18329);
            continue;
          }
          finally
          {
            paramString.clear();
            AppMethodBeat.o(18329);
          }
        else
          AppMethodBeat.o(18329);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.a.d
 * JD-Core Version:    0.6.2
 */