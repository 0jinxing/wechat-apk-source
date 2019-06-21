package com.google.firebase.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

final class ag
{
  final KeyPair bwM;
  final long bwN;

  @VisibleForTesting
  ag(KeyPair paramKeyPair, long paramLong)
  {
    this.bwM = paramKeyPair;
    this.bwN = paramLong;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(108813);
    if (!(paramObject instanceof ag))
      AppMethodBeat.o(108813);
    while (true)
    {
      return bool;
      paramObject = (ag)paramObject;
      if ((this.bwN == paramObject.bwN) && (this.bwM.getPublic().equals(paramObject.bwM.getPublic())) && (this.bwM.getPrivate().equals(paramObject.bwM.getPrivate())))
      {
        bool = true;
        AppMethodBeat.o(108813);
      }
      else
      {
        AppMethodBeat.o(108813);
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(108814);
    int i = Objects.hashCode(new Object[] { this.bwM.getPublic(), this.bwM.getPrivate(), Long.valueOf(this.bwN) });
    AppMethodBeat.o(108814);
    return i;
  }

  final String uW()
  {
    AppMethodBeat.i(108816);
    String str = Base64.encodeToString(this.bwM.getPrivate().getEncoded(), 11);
    AppMethodBeat.o(108816);
    return str;
  }

  final String zzq()
  {
    AppMethodBeat.i(108815);
    String str = Base64.encodeToString(this.bwM.getPublic().getEncoded(), 11);
    AppMethodBeat.o(108815);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.ag
 * JD-Core Version:    0.6.2
 */