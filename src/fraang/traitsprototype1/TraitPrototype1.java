package fraang.traitsprototype1;

import static fraang.traitsprototype1.CatSoundSource.asSoundSource;
import static fraang.traitsprototype1.DogSoundSource.asSoundSource;

public final class TraitPrototype1 {
	public static void main(String[] args) {
		final Cat cat = new Cat("miau");
		final Dog dog = new Dog("wuff");

		asSoundSource(cat).emitSound();
		asSoundSource(dog).emitSound();

		emitSound(asSoundSource(cat));
		emitSound(asSoundSource(dog));
	}

	private static void emitSound(final SoundSource<?> soundsource) {
		soundsource.emitSound();
	}
}
