package com.tencent.soter.core.b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyGenParameterSpec.Builder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.spec.AlgorithmParameterSpec;

@TargetApi(23)
final class a$b extends a
{
  private KeyGenParameterSpec.Builder AuM;

  public a$b(String paramString, int paramInt)
  {
    AppMethodBeat.i(73006);
    this.AuM = null;
    this.AuM = new KeyGenParameterSpec.Builder(paramString, paramInt);
    AppMethodBeat.o(73006);
  }

  @SuppressLint({"WrongConstant"})
  public final a W(String[] paramArrayOfString)
  {
    AppMethodBeat.i(73008);
    this.AuM.setDigests(paramArrayOfString);
    AppMethodBeat.o(73008);
    return this;
  }

  @SuppressLint({"WrongConstant"})
  public final a X(String[] paramArrayOfString)
  {
    AppMethodBeat.i(73009);
    this.AuM.setSignaturePaddings(paramArrayOfString);
    AppMethodBeat.o(73009);
    return this;
  }

  public final AlgorithmParameterSpec dQU()
  {
    AppMethodBeat.i(73007);
    KeyGenParameterSpec localKeyGenParameterSpec = this.AuM.build();
    AppMethodBeat.o(73007);
    return localKeyGenParameterSpec;
  }

  public final a dQV()
  {
    AppMethodBeat.i(73010);
    this.AuM.setUserAuthenticationRequired(true);
    AppMethodBeat.o(73010);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.b.a.b
 * JD-Core Version:    0.6.2
 */