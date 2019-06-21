package com.tencent.mm.plugin.sns.model;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.pluginsdk.model.k;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ah;

public final class ab$a extends k<String, String, Boolean>
{
  private SharedPreferences ehZ;
  private String key;
  private String qKo;
  PInt qKp;
  PInt qKq;
  private String qKr;
  private String username;

  public ab$a(ab paramab)
  {
    AppMethodBeat.i(36364);
    this.ehZ = null;
    this.qKo = "";
    this.key = "";
    this.qKp = new PInt();
    this.qKq = new PInt();
    this.ehZ = ah.getContext().getSharedPreferences("preferences_remove_task", 0);
    g.RQ();
    if (!g.RN().QY())
      AppMethodBeat.o(36364);
    while (true)
    {
      return;
      this.username = r.Yz();
      this.qKo = ("remove_key_base" + this.username);
      this.key = ("remove_key" + this.username);
      g.RQ();
      if (!g.RN().QY())
      {
        AppMethodBeat.o(36364);
      }
      else if (af.cnn())
      {
        AppMethodBeat.o(36364);
      }
      else if (af.Ru() == null)
      {
        AppMethodBeat.o(36364);
      }
      else if (af.cnJ() == null)
      {
        AppMethodBeat.o(36364);
      }
      else
      {
        l locall = af.cnJ().YX(this.username);
        if (locall != null)
          this.qKr = locall.field_bgId;
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.RemoveSnsTask", "my bgid %s", new Object[] { this.qKr });
        ab.a(paramab, true);
        AppMethodBeat.o(36364);
      }
    }
  }

  private Boolean cmY()
  {
    AppMethodBeat.i(36365);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.RemoveSnsTask", "simpleCleans sns");
    Object localObject;
    if (!ab.nLD)
    {
      localObject = Boolean.FALSE;
      AppMethodBeat.o(36365);
    }
    while (true)
    {
      return localObject;
      if (!ab.c(this.qKn))
      {
        localObject = Boolean.FALSE;
        AppMethodBeat.o(36365);
        continue;
      }
      if (af.cnn())
      {
        ab.nLD = false;
        localObject = Boolean.FALSE;
        AppMethodBeat.o(36365);
        continue;
      }
      this.qKp.value = this.ehZ.getInt(this.qKo, 0);
      this.qKq.value = this.ehZ.getInt(this.key, 0);
      localObject = af.getAccSnsPath();
      try
      {
        long l = System.currentTimeMillis();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        if (!ab.ad((String)localObject + ab.qKm[(this.qKp.value % 36)] + "/" + ab.qKm[(this.qKq.value % 36)], this.qKr, this.username))
        {
          localObject = Boolean.FALSE;
          AppMethodBeat.o(36365);
          continue;
        }
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("clean sns uses time : ");
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.RemoveSnsTask", System.currentTimeMillis() - l + " " + this.qKp.value + " " + this.qKq.value);
        label264: localObject = Boolean.TRUE;
        AppMethodBeat.o(36365);
      }
      catch (Exception localException)
      {
        break label264;
      }
    }
  }

  public final com.tencent.mm.sdk.g.b.a cin()
  {
    AppMethodBeat.i(36366);
    com.tencent.mm.sdk.g.b.a locala = af.cnr();
    AppMethodBeat.o(36366);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.ab.a
 * JD-Core Version:    0.6.2
 */