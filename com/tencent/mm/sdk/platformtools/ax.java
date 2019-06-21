package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;
import java.util.List;

public final class ax
{
  static boolean cQz;
  private TelephonyManager xAM;
  private PhoneStateListener xAN;
  List<a> xAO;

  public ax()
  {
    AppMethodBeat.i(52215);
    this.xAO = new LinkedList();
    AppMethodBeat.o(52215);
  }

  public static boolean Ex()
  {
    AppMethodBeat.i(52218);
    ab.i("MicroMsg.PhoneStatusWatcher", "alvinluo isCalling: %b", new Object[] { Boolean.valueOf(cQz) });
    boolean bool = cQz;
    AppMethodBeat.o(52218);
    return bool;
  }

  public final void a(a parama)
  {
    AppMethodBeat.i(52216);
    this.xAO.add(parama);
    AppMethodBeat.o(52216);
  }

  public final void dpf()
  {
    AppMethodBeat.i(52217);
    this.xAO.clear();
    AppMethodBeat.o(52217);
  }

  public final void end()
  {
    AppMethodBeat.i(52220);
    ab.i("MicroMsg.PhoneStatusWatcher", "alvinluo PhoneStatusWatcher end");
    if (this.xAM != null)
    {
      this.xAM.listen(this.xAN, 0);
      this.xAN = null;
    }
    AppMethodBeat.o(52220);
  }

  public final void gK(Context paramContext)
  {
    AppMethodBeat.i(52219);
    ab.i("MicroMsg.PhoneStatusWatcher", "alvinluo PhoneStatusWatcher begin");
    if (this.xAM == null)
      this.xAM = ((TelephonyManager)paramContext.getSystemService("phone"));
    if (this.xAN == null)
      this.xAN = new PhoneStateListener()
      {
        public final void onCallStateChanged(int paramAnonymousInt, String paramAnonymousString)
        {
          AppMethodBeat.i(52214);
          ab.i("MicroMsg.PhoneStatusWatcher", "alvinluo onCallStateChanged state: %d, incomingNumber: %s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
          if (ax.this.xAO.size() > 0)
          {
            ax.a[] arrayOfa = new ax.a[ax.this.xAO.size()];
            arrayOfa = (ax.a[])ax.this.xAO.toArray(arrayOfa);
            int i = arrayOfa.length;
            for (int j = 0; j < i; j++)
              arrayOfa[j].ih(paramAnonymousInt);
          }
          super.onCallStateChanged(paramAnonymousInt, paramAnonymousString);
          switch (paramAnonymousInt)
          {
          default:
          case 0:
          case 1:
          case 2:
          }
          while (true)
          {
            AppMethodBeat.o(52214);
            while (true)
            {
              return;
              ax.cQz = false;
              AppMethodBeat.o(52214);
            }
            ax.cQz = true;
          }
        }
      };
    this.xAM.listen(this.xAN, 32);
    AppMethodBeat.o(52219);
  }

  public static abstract interface a
  {
    public abstract void ih(int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ax
 * JD-Core Version:    0.6.2
 */