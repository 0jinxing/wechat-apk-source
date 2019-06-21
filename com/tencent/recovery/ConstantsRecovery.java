package com.tencent.recovery;

import com.tencent.recovery.config.Express;
import com.tencent.recovery.config.ExpressItem;
import com.tencent.recovery.option.CommonOptions;
import com.tencent.recovery.option.CommonOptions.Builder;
import com.tencent.recovery.option.ProcessOptions;
import com.tencent.recovery.option.ProcessOptions.Builder;
import java.util.ArrayList;
import java.util.List;

public class ConstantsRecovery
{
  public static final class DefaultCommonOptions
  {
    public static final CommonOptions AqJ = localBuilder.dQg();

    static
    {
      CommonOptions.Builder localBuilder = new CommonOptions.Builder();
      localBuilder.eCq = "";
      localBuilder.clientVersion = "";
      localBuilder.Arl = "";
      localBuilder.Aro = "";
      localBuilder.Arp = "";
    }
  }

  public static final class DefaultExpress
  {
    public static final Express AqK = new Express();
    public static final Express AqL;
    public static final Express AqM;

    static
    {
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(new ExpressItem(17, 1114112));
      AqK.fA(localArrayList);
      AqL = new Express();
      localArrayList = new ArrayList();
      localArrayList.add(new ExpressItem(1, 1118208));
      AqL.fA(localArrayList);
      AqM = new Express();
      localArrayList = new ArrayList();
      localArrayList.add(new ExpressItem(1, 1114112));
      AqM.fA(localArrayList);
    }
  }

  public static final class DefaultProcessOptions
  {
    public static final ProcessOptions AqN;
    public static final ProcessOptions AqO;
    public static final ProcessOptions AqP = localBuilder.dQi();

    static
    {
      ProcessOptions.Builder localBuilder = new ProcessOptions.Builder();
      localBuilder.Aru = ConstantsRecovery.DefaultExpress.AqK;
      localBuilder.dQh();
      AqN = localBuilder.dQi();
      localBuilder = new ProcessOptions.Builder();
      localBuilder.Aru = ConstantsRecovery.DefaultExpress.AqL;
      localBuilder.dQh();
      AqO = localBuilder.dQi();
      localBuilder = new ProcessOptions.Builder();
      localBuilder.Aru = ConstantsRecovery.DefaultExpress.AqM;
      localBuilder.dQh();
    }
  }

  public static final class IntentAction
  {
  }

  public static final class IntentKeys
  {
  }

  public static final class Message
  {
  }

  public static final class ProcessStage
  {
  }

  public static final class ProcessStartFlag
  {
  }

  public static final class ProcessStatus
  {
  }

  public static final class ReportType
  {
  }

  public static final class SpKeys
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.ConstantsRecovery
 * JD-Core Version:    0.6.2
 */