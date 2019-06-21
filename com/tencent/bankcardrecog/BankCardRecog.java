package com.tencent.bankcardrecog;

public class BankCardRecog
{
  public static native String getBankCardSegmentNumber(String paramString, int paramInt, int[] paramArrayOfInt);

  public static native int recognizeBankCardGetVersion();

  public static native int recognizeBankCardInit(int paramInt1, int paramInt2, boolean paramBoolean);

  public static native int recognizeBankCardProcess(byte[] paramArrayOfByte, BankCardInfo paramBankCardInfo, boolean[] paramArrayOfBoolean);

  public static native int recognizeBankCardRelease();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.bankcardrecog.BankCardRecog
 * JD-Core Version:    0.6.2
 */