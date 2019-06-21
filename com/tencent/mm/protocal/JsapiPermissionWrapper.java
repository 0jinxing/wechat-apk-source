package com.tencent.mm.protocal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JsapiPermissionWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<JsapiPermissionWrapper> CREATOR;
  public static final JsapiPermissionWrapper vxI;
  public static final JsapiPermissionWrapper vxJ;
  public static final JsapiPermissionWrapper vxK;
  public static final JsapiPermissionWrapper vxL;
  public byte[] vxM;
  private int vxN;
  private Set<Integer> vxO;
  private Set<Integer> vxP;

  static
  {
    AppMethodBeat.i(79994);
    vxI = new JsapiPermissionWrapper(1);
    vxJ = new JsapiPermissionWrapper(2);
    vxK = new JsapiPermissionWrapper(3);
    vxL = new JsapiPermissionWrapper(4);
    CREATOR = new JsapiPermissionWrapper.1();
    AppMethodBeat.o(79994);
  }

  public JsapiPermissionWrapper()
  {
    this.vxM = null;
    this.vxN = 0;
    this.vxM = null;
  }

  public JsapiPermissionWrapper(int paramInt)
  {
    AppMethodBeat.i(79979);
    this.vxM = null;
    this.vxN = 0;
    this.vxN = paramInt;
    this.vxM = new byte[0];
    AppMethodBeat.o(79979);
  }

  private JsapiPermissionWrapper(Parcel paramParcel)
  {
    AppMethodBeat.i(79985);
    this.vxM = null;
    this.vxN = 0;
    this.vxM = paramParcel.createByteArray();
    this.vxN = paramParcel.readInt();
    A(paramParcel.createIntArray());
    B(paramParcel.createIntArray());
    AppMethodBeat.o(79985);
  }

  public JsapiPermissionWrapper(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(79978);
    this.vxM = null;
    this.vxN = 0;
    if (paramArrayOfByte == null)
    {
      this.vxM = null;
      AppMethodBeat.o(79978);
    }
    while (true)
    {
      return;
      this.vxM = paramArrayOfByte;
      AppMethodBeat.o(79978);
    }
  }

  private void A(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(79989);
    if (this.vxO == null)
      this.vxO = new HashSet();
    while ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0))
    {
      for (int i = 0; i < paramArrayOfInt.length; i++)
        this.vxO.add(Integer.valueOf(paramArrayOfInt[i]));
      this.vxO.clear();
    }
    AppMethodBeat.o(79989);
  }

  private void B(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(79992);
    if (this.vxP == null)
      this.vxP = new HashSet();
    while ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0))
    {
      for (int i = 0; i < paramArrayOfInt.length; i++)
        this.vxP.add(Integer.valueOf(paramArrayOfInt[i]));
      this.vxP.clear();
    }
    AppMethodBeat.o(79992);
  }

  private boolean Ly(int paramInt)
  {
    AppMethodBeat.i(79990);
    boolean bool;
    if ((this.vxO != null) && (this.vxO.contains(Integer.valueOf(paramInt))))
    {
      bool = true;
      AppMethodBeat.o(79990);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(79990);
    }
  }

  private boolean Lz(int paramInt)
  {
    AppMethodBeat.i(79993);
    boolean bool;
    if ((this.vxP != null) && (this.vxP.contains(Integer.valueOf(paramInt))))
    {
      bool = true;
      AppMethodBeat.o(79993);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(79993);
    }
  }

  private int[] dmp()
  {
    AppMethodBeat.i(79988);
    int[] arrayOfInt;
    if (this.vxO != null)
    {
      arrayOfInt = new int[this.vxO.size()];
      Iterator localIterator = this.vxO.iterator();
      int i = 0;
      if (localIterator.hasNext())
      {
        Integer localInteger = (Integer)localIterator.next();
        if (localInteger == null);
        for (int j = 0; ; j = localInteger.intValue())
        {
          arrayOfInt[i] = j;
          i++;
          break;
        }
      }
      AppMethodBeat.o(79988);
    }
    while (true)
    {
      return arrayOfInt;
      arrayOfInt = new int[0];
      AppMethodBeat.o(79988);
    }
  }

  private int[] dmq()
  {
    AppMethodBeat.i(79991);
    int[] arrayOfInt;
    if (this.vxP != null)
    {
      arrayOfInt = new int[this.vxP.size()];
      Iterator localIterator = this.vxP.iterator();
      int i = 0;
      if (localIterator.hasNext())
      {
        Integer localInteger = (Integer)localIterator.next();
        if (localInteger == null);
        for (int j = 0; ; j = localInteger.intValue())
        {
          arrayOfInt[i] = j;
          i++;
          break;
        }
      }
      AppMethodBeat.o(79991);
    }
    while (true)
    {
      return arrayOfInt;
      arrayOfInt = new int[0];
      AppMethodBeat.o(79991);
    }
  }

  public final int Lx(int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(79980);
    if (Lz(paramInt))
    {
      AppMethodBeat.o(79980);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      if (Ly(paramInt))
      {
        AppMethodBeat.o(79980);
        paramInt = 0;
      }
      else if (this.vxN == 1)
      {
        if ((paramInt == 34) || (paramInt == 75))
        {
          ab.i("MicroMsg.JsapiPermissionWrapper", "on reserved bytes control : %d", new Object[] { Integer.valueOf(paramInt) });
          AppMethodBeat.o(79980);
          paramInt = 0;
        }
        else
        {
          AppMethodBeat.o(79980);
          paramInt = i;
        }
      }
      else if (this.vxN == 2)
      {
        if (paramInt == -3)
        {
          AppMethodBeat.o(79980);
          paramInt = i;
        }
        else
        {
          AppMethodBeat.o(79980);
          paramInt = 0;
        }
      }
      else if (this.vxN == 3)
      {
        if ((paramInt == 34) || (paramInt == 75) || (paramInt == 23))
        {
          ab.i("MicroMsg.JsapiPermissionWrapper", "on reserved bytes control : %d", new Object[] { Integer.valueOf(paramInt) });
          AppMethodBeat.o(79980);
          paramInt = 0;
        }
        else
        {
          AppMethodBeat.o(79980);
          paramInt = i;
        }
      }
      else if (this.vxN == 4)
      {
        if ((paramInt == 34) || (paramInt == 75))
        {
          ab.i("MicroMsg.JsapiPermissionWrapper", "hy: on reserved bytes control : %d", new Object[] { Integer.valueOf(paramInt) });
          AppMethodBeat.o(79980);
          paramInt = 0;
        }
        else
        {
          AppMethodBeat.o(79980);
          paramInt = i;
        }
      }
      else if ((paramInt == -2) || (paramInt == -3))
      {
        AppMethodBeat.o(79980);
        paramInt = i;
      }
      else if ((this.vxM == null) || (paramInt < 0) || (paramInt >= this.vxM.length))
      {
        AppMethodBeat.o(79980);
        paramInt = 0;
      }
      else
      {
        paramInt = this.vxM[paramInt];
        AppMethodBeat.o(79980);
      }
    }
  }

  public final void a(int paramInt, byte paramByte)
  {
    byte b = 0;
    AppMethodBeat.i(79981);
    if ((this.vxM == null) || (paramInt < 0) || (paramInt >= this.vxM.length))
      if (this.vxM == null)
      {
        paramByte = b;
        ab.e("MicroMsg.JsapiPermissionWrapper", "setPermission pos out of range, %s, %s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramByte) });
        AppMethodBeat.o(79981);
      }
    while (true)
    {
      return;
      paramByte = this.vxM.length;
      break;
      this.vxM[paramInt] = ((byte)paramByte);
      AppMethodBeat.o(79981);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (!(paramObject instanceof JsapiPermissionWrapper))
      bool2 = bool1;
    while (true)
    {
      return bool2;
      paramObject = (JsapiPermissionWrapper)paramObject;
      if (this.vxM == paramObject.vxM)
      {
        bool2 = true;
      }
      else
      {
        bool2 = bool1;
        if (this.vxM != null)
        {
          bool2 = bool1;
          if (paramObject.vxM != null)
          {
            bool2 = bool1;
            if (this.vxM.length == paramObject.vxM.length)
            {
              for (int i = 0; ; i++)
              {
                if (i >= this.vxM.length)
                  break label105;
                bool2 = bool1;
                if (this.vxM[i] != paramObject.vxM[i])
                  break;
              }
              label105: bool2 = true;
            }
          }
        }
      }
    }
  }

  public final void fromBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(79987);
    this.vxM = paramBundle.getByteArray("jsapi_perm_wrapper_bytes");
    this.vxN = paramBundle.getInt("jsapi_perm_wrapper_hardcodePermission");
    A(paramBundle.getIntArray("jsapi_perm_wrapper_blacklist"));
    B(paramBundle.getIntArray("jsapi_perm_wrapper_whitelist"));
    AppMethodBeat.o(79987);
  }

  public final boolean jB(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(79982);
    if (Lx(paramInt) == 1)
      AppMethodBeat.o(79982);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(79982);
    }
  }

  public final void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(79986);
    paramBundle.putByteArray("jsapi_perm_wrapper_bytes", this.vxM);
    paramBundle.putInt("jsapi_perm_wrapper_hardcodePermission", this.vxN);
    paramBundle.putIntArray("jsapi_perm_wrapper_blacklist", dmp());
    paramBundle.putIntArray("jsapi_perm_wrapper_whitelist", dmq());
    AppMethodBeat.o(79986);
  }

  public String toString()
  {
    AppMethodBeat.i(79983);
    Object localObject;
    if (this.vxM == null)
    {
      localObject = "null";
      AppMethodBeat.o(79983);
    }
    while (true)
    {
      return localObject;
      long l = System.currentTimeMillis();
      localObject = new StringBuilder(180);
      byte[] arrayOfByte = this.vxM;
      int i = arrayOfByte.length;
      for (int j = 0; j < i; j++)
        ((StringBuilder)localObject).append(arrayOfByte[j]);
      localObject = ((StringBuilder)localObject).toString();
      ab.d("MicroMsg.JsapiPermissionWrapper", "toString cost %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(79983);
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(79984);
    paramParcel.writeByteArray(this.vxM);
    paramParcel.writeInt(this.vxN);
    paramParcel.writeIntArray(dmp());
    paramParcel.writeIntArray(dmq());
    AppMethodBeat.o(79984);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.JsapiPermissionWrapper
 * JD-Core Version:    0.6.2
 */