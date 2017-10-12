package fraang.traitsprototype1;

import static fraang.traitsprototype1.CatSoundSource.asSoundSource;
import static fraang.traitsprototype1.DogSoundSource.asSoundSource;

public final class TraitPrototype1 {
	public static void main(String[] args) {
		Cat cat = new Cat("miau");
		Dog dog = new Dog("wuff");

		asSoundSource(cat).emitSound();
		asSoundSource(dog).emitSound();

		emitSound(asSoundSource(cat));
		emitSound(asSoundSource(dog));
	}

	private static void emitSound(SoundSource<?> soundsource) {
		soundsource.emitSound();
	}
}
