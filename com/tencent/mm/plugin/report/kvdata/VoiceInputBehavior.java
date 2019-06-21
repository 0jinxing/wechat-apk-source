package com.tencent.mm.plugin.report.kvdata;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class VoiceInputBehavior extends com.tencent.mm.bt.a
{
  public int cancel;
  public int chooseArea;
  public int chooseCantonese;
  public int clear;
  public int click;
  public int fail;
  public int fullScreenVoiceLongClick;
  public long fullScreenVoiceLongClickTime;
  public long initChoose;
  public int longClick;
  public long longClickTime;
  public int send;
  public int setDefaultLanguage;
  public int setSwitchCantonese;
  public int setlanguage;
  public int showInit;
  public int smileIconClick;
  public int textChangeCount;
  public int textChangeReturn;
  public long textChangeTime;
  public int textClick;
  public int voiceIconClick;
  public long voiceInputTime;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(79155);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.cancel);
      paramArrayOfObject.iz(2, this.send);
      paramArrayOfObject.iz(3, this.click);
      paramArrayOfObject.iz(4, this.longClick);
      paramArrayOfObject.ai(5, this.longClickTime);
      paramArrayOfObject.iz(6, this.textClick);
      paramArrayOfObject.iz(7, this.textChangeCount);
      paramArrayOfObject.ai(8, this.textChangeTime);
      paramArrayOfObject.iz(9, this.textChangeReturn);
      paramArrayOfObject.ai(10, this.voiceInputTime);
      paramArrayOfObject.iz(11, this.fail);
      paramArrayOfObject.iz(12, this.clear);
      paramArrayOfObject.iz(13, this.smileIconClick);
      paramArrayOfObject.iz(14, this.voiceIconClick);
      paramArrayOfObject.iz(15, this.fullScreenVoiceLongClick);
      paramArrayOfObject.ai(16, this.fullScreenVoiceLongClickTime);
      paramArrayOfObject.iz(17, this.showInit);
      paramArrayOfObject.ai(18, this.initChoose);
      paramArrayOfObject.iz(19, this.chooseArea);
      paramArrayOfObject.iz(20, this.chooseCantonese);
      paramArrayOfObject.iz(21, this.setlanguage);
      paramArrayOfObject.iz(22, this.setSwitchCantonese);
      paramArrayOfObject.iz(23, this.setDefaultLanguage);
      AppMethodBeat.o(79155);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.cancel) + 0 + e.a.a.b.b.a.bs(2, this.send) + e.a.a.b.b.a.bs(3, this.click) + e.a.a.b.b.a.bs(4, this.longClick) + e.a.a.b.b.a.o(5, this.longClickTime) + e.a.a.b.b.a.bs(6, this.textClick) + e.a.a.b.b.a.bs(7, this.textChangeCount) + e.a.a.b.b.a.o(8, this.textChangeTime) + e.a.a.b.b.a.bs(9, this.textChangeReturn) + e.a.a.b.b.a.o(10, this.voiceInputTime) + e.a.a.b.b.a.bs(11, this.fail) + e.a.a.b.b.a.bs(12, this.clear) + e.a.a.b.b.a.bs(13, this.smileIconClick) + e.a.a.b.b.a.bs(14, this.voiceIconClick) + e.a.a.b.b.a.bs(15, this.fullScreenVoiceLongClick) + e.a.a.b.b.a.o(16, this.fullScreenVoiceLongClickTime) + e.a.a.b.b.a.bs(17, this.showInit) + e.a.a.b.b.a.o(18, this.initChoose) + e.a.a.b.b.a.bs(19, this.chooseArea) + e.a.a.b.b.a.bs(20, this.chooseCantonese) + e.a.a.b.b.a.bs(21, this.setlanguage) + e.a.a.b.b.a.bs(22, this.setSwitchCantonese) + e.a.a.b.b.a.bs(23, this.setDefaultLanguage);
        AppMethodBeat.o(79155);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(79155);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        VoiceInputBehavior localVoiceInputBehavior = (VoiceInputBehavior)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(79155);
          break;
        case 1:
          localVoiceInputBehavior.cancel = locala.BTU.vd();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 2:
          localVoiceInputBehavior.send = locala.BTU.vd();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 3:
          localVoiceInputBehavior.click = locala.BTU.vd();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 4:
          localVoiceInputBehavior.longClick = locala.BTU.vd();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 5:
          localVoiceInputBehavior.longClickTime = locala.BTU.ve();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 6:
          localVoiceInputBehavior.textClick = locala.BTU.vd();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 7:
          localVoiceInputBehavior.textChangeCount = locala.BTU.vd();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 8:
          localVoiceInputBehavior.textChangeTime = locala.BTU.ve();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 9:
          localVoiceInputBehavior.textChangeReturn = locala.BTU.vd();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 10:
          localVoiceInputBehavior.voiceInputTime = locala.BTU.ve();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 11:
          localVoiceInputBehavior.fail = locala.BTU.vd();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 12:
          localVoiceInputBehavior.clear = locala.BTU.vd();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 13:
          localVoiceInputBehavior.smileIconClick = locala.BTU.vd();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 14:
          localVoiceInputBehavior.voiceIconClick = locala.BTU.vd();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 15:
          localVoiceInputBehavior.fullScreenVoiceLongClick = locala.BTU.vd();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 16:
          localVoiceInputBehavior.fullScreenVoiceLongClickTime = locala.BTU.ve();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 17:
          localVoiceInputBehavior.showInit = locala.BTU.vd();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 18:
          localVoiceInputBehavior.initChoose = locala.BTU.ve();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 19:
          localVoiceInputBehavior.chooseArea = locala.BTU.vd();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 20:
          localVoiceInputBehavior.chooseCantonese = locala.BTU.vd();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 21:
          localVoiceInputBehavior.setlanguage = locala.BTU.vd();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 22:
          localVoiceInputBehavior.setSwitchCantonese = locala.BTU.vd();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        case 23:
          localVoiceInputBehavior.setDefaultLanguage = locala.BTU.vd();
          AppMethodBeat.o(79155);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(79155);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.kvdata.VoiceInputBehavior
 * JD-Core Version:    0.6.2
 */