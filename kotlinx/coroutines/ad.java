package kotlinx.coroutines;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/CoroutineStart;", "", "(Ljava/lang/String;I)V", "isLazy", "", "isLazy$annotations", "()V", "()Z", "invoke", "", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "completion", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"})
public enum ad
{
  static
  {
    AppMethodBeat.i(118491);
    ad localad1 = new ad("DEFAULT", 0);
    BPN = localad1;
    ad localad2 = new ad("LAZY", 1);
    BPO = localad2;
    ad localad3 = new ad("ATOMIC", 2);
    BPP = localad3;
    ad localad4 = new ad("UNDISPATCHED", 3);
    BPQ = localad4;
    BPR = new ad[] { localad1, localad2, localad3, localad4 };
    AppMethodBeat.o(118491);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.ad
 * JD-Core Version:    0.6.2
 */