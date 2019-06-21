package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class EmotionDesigner extends com.tencent.mm.bt.a
{
  public String BigImgUrl;
  public String Desc;
  public String Motto;
  public String SmallImgUrl;
  public String Title;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62539);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      if (this.SmallImgUrl != null)
        paramArrayOfObject.e(2, this.SmallImgUrl);
      if (this.BigImgUrl != null)
        paramArrayOfObject.e(3, this.BigImgUrl);
      if (this.Desc != null)
        paramArrayOfObject.e(4, this.Desc);
      if (this.Motto != null)
        paramArrayOfObject.e(5, this.Motto);
      AppMethodBeat.o(62539);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label483;
    label483: for (i = e.a.a.b.b.a.f(1, this.Title) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.SmallImgUrl != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.SmallImgUrl);
      i = paramInt;
      if (this.BigImgUrl != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.BigImgUrl);
      paramInt = i;
      if (this.Desc != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.Desc);
      i = paramInt;
      if (this.Motto != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.Motto);
      AppMethodBeat.o(62539);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(62539);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        EmotionDesigner localEmotionDesigner = (EmotionDesigner)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(62539);
          break;
        case 1:
          localEmotionDesigner.Title = locala.BTU.readString();
          AppMethodBeat.o(62539);
          paramInt = i;
          break;
        case 2:
          localEmotionDesigner.SmallImgUrl = locala.BTU.readString();
          AppMethodBeat.o(62539);
          paramInt = i;
          break;
        case 3:
          localEmotionDesigner.BigImgUrl = locala.BTU.readString();
          AppMethodBeat.o(62539);
          paramInt = i;
          break;
        case 4:
          localEmotionDesigner.Desc = locala.BTU.readString();
          AppMethodBeat.o(62539);
          paramInt = i;
          break;
        case 5:
          localEmotionDesigner.Motto = locala.BTU.readString();
          AppMethodBeat.o(62539);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(62539);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.EmotionDesigner
 * JD-Core Version:    0.6.2
 */