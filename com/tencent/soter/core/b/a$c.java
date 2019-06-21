package com.tencent.soter.core.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

final class a$c extends a
{
  private final String AuN;
  private int AuO;
  private int AuP;
  private AlgorithmParameterSpec AuQ;
  private X500Principal AuR;
  private BigInteger AuS;
  private Date AuT;
  private Date AuU;
  private Date AuV;
  private Date AuW;
  private Date AuX;
  private String[] AuY;
  private String[] AuZ;
  private String[] Ava;
  private String[] Avb;
  private boolean Avc;
  private boolean Avd;
  private int Ave;

  public a$c(String paramString, int paramInt)
  {
    AppMethodBeat.i(73011);
    this.AuP = -1;
    this.Avc = true;
    this.Ave = -1;
    if (paramString == null)
    {
      paramString = new NullPointerException("keystoreAlias == null");
      AppMethodBeat.o(73011);
      throw paramString;
    }
    if (paramString.isEmpty())
    {
      paramString = new IllegalArgumentException("keystoreAlias must not be empty");
      AppMethodBeat.o(73011);
      throw paramString;
    }
    this.AuN = paramString;
    this.AuO = paramInt;
    AppMethodBeat.o(73011);
  }

  public final a W(String[] paramArrayOfString)
  {
    AppMethodBeat.i(73012);
    this.AuY = Y(paramArrayOfString);
    AppMethodBeat.o(73012);
    return this;
  }

  public final a X(String[] paramArrayOfString)
  {
    AppMethodBeat.i(73013);
    this.Ava = Y(paramArrayOfString);
    AppMethodBeat.o(73013);
    return this;
  }

  public final AlgorithmParameterSpec dQU()
  {
    AppMethodBeat.i(73014);
    AlgorithmParameterSpec localAlgorithmParameterSpec = (AlgorithmParameterSpec)Class.forName("android.security.keystore.KeyGenParameterSpec").getConstructor(new Class[] { String.class, Integer.TYPE, AlgorithmParameterSpec.class, X500Principal.class, BigInteger.class, Date.class, Date.class, Date.class, Date.class, Date.class, Integer.TYPE, [Ljava.lang.String.class, [Ljava.lang.String.class, [Ljava.lang.String.class, [Ljava.lang.String.class, Boolean.TYPE, Boolean.TYPE, Integer.TYPE }).newInstance(new Object[] { this.AuN, Integer.valueOf(this.AuP), this.AuQ, this.AuR, this.AuS, this.AuT, this.AuU, this.AuV, this.AuW, this.AuX, Integer.valueOf(this.AuO), this.AuY, this.AuZ, this.Ava, this.Avb, Boolean.valueOf(this.Avc), Boolean.valueOf(this.Avd), Integer.valueOf(this.Ave) });
    AppMethodBeat.o(73014);
    return localAlgorithmParameterSpec;
  }

  public final a dQV()
  {
    this.Avd = true;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.soter.core.b.a.c
 * JD-Core Version:    0.6.2
 */