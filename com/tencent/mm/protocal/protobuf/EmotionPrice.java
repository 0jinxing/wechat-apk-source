package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public class EmotionPrice extends com.tencent.mm.bt.a
{
  public String IapProductId;
  public String Label;
  public String Number;
  public String Type;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62543);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Label == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Label");
        AppMethodBeat.o(62543);
        throw paramArrayOfObject;
      }
      if (this.Number == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Number");
        AppMethodBeat.o(62543);
        throw paramArrayOfObject;
      }
      if (this.Type == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Type");
        AppMethodBeat.o(62543);
        throw paramArrayOfObject;
      }
      if (this.Label != null)
        paramArrayOfObject.e(1, this.Label);
      if (this.Number != null)
        paramArrayOfObject.e(2, this.Number);
      if (this.Type != null)
        paramArrayOfObject.e(3, this.Type);
      if (this.IapProductId != null)
        paramArrayOfObject.e(4, this.IapProductId);
      AppMethodBeat.o(62543);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Label == null)
        break label560;
    label560: for (i = e.a.a.b.b.a.f(1, this.Label) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.Number != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.Number);
      i = paramInt;
      if (this.Type != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.Type);
      paramInt = i;
      if (this.IapProductId != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.IapProductId);
      AppMethodBeat.o(62543);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.Label == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Label");
          AppMethodBeat.o(62543);
          throw paramArrayOfObject;
        }
        if (this.Number == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Number");
          AppMethodBeat.o(62543);
          throw paramArrayOfObject;
        }
        if (this.Type == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Type");
          AppMethodBeat.o(62543);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(62543);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        EmotionPrice localEmotionPrice = (EmotionPrice)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62543);
          break;
        case 1:
          localEmotionPrice.Label = locala.BTU.readString();
          AppMethodBeat.o(62543);
          paramInt = i;
          break;
        case 2:
          localEmotionPrice.Number = locala.BTU.readString();
          AppMethodBeat.o(62543);
          paramInt = i;
          break;
        case 3:
          localEmotionPrice.Type = locala.BTU.readString();
          AppMethodBeat.o(62543);
          paramInt = i;
          break;
        case 4:
          localEmotionPrice.IapProductId = locala.BTU.readString();
          AppMethodBeat.o(62543);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62543);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.EmotionPrice
 * JD-Core Version:    0.6.2
 */